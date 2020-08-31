package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day08_BeforeAfterMethod {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        System.out.println("setup has run");

    }

    @Before // her test methodundan once calisir.
    public void before(){
        System.out.println("before method has run");
    }

    @Test
    public void test1() {
        System.out.println("test1 has run");
    }

    @Test
    public void test2() {
        System.out.println("test2 has run");
    }

    @After // her testten sonra calisir(Her test methodu icin calisir)
    public void after() {
        System.out.println("after method has run");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
        System.out.println("teardown has run");
    }


}
