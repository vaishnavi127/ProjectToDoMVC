package StepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ToDoTaskStepDefinition {
	public static WebDriver driver;
	public static WebElement todonum;

	@Given("^User is entering \"([^\"]*)\"$")
	public void user_is_entering(String arg1) throws Throwable {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		    driver.get(arg1);
		    driver.manage().window().maximize();
	}

	@Then("^type \"([^\"]*)\" click Enter \"([^\"]*)\" click Enter \"([^\"]*)\"$")
	public void type_click_Enter_click_Enter(String arg1, String arg2, String arg3) throws Throwable {
			WebElement txtbox = driver.findElement(By.xpath("/html/body/section/header/input"));
			txtbox.sendKeys(arg1);
			txtbox.sendKeys(Keys.ENTER);
			txtbox.sendKeys(arg2);
			txtbox.sendKeys(Keys.ENTER);
			txtbox.sendKeys(arg3);	
			txtbox.sendKeys(Keys.ENTER);
			Thread.sleep(1000);
	}

	@When("^\"([^\"]*)\" and \"([^\"]*)\" click on checkbox$")
	public void and_click_on_checkbox(String arg1, String arg2) throws Throwable {
			WebElement chkbox1 = driver.findElement(By.xpath("/html/body/section/section/ul/li[1]/div/input"));
			chkbox1.click();
			Thread.sleep(1000);
			WebElement chkbox2 = driver.findElement(By.xpath("/html/body/section/section/ul/li[2]/div/input"));
			chkbox2.click();
			Thread.sleep(2000);
	}

	@When("^\"([^\"]*)\" and \"([^\"]*)\" click on cross button$")
	public void and_click_on_cross_button(String arg1, String arg2) throws Throwable {
			WebElement ele1 = driver.findElement(By.xpath("/html/body/section/section/ul/li[1]/div/label"));
			
			new Actions(driver).moveToElement(ele1).click().perform();
			WebElement crossbtn1 = driver.findElement(By.xpath("/html/body/section/section/ul/li[1]/div/button"));
			crossbtn1.click();
			Thread.sleep(500);
//			WebElement ele2 = driver.findElement(By.xpath("/html/body/section/section/ul/li[2]/div/label"));
//			new Actions(driver).moveToElement(ele2).click().perform();
//			WebElement crossbtn2 = driver.findElement(By.xpath("/html/body/section/section/ul/li[2]/div/button"));
//			crossbtn2.click();
	}

	@Given("^click on Active button$")
	public void click_on_Active_button() throws Throwable {
			WebElement activeBtn = driver.findElement(By.xpath("/html/body/section/footer/ul/li[2]/a"));
			activeBtn.click();
			Thread.sleep(1000);
	}

	@Then("^verify only (\\d+) active task$")
	public void verify_only_active_task(int arg1) throws Throwable {
			todonum = driver.findElement(By.xpath("/html/body/section/footer/span/strong"));		
			String ele = todonum.getText();
			if(1 == Integer.parseInt(ele))
				System.out.println("There are only 1 item in the ToDo List");
	}

	@Given("^Add one more item in the reminder$")
	
		public void add_one_more_item_in_the_reminder() throws Throwable {
			WebElement txtbox = driver.findElement(By.xpath("/html/body/section/header/input"));
			txtbox.sendKeys("Daily SyncUp");
			txtbox.sendKeys(Keys.ENTER);
			System.out.println("After adding Task4***");
	}

	@Then("^Verify the number of items left is displayed as (\\d+)$")
	public void verify_the_number_of_items_left_is_displayed_as(int arg1) throws Throwable {
			todonum = driver.findElement(By.xpath("/html/body/section/footer/span/strong"));		
			String ele = todonum.getText();
			if(2 == Integer.parseInt(ele))
				System.out.println("There are 2 items in the ToDo List");
	}
	
//	@Given("^User is entering \"([^\"]*)\"$")
//	public void user_is_entering(String arg1) throws Throwable {
//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
//		driver = new ChromeDriver();
//	    driver.get(arg1);
//	    driver.manage().window().maximize();
//	}
//	
//	@Then("^type \"([^\"]*)\" click Enter \"([^\"]*)\" click Enter \"([^\"]*)\"$")
//	public void type_click_Enter_click_Enter(String arg1, String arg2, String arg3) throws Throwable {
//		WebElement txtbox = driver.findElement(By.xpath("/html/body/section/header/input"));
//		txtbox.sendKeys(arg1);
//		txtbox.sendKeys(Keys.ENTER);
//		txtbox.sendKeys(arg2);
//		txtbox.sendKeys(Keys.ENTER);
//		txtbox.sendKeys(arg3);	
//		txtbox.sendKeys(Keys.ENTER);
//		Thread.sleep(1000);
//	}
//	
//	@When("^\"([^\"]*)\" and \"([^\"]*)\" click on checkbox$")
//	public void and_click_on_checkbox(String arg1, String arg2) throws Throwable {
//		WebElement chkbox1 = driver.findElement(By.xpath("/html/body/section/section/ul/li[1]/div/input"));
//		chkbox1.click();
//		Thread.sleep(1000);
//		WebElement chkbox2 = driver.findElement(By.xpath("/html/body/section/section/ul/li[2]/div/input"));
//		chkbox2.click();
//		Thread.sleep(2000);
//		
//	}
//	
//	@When("^\"([^\"]*)\" and \"([^\"]*)\" click on cross button$")
//	public void and_click_on_cross_button(String arg1, String arg2) throws Throwable {
//		WebElement ele1 = driver.findElement(By.xpath("/html/body/section/section/ul/li[1]/div/label"));
//		
//		new Actions(driver).moveToElement(ele1).click().perform();
//		WebElement crossbtn1 = driver.findElement(By.xpath("/html/body/section/section/ul/li[1]/div/button"));
//		crossbtn1.click();
//		Thread.sleep(500);
////		WebElement ele2 = driver.findElement(By.xpath("/html/body/section/section/ul/li[2]/div/label"));
////		new Actions(driver).moveToElement(ele2).click().perform();
////		WebElement crossbtn2 = driver.findElement(By.xpath("/html/body/section/section/ul/li[2]/div/button"));
////		crossbtn2.click();
//		
//	}
//
//	@Given("^click on Active button$")
//	public void click_on_Active_button() throws Throwable {
//		WebElement activeBtn = driver.findElement(By.xpath("/html/body/section/footer/ul/li[2]/a"));
//		activeBtn.click();
//		Thread.sleep(1000);
//	}
//
//	@Then("^verify only (\\d+) active task$")
//	public void verify_only_active_task(int arg1) throws Throwable {
//		todonum = driver.findElement(By.xpath("/html/body/section/footer/span/strong"));		
//		String ele = todonum.getText();
//		if(1 == Integer.parseInt(ele))
//			System.out.println("There are only 1 item in the ToDo List");
//	}
//			
//	@Given("^Add one more item in the reminder$")
//	public void add_one_more_item_in_the_reminder() throws Throwable {
//		WebElement txtbox = driver.findElement(By.xpath("/html/body/section/header/input"));
//		txtbox.sendKeys("Daily SyncUp");
//		txtbox.sendKeys(Keys.ENTER);
//		System.out.println("After adding Task4***");
//		
//	}
//
//	@Then("^Verify the number of items left is displayed as (\\d+)$")
//	public void verify_the_number_of_items_left_is_displayed_as(int arg1) throws Throwable {
//		todonum = driver.findElement(By.xpath("/html/body/section/footer/span/strong"));		
//		String ele = todonum.getText();
//		if(2 == Integer.parseInt(ele))
//			System.out.println("There are 2 items in the ToDo List");
//	}
//	
//	
	
}
