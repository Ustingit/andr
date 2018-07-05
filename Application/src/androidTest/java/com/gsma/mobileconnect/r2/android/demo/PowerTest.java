//package com.gsma.mobileconnect.r2.android.demo;
//
//import android.support.test.rule.ActivityTestRule;
//import android.support.test.runner.AndroidJUnit4;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentTransaction;
//
//import com.gsma.mobileconnect.r2.android.demo.activity.MainActivity;
//import com.gsma.mobileconnect.r2.android.demo.fragments.BaseAuthFragment;
//import com.gsma.mobileconnect.r2.android.main.MobileConnectAndroidView;
//
//import org.junit.Before;
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.powermock.api.mockito.PowerMockito;
//import org.powermock.core.classloader.annotations.PrepareForTest;
//import org.powermock.modules.junit4.PowerMockRunner;
//
//import static android.support.test.InstrumentationRegistry.getInstrumentation;
//import static org.junit.Assert.assertNotNull;
//import static org.powermock.api.mockito.repackaged.asm.util.CheckClassAdapter.verify;
//
///**
// * Created by y.ustinovich on 28.06.2018.
// */
//@RunWith(AndroidJUnit4.class)
//@PrepareForTest(ClassForTesting.class)
//public class PowerTest {
//
//    private ClassForTesting classForTesting;
//
//    @Rule
//    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);
//    private MainActivity mainActivity = null;
//    BaseAuthFragment fragment = null;
//
//    @Before
//    public void setUp() {
//        classForTesting = new ClassForTesting();
//        mainActivity = mActivityRule.getActivity();
//        assertNotNull(mainActivity);
//        FragmentManager fragmentManager = mainActivity.getSupportFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.add(fragment, null);
//        fragmentTransaction.commit();
//        getInstrumentation().waitForIdleSync();
//    }
//
//    @Test(expected=AssertionError.class)
//    public void mockConstruction() throws Exception {
//        //prepare
////        XxxService service = new XxxService();
////        XxxUtil util = new XxxUtil();
////        String name = "hello";
////        util.setName(name);
////        PowerMockito.whenNew(XxxUtil.class).withNoArguments().thenReturn(util);
////
////        //action
////        XxxUtil res = service.getUtil();
////
////        //assert
////        assertEquals(name, res.getName());
//
//        ClassForTesting myClass = PowerMockito.spy(classForTesting);
//        PowerMockito.doThrow(new AssertionError()).when(myClass, "setupMobileConnect", true);
//        classForTesting.connectMobileWithoutDiscovery();
//    }
//}
