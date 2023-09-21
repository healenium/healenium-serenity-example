package starter.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://elenastepuro.github.io/test_env/index.html")
public class HealeniumTestPage extends PageObject {

    public HealeniumTestPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='change_id' and @type='text']")
    private WebElementFacade changeId;

    @FindBy(id = "Submit")
    private WebElementFacade submit;

    public boolean isPresent() {
        return changeId.isPresent();
    }

    public void clickSubmit() {
        submit.click();
    }

}
