package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Tekrar_BeforeAfter_BestBuy {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before
    public void beforeTest() {
        driver.get("https://www.bestbuy.com/");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test1() {
        boolean doesContain = driver.getTitle().contains("Best");
        Assert.assertTrue(doesContain);

    }

    @Test
    public void test2() {
        WebElement logo = driver.findElement(By.className("logo"));
        boolean isDisplayed = logo.isDisplayed();
        Assert.assertTrue(isDisplayed);

    }

    @Test
    public void test3() {
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Mexico']"));
        boolean isDisplayed = logo.isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
