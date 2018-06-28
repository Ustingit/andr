//import com.gsma.mobileconnect.r2.android.demo.fragments.BaseAuthFragment;
//import com.gsma.mobileconnect.r2.android.main.MobileConnectAndroidView;
//import com.gsma.mobileconnect.r2.discovery.DiscoveryResponse;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.runners.MockitoJUnitRunner;
//
//import static org.hamcrest.core.Is.is;
//import static org.junit.Assert.assertThat;
//import static org.mockito.Mockito.verify;
//
///**
// * Created by y.ustinovich on 21.06.2018.
// */
//@RunWith(MockitoJUnitRunner.class)
//public class BaseAuthFragment_UnitTestExample{
//
//    private BaseAuthFragment ad = new BaseAuthFragment() {
//        @Override
//        public void onComplete(DiscoveryResponse discoveryResponse) {
//
//        }
//    };
//
//    @Test
//    public void readStringFromContext_LocalizedString() {
//        MobileConnectAndroidView asd = ad.mobileConnectAndroidView;
//        ad.connectMobileWithoutDiscovery();
//        MobileConnectAndroidView asd2 = ad.mobileConnectAndroidView;
//        assertThat(asd, is(asd2));
//
//        assertThat("465678", is("465678"));
//    }
//
//    @Test
//    public void connectMobileDemoBehaviorTest() {
//        MobileConnectAndroidView oldConfig = BaseAuthFragment.mobileConnectAndroidView;
//
//        verify(ad).connectMobileDemo();
//    }
//}
