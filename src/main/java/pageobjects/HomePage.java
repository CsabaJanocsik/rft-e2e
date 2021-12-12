package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import factory.WebDriverFactory;
@Component
public class HomePage extends CommonPageObject {
    private static final String HOME_PAGE_URL = "http://localhost:8080/student-course/swagger-ui.html#/";


       public HomePage(final WebDriverFactory factory) {
        super(factory);
    }

    public void navigateToHomePage() {
        navigateToUrl(HOME_PAGE_URL);
    }

   }