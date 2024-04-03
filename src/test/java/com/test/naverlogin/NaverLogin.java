package com.test.naverlogin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class NaverLogin {
    private WebDriver driver;
    private WebElement element;
    private String Url;

    public static String WEB_DRIVER_ID= "webdriver.chrome.driver";
    public static String WEB_DRIVER_PATH= "D:\\Selenium_Java\\chromedriver-win32";
    public static String Chrome_PATH= "D:\\Selenium_Java\\chrome-win32";

    public NaverLogin(){
        System.setProperty(WEB_DRIVER_ID,WEB_DRIVER_PATH);

        ChromeOptions options = new ChromeOptions();
        options.setBinary(Chrome_PATH);
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");

        driver = new ChromeDriver(options);
        Url = "https://www.naver.com/";
    }

    public void active() {
        try{
            driver.get(Url);

            element = driver.findElement(By.className("link_login"));
            element.click();


            element = driver.findElement(By.id("id"));
            element.sendKeys("shark1011");

            element = driver.findElement(By.id("pw"));
            element.sendKeys("&ianyang2010");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void main(String[]args)
    {
        NaverLogin bot1= new NaverLogin();
        bot1.active();
    }
}

