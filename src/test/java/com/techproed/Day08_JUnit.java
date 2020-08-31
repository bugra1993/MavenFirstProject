package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day08_JUnit {

    @Test
    public void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);

        driver.quit();

    }

    @Test
    @Ignore
    public void test2() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("https://www.amazon.com/");
        driver.manage().window().fullscreen();
        driver.quit();
    }
    @Test
    public void test3(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
        driver.get("https://www.youtube.com/");
        driver.manage().window().fullscreen();
        driver.quit();
    }


}
