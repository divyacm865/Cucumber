package stepdefinition;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.hooks;

public class stepdefination {

	
	WebDriver driver = hooks.driver;

	@Given("lanuch url")
	public void lanuch_url() {
		
	    driver.get("http://elearningm1.upskills.in/");
	    driver.manage().window().maximize();
	    driver.findElement(By.xpath("//*[@href='http://elearningm1.upskills.in/main/auth/inscription.php']")).click();
	    
	}
	
	@When("click on signup and signup page will populated")
	public void click_on_signup_and_signup_page_will_populated()  {
		System.out.println("Sign up page is populated");
		driver.getCurrentUrl();
	}

	@When("user enters a Firstname {string}")
	public void user_enters_a_firstname(String FirstName) {
	    driver.findElement(By.name("firstname")).sendKeys(FirstName);
	    System.out.printf("First name is entered\t" +FirstName);
	}

	@When("user enters a Lastname {string}")
	public void user_enters_a_lastname(String LastName) {
		driver.findElement(By.name("lastname")).sendKeys(LastName);
	    System.out.printf("\nLirst name is entered\t" +LastName);
	    
	}

	@When("user enters a emali {string}")
	public void user_enters_a_emali(String email) {
		driver.findElement(By.name("email")).sendKeys(email);
	    System.out.printf("\nEmail is entered\t" + email);
	    
	    
	}

	@When("user enters a username {string}")
	public void user_enters_a_username(String Username) {
		driver.findElement(By.name("username")).sendKeys(Username);
	    System.out.printf("\nUsername is entered\t" + Username);
	  
	}

	@When("user enters a password {string}")
	public void user_enters_a_password(String Pass) {
		driver.findElement(By.name("pass1")).sendKeys(Pass);
	    System.out.printf("\nPassword is entered\t"+ Pass);
	}

	@When("user re-enters a passwrod {string}")
	public void user_re_enters_a_passwrod(String ConfirmPassword) {
		driver.findElement(By.name("pass2")).sendKeys(ConfirmPassword);
	    System.out.printf("\nConfirming Password\t" +ConfirmPassword);
	}
	
	@When("click on submit button")
	public void click_on_submit_button() {
	    driver.findElement(By.name("submit")).click();
	}

	

@When("user registration is successful")
public void user_registration_is_successful() {
	String Header = driver.findElement(By.xpath("//*[@id='cm-content']/div/ul/li")).getText();
	if(Header.equalsIgnoreCase("Registration"))
		System.out.println("Registration is Successful");
	System.out.println("User Registration is successful");	
}

@When("user click on profile drop down")
public void user_click_on_profile_drop_down() {
   
	driver.findElement(By.xpath("//div[@id='navbar']//a[@role='button']")).click();
	System.out.println("user click on profile drop down");
	
	
}

@Then("User verifies the email address {string}")
public void user_verifies_the_email_address(String email) throws InterruptedException {
    String profileemail =driver.findElement(By.xpath("//*[@id='navbar']/ul[2]/li[2]/ul/li[1]/div/p/i")).getText();
    Thread.sleep(3000);
    if(profileemail.equalsIgnoreCase(email))
		System.out.println("Entered email is verifieed Successfully");
	
    
}


@When("click on inbox icon")
public void click_on_inbox_icon() {

	driver.findElement(By.xpath("//a[@title='Inbox']")).click();
	System.out.println("user able to click on Inbox icon");
}

@Then("user will re-directed to Messages page")
public void user_will_re_directed_to_messages_page() throws InterruptedException {
	driver.findElement(By.xpath("//section[@id='cm-content']"));
	Thread.sleep(3000);
	System.out.println("user is re-directed to Messages page");
	   
}


@Then("user click on compose message icon")
public void user_click_on_compose_message_icon() throws InterruptedException {
	driver.findElement(By.xpath("//img[@alt='Compose message']")).click();
	Thread.sleep(3000);
	System.out.println("User clicks on the Compose message button"); 
}


@Then("user enters the recepient email address as {string}")
public void user_enters_the_recepient_email_address_as(String sendto) throws InterruptedException {
	 driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']//input[@role='textbox']")).sendKeys(sendto);
	    Thread.sleep(3000);
	    
		driver.findElement(By.xpath("//ul[@id='select2-compose_message_users-results']/li")).click();
	    System.out.println("User enters the recepient email address");
}
@Then("user enter the subject text as {string}")
public void user_enter_the_subject_text_as(String Subject) throws InterruptedException {
	
	driver.findElement(By.xpath("//input[@id='compose_message_title']")).sendKeys(Subject);
	System.out.println("\nuser enter the subject text as\t" +Subject);
  
}

@Then("^user enter the message as \"([^\"]*)\"$")
public void user_enters_the_message_body_as(String EmailBody)  {
    // Write code here that turns the phrase above into concrete actions
	driver.switchTo().frame(0);
	
	driver.findElement(By.xpath("//html//body")).sendKeys(EmailBody);
	System.out.println("user enter the message\t " +EmailBody);
	driver.switchTo().defaultContent();
}

@Then("user clicks on the send message button")
public void user_clicks_on_the_send_message_button() {
	   driver.findElement(By.xpath("//button[@id='compose_message_compose']")).click();
			System.out.println("\nUser clicks on the Send Message button\t");
   
}
@Then("user confimrs the acknowledgement")
public void user_confimrs_the_acknowledgement() {
	if(driver.findElement(By.xpath("//section[@id='cm-content']/div[@class='container']//div[@class='alert alert-success']")).isDisplayed())
    	System.out.println("\nmessage is sent successfully\t");
	System.out.println("\nuser confimrs the acknowledgement\t");
}

}

