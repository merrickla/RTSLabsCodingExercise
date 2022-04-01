import driversetup.BaseDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class StandardSetup {

    @BeforeEach
    private void setup(){
        BaseDriver.chromeSetup();
    }

    @AfterEach
    private void close(){
        BaseDriver.exit();
    }

}
