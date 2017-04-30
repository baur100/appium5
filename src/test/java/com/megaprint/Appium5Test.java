package com.megaprint;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Baurz on 4/19/2017.
 */
public class Appium5Test {
    DesiredCapabilities cap=new DesiredCapabilities();
    AndroidDriver<AndroidElement> driver;
    @BeforeMethod
    public void init() throws MalformedURLException {
//      File path= new File("data");
//      File file=new File(path,"ApiDemos-debug.apk");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android device");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"25");
//      cap.setCapability(MobileCapabilityType.APP,file.getAbsolutePath());
        cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "my.bhul.video.player");
        cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"my.bhul.video.player.gui.MainActivity");
        driver=new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"),cap);
    }
    @Test
    public void test(){
        System.out.println("Hello, World");
    }

}
