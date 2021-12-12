package stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LocalhostSteps {
    WebDriver driver =null;

    @Given("browser is open")
    public void browser_is_open() {
        System.out.println("Inside Step - browser is open");

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is: " + projectPath);

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @And("user in localhost:8080")
    public void user_in_localhost_8080(){

        driver.navigate().to("http://localhost:8080/student-course/swagger-ui.html#/student-course-registration-controller");
    }
    @When("user click on StudentCourseRegistrationController")
    public void user_clicks_on_StudentRegistrationController(){
        driver.findElement(By.id("operations-tag-student-course-registration-controller")).click();
    }
    @And("user click on addStudent")
    public void user_clicks_on_addStudent(){
        driver.findElement(By.id("operations-student-course-registration-controller-addStudentUsingPOST")).click();
    }
    @And("user click on Tryitout")
    public void user_clicks_on_tryitout(){
        driver.findElement(By.className("btn try-out__btn")).click();
    }
    @Then("user is navigated to Execute")
    public void user_navigated_to_execute(){
        driver.findElement(By.className("btn execute opblock-control__btn")).isDisplayed();

        driver.close();
        driver.quit();
    }
}
