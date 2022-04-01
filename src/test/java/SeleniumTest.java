import driverfunctions.GoogleFunctions;
import driversetup.BaseDriver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SeleniumTest extends StandardSetup {

    @Test
    void seleniumTest(){

            GoogleFunctions.google();

            GoogleFunctions.searchFor("RTS Labs");

            GoogleFunctions.clickOnFirstLink();

            Assertions.assertFalse(BaseDriver.driver().getCurrentUrl().contains("https://www.google.com"));

    }
}
