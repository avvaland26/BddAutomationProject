package org.example;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {
   LoadProp loadProp = new LoadProp();

    public void setUpBrowser()
    {

        String browserName ="firefox";
       // String browserName = loadProp.getProperty("browserName");
        String url = loadProp.getProperty("url");

        {
            if (browserName.equalsIgnoreCase("Chrome")) {
                // set browser method to help reuse it
                System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\BrowserDriver\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\BrowserDriver\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browserName.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver", "src\\test\\resources\\BrowserDriver\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            } else {
                System.out.println(" browser name is empty or wrong" + browserName);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.get(("https://demo.nopcommerce.com"));

        }

    }
        public void setCloseBrowser () {
            driver.close();
        }

    }