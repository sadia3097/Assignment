package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import hooks.HooksClass;

public class CoupansPage {
	WebDriver driver = HooksClass.driver;

	@FindBy(xpath = "//a[@data-original-title='Add New']")
	WebElement click_add_coupon;
	@FindBy(xpath = "//td[contains(text(),'Sadia Sultana')]")
	WebElement verifyTheAddedcoupon;
	@FindBy(xpath = "//div/table/tbody/tr//td[contains(text(),'Sadia Sultana')]//following-sibling::td[6]/a/i")
	WebElement editcouponbutton;
	@FindBy(xpath = "//td[contains(text(),'Mohammed')]")
	WebElement editedCouponName;
	@FindBy(xpath = "//td[contains(text(),'Mohammed')]//parent::tr//input")
	WebElement checkbox;
	@FindBy(xpath = "//button[@data-original-title='Delete']")
	WebElement delete;

	public CoupansPage() {
		PageFactory.initElements(driver, this);
	}
	public void click_on_add_coupon() {
		click_add_coupon.click();
	}
	public void verify_the_added_coupon() {
		WebElement ActualCouponName = verifyTheAddedcoupon;
		Assert.assertEquals(AddNewCoupanPage.CouponName, ActualCouponName.getText());
	}
	public void edit_the_added_coupon() {
		editcouponbutton.click();
	}
	public void verify_the_edited_coupon_in_coupon_list() {
		WebElement ActualEditCouponName = editedCouponName;
		Assert.assertEquals(AddNewCoupanPage.EditedCouponName, ActualEditCouponName.getText());
	}
	public void delete_the_coupon() {
		checkbox.click();
		delete.click();
		driver.switchTo().alert().accept();
	}

}
