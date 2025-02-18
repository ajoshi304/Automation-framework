package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Base_PO;
import pageObjects.Contact_Us_PO;

public class Contact_Us_Steps extends Base_PO {
      private Contact_Us_PO contact_us_po;

    public Contact_Us_Steps(Contact_Us_PO contact_us_po) {
        this.contact_us_po = contact_us_po;
    }

    @Given("I access the webdriver university contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        contact_us_po.navigateTo_WebDriverUniversity_Contact_Us_Page();
    }
    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contact_us_po.setUnique_FirstName();
    }
    @When("I enter unique last name")
    public void i_enter_unique_last_name() {
        contact_us_po.setUnique_LastName();
    }
    @When("I enter unique email address")
    public void i_enter_unique_email_address() {
        contact_us_po.setUnique_EmailAddress();
    }
    @When("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contact_us_po.setUnique_Comment();
    }

    @When("I click on submit button")
    public void i_click_on_submit_button() {
        contact_us_po.clickOn_Submit_Button();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        contact_us_po.validate_Successful_SubmissionMessage_Text();
    }


    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_firstName(String firstName) {
        contact_us_po.setSpecific_FirstName(firstName);
    }

    @And("I enter a specific last name {word}")
    public void i_enter_a_specific_lastName(String lastName) {
        contact_us_po.setSpecific_LastName(lastName);
    }

    @And("I enter specific email address {word}")
    public void i_enter_a_specific_email_Address(String email) {
        contact_us_po.setSpecific_EmailAddress(email);
    }

    @And("I enter a specific comment {string}")
        public void i_enter_a_specific_comment(String comment) {
        contact_us_po.setSpecific_Comment(comment);
    }
}
