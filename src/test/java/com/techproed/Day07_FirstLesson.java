package com.techproed;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Day07_FirstLesson {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.amazon.com/");
        driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        WebElement shipping = driver.findElement(By.xpath("//input[@type='submit']"));
        shipping.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("samsung headphones" + Keys.ENTER);

        WebElement searchText = driver.findElement(By.xpath("//span[@dir='auto']"));
        System.out.println(searchText.getText());

        // WebElement firstProduct = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
        // System.out.println(firstProduct.getText());
        // firstProduct.click();

        List<WebElement> allProducts = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

        for (WebElement w : allProducts) {
            System.out.println(w.getText());
        }


    }
}
