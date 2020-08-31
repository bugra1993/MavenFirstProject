package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_BeforeAfterClass {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("setup has run");

    }


    @Test
    public void test1() {

        driver.get("https://www.google.com/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        System.out.println("test1 has run");

    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
        System.out.println("teardown has run");
    }
}
