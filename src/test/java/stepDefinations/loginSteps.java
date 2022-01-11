package stepDefinations;


import io.cucumber.java.en.*;

public class loginSteps {

    @Given("User is on login page")
    public void user_is_on_login_page() {
        System.out.println("Hello");

    }
    @When("User enters username and password")
    public void user_enters_username_and_password() {
        System.out.println("Hello 1");

    }
    @When("User click on login button")
    public void user_click_on_login_button() {
        System.out.println("Hello 2");
    }
    @Then("User lands on homepage")
    public void user_lands_on_homepage() {
        System.out.println("Hello 3");
    }

    @When("User enters user1 and pass1")
    public void user_enters_user1_and_pass1() {
        System.out.println("Hello 4");
    }

}
