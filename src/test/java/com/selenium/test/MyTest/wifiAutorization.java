package com.selenium.test.MyTest;

import com.selenium.test.webtestsbase.WebDriverFactory;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by kschegolev on 28.01.2018.
 */
public class wifiAutorization {
    private static final String PAGE_URL = "https://vk.com";

    @Before
    public void beforeTest() {
        WebDriverFactory.startBrowser(true);
    }
    @Test
        public void test() throws Exception {
        WebDriver driver = WebDriverFactory.getDriver();
        driver.get(PAGE_URL);
        driver.manage().window().maximize();
        driver.findElement(By.id("overridelink")).click();
        driver.findElement(By.id("ui_login_self_reg_button")).click();
        driver.findElement(By.id("guestUser.fieldValues.ui_first_name")).sendKeys("Кирилл");
        driver.findElement(By.id("guestUser.fieldValues.ui_last_name")).sendKeys("Щеголев");
        driver.findElement(By.id("guestUser.fieldValues.ui_phone_number")).sendKeys("89168161451");
        driver.findElement(By.id("ui_self_reg_submit_button")).click();

    }
}
