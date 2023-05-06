import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumBasics {
    @Test
    public void AppiumTest() throws MalformedURLException {
        /** appium architecture
         * Appium Code -> appium Server -> device
         * */
        /*********************************************************************/
        /**
         * third, define the capabilities for the uiautomator2
         * capabilities => [device name, app name,.....]
         * */
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Device1"); // we go the device name through the android studio after installing it.


        /******************************************************************/
        /**
         * firstly, we run the appium server to know the appium port number through this command [appium]
         * secondly, we declare the android driver
         * it takes 2 args [1- url for the port number, 2- capabilities ]
         * */
        AndroidDriver androidDriver=new AndroidDriver(new URL("http://127.0.0.0:4723"),null);
    }
}
