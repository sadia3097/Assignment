$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/retail.feature");
formatter.feature({
  "name": "Retail Upskill",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate the Retail page functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigated to the Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.user_navigated_to_the_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Username and password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.enter_Username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Retail Login Page should load",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.retail_Login_Page_should_load()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Coupons button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.click_on_Coupons_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Add Coupan",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.click_on_Add_Coupan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter all the Necessary details and Save",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.enter_all_the_Necessary_details_and_Save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Coupan created",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.verify_the_Coupan_created()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Edit the added Coupon",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.click_Edit_the_added_Coupon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Edit Coupon Page Loaded, Update the coupon name",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.edit_Coupon_Page_Loaded_Update_the_coupon_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify the Edited coupon in coupon list",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.verify_the_Edited_coupon_in_coupon_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Delete the coupon",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.delete_the_coupon()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});