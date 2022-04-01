package driversetup;

import io.github.bonigarcia.wdm.config.DriverManagerType;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseDriver extends ChromeDriverManager{

    //Allows for multithreaded runs of test
    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    //Private to force use of setup
    private BaseDriver(){}

    //Assumes system already has chrome installed
    public static void chromeSetup(){
        getInstance(DriverManagerType.CHROME).setup();
        driver.set(new ChromeDriver());
    }

    //Access to the driver
    public static WebDriver driver(){
        return driver.get();
    }

    //Shut the operation down
    public static void exit(){
        driver().close();
        driver.remove();
    }
}
