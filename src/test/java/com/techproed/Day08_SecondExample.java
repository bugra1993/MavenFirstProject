package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_SecondExample {
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
        driver.get("https://www.google.com/");

    }

    @After
    public void afterClass() {
        WebElement resultCount = driver.findElement(By.id("result-stats"));
        System.out.println(resultCount.getText());

    }

    @Test
    public void test1() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("book");
        searchBox.submit();

    }

    @Test
    public void test2() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple airpods");
        searchBox.submit();
    }

    @Test
    public void test3() {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("kindle");
        searchBox.submit();
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
