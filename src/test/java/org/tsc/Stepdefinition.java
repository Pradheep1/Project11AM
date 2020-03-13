package org.tsc;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import com.Base.BaseClass;
import com.objectrepository.LoginPojo;
import cucumber.api.java.en.*;
import cucumber.api.java.en.When;
public class Stepdefinition extends BaseClass {
	WebDriver d;
	@Given("^User open the url$")
	public void user_open_the_url() throws IOException {
	} 
	@When("^Enter user \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enter_user_and(String s1, String s2) throws IOException {
		LoginPojo l = new LoginPojo();
		FillRegister(l.getTxtUser(), s1);
		FillRegister(l.getTxtPass(), s2);
	}
	@When("^User click the Login$")
	public void user_click_the_Login() throws IOException {
		LoginPojo l = new LoginPojo();
		Login(l.getBtnLogin());
	}
	@When("Select  the {string} and {string} and {string} and {string}")
	public void select_the_and_and_and(String Location, String Hotel, String RoomType, String NoRooms) {
		WebElement c1 = d.findElement(By.xpath("//select[@name='location']"));
		c1.sendKeys(Location);
		WebElement a2 = d.findElement(By.id("room_type"));
		a2.sendKeys(RoomType);
		WebElement c2 = d.findElement(By.name("hotels"));
		c2.sendKeys(Hotel);
		WebElement a3 = d.findElement(By.id("room_nos"));
		a3.sendKeys(NoRooms);
	}
	@When("^Give Date \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void give_Date_and_and_and(String Checkin, String Checkout, String Adult, String Child) {
		WebElement a4 = d.findElement(By.id("datepick_in"));
		a4.sendKeys(Checkin);
		WebElement a5 = d.findElement(By.id("datepick_out"));
		a5.sendKeys(Checkout);
		WebElement a6 = d.findElement(By.id("adult_room"));
		a6.sendKeys(Adult);
		WebElement a7 = d.findElement(By.id("child_room"));
		a7.sendKeys(Child);
	}
	@When("^Click on search and navigate to the Next page$")
	public void click_on_search_and_navigate_to_the_Next_page() {
		d.findElement(By.id("Submit")).click();
	}
	@When("^Select the Radio Button and click ok$")
	public void select_the_Radio_Button_and_click_ok() {
		d.findElement(By.id("radiobutton_0")).click();
		d.findElement(By.id("continue")).click();
	}

	@When("^Fill \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and  \"([^\"]*)\"$")
	public void fill_and_and_and_and(String First, String Last, String Addresss, String Cardno, String Cardtype) {
		WebElement a8 = d.findElement(By.id("first_name"));
		a8.sendKeys(First);
		WebElement a9 = d.findElement(By.id("last_name"));
		a9.sendKeys(Last);
		WebElement b1 = d.findElement(By.id("address"));
		b1.sendKeys(Addresss);
		WebElement b2 = d.findElement(By.id("cc_num"));
		b2.sendKeys(Cardno);
		WebElement b3 = d.findElement(By.id("cc_type"));
		b3.sendKeys(Cardtype);
	}

	@When("^Click \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void click_and_and(String Months, String Year, String Cvv) throws InterruptedException {
		WebElement b4 = d.findElement(By.id("cc_exp_month"));
		Thread.sleep(10000);
		Select s = new Select(b4);
		s.selectByValue(Months);
		WebElement b5 = d.findElement(By.id("cc_exp_year"));
		b5.sendKeys(Year);
		WebElement b6 = d.findElement(By.id("cc_cvv"));
		b6.sendKeys(Cvv);
	}
	@Then("user verify message")
	public void user_verify_message() {
	 System.out.println("Execution over");
	 }
	@When("^Click Book Now and navigate to next page$")
	public void click_Book_Now_and_navigate_to_next_page() {
		d.findElement(By.id("book_now")).click();
	}
	@When("^Print the order number and take screenshot$")
	public void print_the_order_number_and_take_screenshot() throws InterruptedException, IOException {
		d.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement x = d.findElement(By.id("order_no"));
		String tx = x.getAttribute("value");
		System.out.println("order no:" + tx);
	}
	@Then("^LogOut$")
	public void logout() {
		d.findElement(By.id("logout")).click();
		d.quit();
	}
}
