package com.pype.closeout.testsuite.drivers;

import java.io.File;

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
            	String exepath = "C:\\Users\\DELL\\Desktop\\driver\\chromedriver.exe";
        		//System.setProperty("webdriver.chrome.driver", exePath);
            	
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