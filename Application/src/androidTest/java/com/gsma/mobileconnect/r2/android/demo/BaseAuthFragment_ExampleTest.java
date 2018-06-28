package com.gsma.mobileconnect.r2.android.demo;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.test.ActivityInstrumentationTestCase2;

import com.gsma.mobileconnect.r2.android.demo.activity.MainActivity;
import com.gsma.mobileconnect.r2.android.demo.fragments.BaseAuthFragment;
import com.gsma.mobileconnect.r2.android.main.MobileConnectAndroidView;
import com.gsma.mobileconnect.r2.discovery.DiscoveryResponse;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.core.deps.guava.base.CharMatcher.isNot;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by y.ustinovich on 20.06.2018.
 */
@RunWith(AndroidJUnit4.class)
public class BaseAuthFragment_ExampleTest extends BaseAuthFragment{

    @Override
    public void onComplete(DiscoveryResponse discoveryResponse) {}

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
    private MainActivity mainActivity = null;
    BaseAuthFragment fragment = null;

    @Before
    public void setUp() {
        //MockitoAnnotations.initMocks(this);
        mainActivity = mActivityRule.getActivity();
    }

    @After
    public void setDown() {
        mainActivity = null;
        fragment = null;
    }

    @Test
    public void connectMobileWithoutDiscovery_Test() throws Exception {
        assertNotNull(mainActivity);
        FragmentManager fragmentManager = mainActivity.getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragment = new BaseAuthFragment_ExampleTest();
        MobileConnectAndroidView as = BaseAuthFragment.mobileConnectAndroidView;
        fragmentTransaction.add(fragment, null);
        fragmentTransaction.commit();

        getInstrumentation().waitForIdleSync();

        //fragment.connectMobileDemo();
        MobileConnectAndroidView as2 = BaseAuthFragment.mobileConnectAndroidView;
        assertThat(as, is(as2));
        //Assert.assertNotEquals(as, as2);
    }
}
