package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ToDoMVCSteps {
	public static WebDriver driver;
	@Given("^User is entering$")
	public void user_is_entering() throws Throwable {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.get("http://todomvc.com/examples/vue/");
	    driver.manage().window().maximize();
	}
	
	@Then("^click ToDoMVC$")
	public void click_ToDoMVC() throws Throwable {
		WebElement todoMVC = driver.findElement(By.xpath("/html/body/footer/p[3]/a"));
		todoMVC.click();
	}
	
	@Given("^Click on Download button$")
	public void click_on_Download_button() throws Throwable {
		WebElement download = driver.findElement(By.xpath("/html/body/div[2]/header/div[1]/nav/a[1]"));
		download.click();
	}

	@Then("^click on Submit Pull Request$")
	public void click_on_Submit_Pull_Request() throws Throwable {
		WebElement submit = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[3]/p[4]/a"));
		submit.click();
		
	}



}
