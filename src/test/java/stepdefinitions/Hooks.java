package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    Actions actions;
    WebDriverWait wait;

    @Before
    public void setup() {
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        actions = new Actions(Driver.getDriver());
        wait = new WebDriverWait(Driver.getDriver(), 10);
    }

    @After
    public void tearDown(Scenario scenario) {

        //screenshot almak icin
        final byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        //Her fail olan scenario'dan sonra screenshot almaliyiz.
        //Scenario fail olursa image ekleyelim
        if (scenario.isFailed()) {
            scenario.embed(screenshot, "image/png");
        }
    }

}
