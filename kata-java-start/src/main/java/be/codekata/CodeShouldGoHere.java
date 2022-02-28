package be.codekata;

//public class CodeShouldGoHere {
//}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class HelloSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Users/Ilias/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.be/");
        WebElement search = driver.findElement(By.name("q"));
//        WebElement button = driver.findElement(By.name("btnK"));
        WebElement agree = driver.findElement(By.id("L2AGLb"));

        agree.click();

        search.sendKeys("gg");

        search.submit();

        driver.quit();
    }
}

