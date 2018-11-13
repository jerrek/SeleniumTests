//package com.selenium.test.MyTest;
//
////import com.selenium.test.junit.rules.ScreenShotOnFailRule;
//
//import com.selenium.test.webtestsbase.BasePage;
//import com.selenium.test.webtestsbase.WebDriverFactory;
//import org.junit.*;
//import com.selenium.*;
//import org.openqa.selenium.*;
//
//import java.awt.*;
//import java.awt.event.KeyEvent;
//
//
///**
// * Created by kshegolev on 10.01.2018.
// */
//public class SeleniumTest {
//    private static final String PAGE_URL = "https://vk.com";
//    int timeout = 0;
//
//    @Before
//    public void beforeTest() {
//        WebDriverFactory.startBrowser(true);
//    }
//
//    @Test
//    public void test() throws Exception {
//        Robot robot = new Robot();
//        WebDriver driver = WebDriverFactory.getDriver();
//        driver.get(PAGE_URL);
//        driver.manage().window().maximize();
//        Thread.sleep(timeout);
//        driver.findElement(By.id("index_email")).click();;
//        driver.findElement(By.id("index_email")).sendKeys();
//        Thread.sleep(timeout);
//        driver.findElement(By.id("index_pass")).sendKeys();
//        Thread.sleep(timeout);
//        driver.findElement(By.id("index_login_button")).click();
//        Thread.sleep(timeout);
//        driver.findElement(By.id("l_msg")).click();
//        Thread.sleep(timeout);
//        driver.findElement(By.id("im_dialogs_search")).sendKeys();
//        Thread.sleep(timeout+20000);
//
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        driver.findElement(By.id("im_editable0")).sendKeys("Привет!");
//        Thread.sleep(timeout);
//        pressButtonSend();
//        Thread.sleep(timeout);
//        driver.findElement(By.id("im_editable0")).sendKeys("Я тут развлекаюсь с Selenium =))");
//        Thread.sleep(timeout);
//        pressButtonSend();
//        Thread.sleep(timeout);
//        driver.findElement(By.id("im_editable0")).sendKeys("Это написано тебе, через автотест)");
//        Thread.sleep(timeout);
//        pressButtonSend();
//        Thread.sleep(timeout);
//        driver.findElement(By.id("im_editable0")).sendKeys("Теперь я повелитель автоматизации! Мне подвластен весь интернет!");
//        Thread.sleep(timeout);
//        pressButtonSend();
//        Thread.sleep(timeout);
//        driver.findElement(By.id("im_editable0")).sendKeys("Мухахахаха!!!!!");
//        Thread.sleep(timeout);
//        pressButtonSend();
//        Thread.sleep(timeout);
//    }
//
//    public void pressButtonSend() throws Exception {
//        WebDriver driver = WebDriverFactory.getDriver();
//        driver.findElement(By.xpath(".//button[@class='im-send-btn im-chat-input--send _im_send im-send-btn_send']")).click();
//        Thread.sleep(5000);
//    }
//}
