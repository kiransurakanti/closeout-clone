package com.pype.closeout.testsuite.drivers;

public class DriverManagerFactory {

    public static DriverManager getManager(DriverType type) {

        DriverManager driverManager;

        switch (type) {
//            case SAFARI:
//                driverManager = new ChromeDriverManager();
//                break;
//            case FIREFOX:
//                driverManager = new FirefoxDriverManager();
//                break;
            default:
                driverManager = new ChromeDriverManager();
                break;
        }
        return driverManager;

    }
}
