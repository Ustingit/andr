package com.gsma.mobileconnect.impl;

import com.gsma.mobileconnect.cache.IDiscoveryCache;
import com.gsma.mobileconnect.discovery.IDiscovery;
import com.gsma.mobileconnect.discovery.IParsedDiscoveryRedirectCallback;
import com.gsma.mobileconnect.discovery.ParsedDiscoveryRedirect;
import com.gsma.mobileconnect.utils.HttpUtils;
import com.gsma.mobileconnect.utils.RestClient;
import com.gsma.mobileconnect.utils.ValidationUtils;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

/**
 * An Android specific implementation of the Discovery Service. It extends the implementation from the Java SDK
 * but overrides code that is incompatible with Android.
 * Created by nick.copley on 26/02/2016.
 */
public class AndroidDiscoveryImpl extends DiscoveryImpl implements IDiscovery
{

    public AndroidDiscoveryImpl(final IDiscoveryCache discoveryCache, final RestClient restClient)
    {
        super(discoveryCache, restClient);
    }

    @Override
    public void parseDiscoveryRedirect(final String redirectURL, final IParsedDiscoveryRedirectCallback callback) throws
                                                                                                                  URISyntaxException
    {
        ValidationUtils.validateParameter(redirectURL, "redirectURL");
        ValidationUtils.validateParameter(callback, "callback");
        final URI uri = new URI(redirectURL);
        final String query = uri.getQuery();
        if (query == null)
        {
            callback.completed(new ParsedDiscoveryRedirect(null, null, null));
        }
        else
        {
            final List<NameValuePair> parameters = URLEncodedUtils.parse(uri, "UTF-8");

            final String mcc_mnc = HttpUtils.getParameterValue(parameters, "mcc_mnc");
            final String subscriber_id = HttpUtils.getParameterValue(parameters, "subscriber_id");
            String mcc = null;
            String mnc = null;
            if (mcc_mnc != null)
            {
                final String[] parts = mcc_mnc.split("_");
                if (parts.length == 2)
                {
                    mcc = parts[0];
                    mnc = parts[1];
                }
            }

            callback.completed(new ParsedDiscoveryRedirect(mcc, mnc, subscriber_id));
        }
    }
}