package com.masteringselenium;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverFactory {

    private RemoteWebDriver webDriver;

    private final String operatingSystem = System.getProperty("os.name").toUpperCase();
    private final String systemArchitecture = System.getProperty("os.arch");

    RemoteWebDriver getDriver() {
        if (null == webDriver) {
            System.out.println(" ");
            System.out.println("Current thread: " + Thread.currentThread().getId());
            System.out.println("Current Operating System: " + operatingSystem);
            System.out.println("Current Architecture: " + systemArchitecture);
            System.out.println("Current Browser Selection: Firefox");
            System.out.println(" ");
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }

    void quitDriver() {
        if (null != webDriver) {
            webDriver.quit();
            webDriver = null;
        }
    }
}
