package com.qa.steps;

import java.awt.AWTException;

import com.qa.pages.SetupInterviewPage;
import com.qa.util.TestBase;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SetupInterviewDef extends TestBase {

	SetupInterviewPage setupInteriew = new SetupInterviewPage(driver);

	@When("user click on Setup Interview")
	public void user_click_on_setup_interview() throws InterruptedException {
		setupInteriew.user_click_on_setup_interview();

	}

	@When("user clicks on Interview Kit")
	public void user_clicks_on_interview_kit() throws InterruptedException {

		setupInteriew.user_clicks_on_interview_kit();

	}

	@Then("user have to see the Interview Listing page")
	public void user_have_to_see_the_interview_listing_page() {

		setupInteriew.user_have_to_see_the_interview_listing_page();

	}

	@When("user click on Add Interview Kit")
	public void user_click_on_add_interview_kit() throws InterruptedException, AWTException {

		setupInteriew.user_click_on_add_interview_kit();

	}

	// *********************Adding Pre-defined Interview Kit*******************

	@When("user click on Add Interview")
	public void user_click_on_add_interview() throws InterruptedException {

		setupInteriew.user_click_on_add_interview();

	}

	@When("user click on Predefined Interview Kit")
	public void user_click_on_predefined_interview_kit() throws InterruptedException {

		setupInteriew.user_click_on_predefined_interview_kit();

	}

	@When("user select one of the Interview Kit")
	public void user_select_one_of_the_interview_kit() throws InterruptedException {

		setupInteriew.user_select_one_of_the_interview_kit();

	}

	@When("user click on next button")
	public void user_click_on_next_button() throws InterruptedException {

		setupInteriew.user_click_on_next_button();

	}

	@When("user click on Save kit button")
	public void user_click_on_save_kit_button() {

		setupInteriew.user_click_on_save_kit_button();

	}

	@Then("user view the added Intervie Kit in Interview Listing page")
	public void user_view_the_added_intervie_kit_in_interview_listing_page() {

		setupInteriew.user_view_the_added_intervie_kit_in_interview_listing_page();

	}

	// **************************Adding video question default Create Own
	// Kit*****************************

	@When("user click on Create own Kit")
	public void user_click_on_create_own_kit() throws InterruptedException {

	}

	@When("user enter title of kit")
	public void user_enter_title_of_kit() throws InterruptedException {

	}

	@Then("user click on Video question")
	public void user_click_on_video_question() throws InterruptedException, AWTException {

	}

	// ********************Adding Interview through Flexible******************************

	@When("user click on Create you own")
	public void user_click_on_create_you_own() throws InterruptedException {

		setupInteriew.user_click_on_create_you_own();

	}

	@When("enter title of interview")
	public void enter_title_of_interview() throws InterruptedException {

		setupInteriew.enter_title_of_interview();

	}

	@Then("user select flexible to add interview question")
	public void user_select_flexible_to_add_interview_question() throws InterruptedException, AWTException {

		setupInteriew.user_select_flexible_to_add_interview_question();

	}
	
	// ********************Adding Interview through Timed******************************
    @Then("user select Timed and set time to add interview questions")
    public void user_select_timed_and_set_time_to_add_interview_questions() throws InterruptedException, AWTException {
    	
    	setupInteriew.user_select_timed_and_set_time_to_add_interview_questions();
    	
    }
    //***********Schedule the Interview****************
    
    @When("user click on Schedule Interview")
    public void user_click_on_schedule_interview() throws InterruptedException {
    	
    	setupInteriew.user_click_on_schedule_interview();
    	
    }   

    @When("user enter detail in setup interview page")
    public void user_enter_detail_in_setup_interview_page() throws InterruptedException, AWTException {
       
    	setupInteriew.user_enter_detail_in_setup_interview_page();
    }

    @Then("user click on send button")
    public void user_click_on_send_button() {
   
    }

}
