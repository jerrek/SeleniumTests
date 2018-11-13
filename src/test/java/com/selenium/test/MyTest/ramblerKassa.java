package com.selenium.test.MyTest;

import com.selenium.test.webtestsbase.WebDriverFactory;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by kschegolev on 15.02.2018.
 */
public class ramblerKassa {
    private static final String PAGE_URL = "https://kassa.rambler.ru/msk/movie";

    @Before
    public void beforeTest() {
        WebDriverFactory.startBrowser(true);
    }
    @Test
    public void test() throws Exception{
        WebDriver driver = WebDriverFactory.getDriver();
        driver.get(PAGE_URL);
        driver.manage().window().maximize();
        driver.findElement(By.id("mainpage-search")).sendKeys() ;
        driver.findElement(By.className("btn_text10")).click();
        driver.findElement(By.className("s-creation-block-place-item")).click();
        driver.findElement(By.xpath("//li[@class='date_item']/span[@class='date_link']/time[@class='date_item__time']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class='rasp_list']/ul[@class='rasp_time']/li[@class='btn_rasp']")).click();
    }

}
