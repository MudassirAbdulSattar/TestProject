import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import  org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ConnectionString {

    AppiumDriver driver;

    @BeforeClass
    public void setUp() {
        try {

            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "PL2GAR9832707165");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
            capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Mudassir A Sattar\\Apk\\Attendance Manager_v1.0.apk");
            capabilities.setCapability(MobileCapabilityType.NO_RESET, true);

            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AndroidDriver<MobileElement>(url, capabilities);
            driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

        } catch (Exception ex) {
            System.out.println("Cause is " + ex.getCause());
            System.out.println(("Message is :" + ex.getMessage()));
            ex.printStackTrace();
        }
    }

    @AfterTest
    public void TearDown() {
        try {
            driver.quit();
            System.out.println("Now Application");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}


