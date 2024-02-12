package Tests;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWaitTest {
	private WebDriverWait wait;
	private RemoteWebDriver driver;

	@BeforeEach
	void init() {

		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
//		this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	}


	@Test
	void test() {
		this.driver.get("http://127.0.0.1:5500/index.html");
		WebElement title = this.driver.findElement(By.cssSelector("body > div:nth-child(2) > p"));
		Assertions.assertEquals("Delayed Element", title.getText());

	}

	@Test
	void buttonTest() {
		this.driver.get("http://127.0.0.1:5500/index.html");
		WebElement findButton = this.driver.findElement(By.cssSelector("body > div:nth-child(3) > button"));
		findButton.click();
		wait.until(ExpectedConditions.alertIsPresent());
//		this.driver.switchTo().alert().getText();
		Assertions.assertEquals("Hello", this.driver.switchTo().alert().getText());
	}

}
