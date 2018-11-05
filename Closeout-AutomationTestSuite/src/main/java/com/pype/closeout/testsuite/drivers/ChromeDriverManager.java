package com.pype.closeout.testsuite.drivers;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverManager extends DriverManager {

    private ChromeDriverService chService;

    @Override
    public void startService() {
        if (null == chService) {
            try {
            	//String exePath = "C:\\Wrokspace\\AutomationTestSuit\\resources\\chromedriver.exe";
            	//System.setProperty("webdriver.chrome.driver", exePath);
            	Properties property = new Properties();
                property.load(new FileInputStream("config.properties"));
                String exepath =  property.getProperty("chrome.driver.path");//"C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe";
                chService = new ChromeDriverService.Builder()
                    .usingDriverExecutable(new File(exepath))
                    .usingAnyFreePort()
                    .build();
                chService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stopService() {
        if (null != chService && chService.isRunning())
            chService.stop();
    }

	@SuppressWarnings("deprecation")
	@Override
    public void createDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(chService, capabilities);
    }

}