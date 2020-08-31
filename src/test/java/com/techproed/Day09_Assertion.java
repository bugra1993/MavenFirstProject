package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day09_Assertion {

    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


    }

    @Test
    public void test1() {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();
        Assert.assertEquals("Google Arama Sayfasi", title);

    }

    @Test
    public void test2() {
        driver.get("https://www.amazon.com/");
        String aTitle = driver.getTitle();
        boolean isContains = aTitle.contains("Amazon");
        Assert.assertTrue(isContains);

    }

    @Test

    public void test3() {
        driver.get("https://www.facebook.com/");
        String title = driver.getTitle();

        boolean isContain = title.contains("Youtube");
        Assert.assertFalse(isContain);// False oldugunu dogrula(Beklentim false)

    }


    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @Test
    public void test4() {
        driver.get("https://www.google.com/");
        String title = driver.getTitle();

        System.out.println("merhabalar...");
        Assert.assertEquals("google arama sayfasi", title);


    }


}
