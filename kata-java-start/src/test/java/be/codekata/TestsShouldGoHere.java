package be.codekata;

import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class TestsShouldGoHere {

    @Test
    public void failingTest(){
        assertThat(false,equalTo(true));
    }

    @Test
    public void passingTest(){
        assertThat(true,equalTo(true));
    }

    @Test
    public void searchTest() throws InterruptedException {
        setChromeDriverLocation();
        WebDriver driver = new  ChromeDriver();

        driver.get("https://www.hln.be/");

        driver.switchTo().frame("sp_message_iframe_609148");

        WebElement cookies = driver.findElement(By.xpath("//*[@id=\"notice\"]/div[3]/button[1]"));
        cookies.click();


        WebElement searchButton = driver.findElement(By.xpath("/html/body/header/section[3]/div[1]/div/nav/div[1]/div/label/span"));
        searchButton.click();

        WebElement searchtab = driver.findElement(By.xpath("/html/body/header/section[3]/div[2]/div[2]/div/form/input"));
        searchtab.sendKeys("turnhout");

        WebElement submitButton = driver.findElement(By.className("submit"));
        submitButton.click();

        driver.quit();

    }

    private void setChromeDriverLocation() {
        System.setProperty("webdriver.chrome.driver","C:/Users/Ilias/Downloads/chromedriver_win32/chromedriver.exe");
    }
}
