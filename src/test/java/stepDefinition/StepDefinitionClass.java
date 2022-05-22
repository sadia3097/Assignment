package stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AddNewCoupanPage;
import pages.CoupansPage;
import pages.DashboardPage;
import pages.LoginPage;

public class StepDefinitionClass {
	
	LoginPage loginPage= new LoginPage();
	DashboardPage dashboard=new DashboardPage();
	CoupansPage coupans=new CoupansPage();
	AddNewCoupanPage addnewcoupan=new AddNewCoupanPage();
	
	@Given("User navigated to the Login Page")
	public void user_navigated_to_the_Login_Page() {
		
		loginPage.user_navigated_to_login_page();
	    
	}

	@Given("Enter Username and password")
	public void enter_Username_and_password() {
	    
		loginPage.enter_Username_and_password();
	}

	@Given("Retail Login Page should load")
	public void retail_Login_Page_should_load() {
		
		dashboard.retail_login_page_should_load();
	    
	}

	@When("click on Coupons button")
	public void click_on_Coupons_button() {
		
		dashboard.click_on_coupons();
	    
	}

	@Then("click on Add Coupan")
	public void click_on_Add_Coupan() {
	    
		coupans.click_on_add_coupon();
	}

	@Then("Enter all the Necessary details and Save")
	public void enter_all_the_Necessary_details_and_Save() {
		
		addnewcoupan.enter_all_the_necessary_details_and_save();

	}

	@Then("Verify the Coupan created")
	public void verify_the_Coupan_created() {
		
		coupans.verify_the_added_coupon();
	    
	}

	@Then("Click Edit the added Coupon")
	public void click_Edit_the_added_Coupon() {

		coupans.edit_the_added_coupon();
	}

	@When("Edit Coupon Page Loaded, Update the coupon name")
	public void edit_Coupon_Page_Loaded_Update_the_coupon_name() {
	    
		addnewcoupan.edit_coupon_page_loaded_update_the_coupon_name();
	}

	@When("Verify the Edited coupon in coupon list")
	public void verify_the_Edited_coupon_in_coupon_list() {
	   
		coupans.verify_the_edited_coupon_in_coupon_list();
	}

	@When("Delete the coupon")
	public void delete_the_coupon() {
		
		coupans.delete_the_coupon();
	   
	}



}
