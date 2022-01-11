package stepDefinations;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSerachSteps {

    WebDriver driver =null;



    @Given("browser is open")
    public void browser_is_open() {

        String projectPath = System.getProperty("user.dir");
        System.out.println("Project Path is :"+projectPath);

        System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }
    @Given("user is on google page")
    public void user_is_on_google_page() {

        driver.get("https://google.com");

//        driver.navigate().to("https://google.com");
    }

    @When("User enters text in serach box")
    public void user_enters_text_in_serach_box() {

        driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Automation check");

    }
    @Then("User hits enter")
    public void user_hits_enter() {
        driver.findElement(By.xpath("//input[@title=\"Search\"]")).clear();

    }
    @Then("User gets result")
    public void user_gets_result() {
        driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Automation check");
        driver.findElement(By.xpath("//input[@title=\"Search\"]")).click();

    }
}
