package com.selenium.test.MyTest;

//import com.selenium.test.junit.rules.ScreenShotOnFailRule;
import com.selenium.test.webtestsbase.BasePage;
import com.selenium.test.webtestsbase.WebDriverFactory;
import org.junit.*;
import com.selenium.*;
import org.openqa.selenium.*;

import java.awt.*;
import java.awt.event.KeyEvent;


/**
 * Created by kshegolev on 10.01.2018.
 */
public class SeleniumTest {
    private static final String PAGE_URL = "https://vk.com";

    @Before
    public void beforeTest() {
        WebDriverFactory.startBrowser(true);
    }
    @Test
    public void test() throws Exception{
        WebDriver driver = WebDriverFactory.getDriver();
        driver.get(PAGE_URL);
        driver.manage().window().maximize();
        driver.findElement(By.id("index_email")).sendKeys("");
        driver.findElement(By.id("index_pass")).sendKeys("");
        driver.findElement(By.id("index_login_button")).click();
        driver.findElement(By.id("l_msg")).click();
        driver.findElement(By.id("im_dialogs_search")).sendKeys("Сергей Бесхмельницын");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.id("im_editable0")).sendKeys("Привет!");
        pressButtonSend();
        driver.findElement(By.id("im_editable0")).sendKeys("Я тут развлекаюсь с Selenium =))");
        pressButtonSend();
        driver.findElement(By.id("im_editable0")).sendKeys("Это написано тебе, через автотест)");
        pressButtonSend();
        driver.findElement(By.id("im_editable0")).sendKeys("Теперь я повелитель автоматизации! Мне подвластен весь интернет!");
        pressButtonSend();
        driver.findElement(By.id("im_editable0")).sendKeys("Мухахахаха!!!!!");
        pressButtonSend();

    }

    public void pressButtonSend() throws Exception{
        WebDriver driver = WebDriverFactory.getDriver();
        driver.findElement(By.xpath(".//button[@class='im-send-btn im-chat-input--send _im_send im-send-btn_send']")).click();
        Thread.sleep(5000);
    }
}
