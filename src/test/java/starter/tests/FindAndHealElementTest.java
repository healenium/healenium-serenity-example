package starter.tests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;
import starter.steps.TestEnvSteps;

@ExtendWith(SerenityJUnit5Extension.class)
class FindAndHealElementTest {

    @Managed
    WebDriver driver;

    @Steps
    TestEnvSteps testEnvSteps;

    @Test
    public void googleSearchPassTest() {
        testEnvSteps.openPage();
        testEnvSteps.findElement();
        testEnvSteps.clickOnSubmit();
        testEnvSteps.findElement();
    }

}
