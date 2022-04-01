package driverfunctions;

import driversetup.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Functions {

    private Functions(){}

    private static final WebDriverWait wait = new WebDriverWait(BaseDriver.driver(), Duration.ofSeconds(10));

    public static void navigate(String url){
        BaseDriver.driver().get(url);
    }

    public static void sendKeys(String xpath, String keys){
        waitUntilXPathClickable(xpath).sendKeys(keys);
    }

    public static void hitEnter(String xpath){
        waitUntilXPathClickable(xpath).sendKeys(Keys.ENTER);
    }

    public static void click(String xpath){
        waitUntilXPathClickable(xpath).click();
    }

    public static void waitForPageToLoad(){
        waitUntilXPathClickable(".//body");
    }

    private static WebElement waitUntilXPathClickable(String xpath){
        return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
    }


}
