package com.gsma.mobileconnect.r2.android.demo;

import com.gsma.mobileconnect.r2.MobileConnect;
import com.gsma.mobileconnect.r2.MobileConnectConfig;
import com.gsma.mobileconnect.r2.MobileConnectInterface;
import com.gsma.mobileconnect.r2.MobileConnectStatus;
import com.gsma.mobileconnect.r2.MobileConnectWebInterface;
import com.gsma.mobileconnect.r2.android.compatibility.AndroidMobileConnectEncodeDecoder;
import com.gsma.mobileconnect.r2.android.demo.fragments.BaseAuthFragment;
import com.gsma.mobileconnect.r2.android.main.MobileConnectAndroidView;
import com.gsma.mobileconnect.r2.discovery.DiscoveryResponse;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * Created by y.ustinovich on 28.06.2018.
 */

public class ClassForTesting extends BaseAuthFragment {

    @Override
    public void onComplete(DiscoveryResponse discoveryResponse) {
    }

    MobileConnectStatus mobileConnectConfig = super.mobileConnectStatus;

    private void setupMobileConnect (boolean isWithoutDiscovery) {

    }
}
