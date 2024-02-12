package Tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumDemoTest {

	private RemoteWebDriver driver;

	@BeforeEach // runs before each test.
	void init() {

		ChromeOptions opts = new ChromeOptions();
//		opts.addArguments("--headless=new");
		// creates a New Chrome window
		this.driver = new ChromeDriver(opts);
		// sets it to fullscreen.
		this.driver.manage().window().maximize();
	}
	
//	@Test
//	void seleniumTest() {
//		this.driver.get("http://www.bing.com");
//
//	}
//
//	@Test
//	void textBoxTest() {
//		this.driver.get("https://demoqa.com/text-box");
//
//		WebElement consent = this.driver.findElement(By.cssSelector(
//				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p"));
//		consent.click();
//
//		WebElement fullName = this.driver.findElement(By.id("userName"));
//		fullName.sendKeys("Liam");
//
//		WebElement email = this.driver.findElement(By.id("userEmail"));
//		email.sendKeys("liam@email.com");
//
//		WebElement currentAddress = this.driver.findElement(By.id("currentAddress"));
//		currentAddress.sendKeys("123 Test Street, Test Town, TS1 T13");
//
//		WebElement permAddress = this.driver.findElement(By.id("permanentAddress"));
//		permAddress.sendKeys("321 Random Street, Random Town, RD1 0DM");
//
//		WebElement submit = this.driver.findElement(By.id("submit"));
//		submit.click();
//
//		WebElement display = this.driver.findElement(By.id("name"));
//
//		Assertions.assertEquals(true, display.getText().contains("Liam"));

//	}

	@Test
	void selectReactTest() {

		this.driver.get("https://demoqa.com/checkbox");

		WebElement consent = this.driver.findElement(By.cssSelector(
				"body > div.fc-consent-root > div.fc-dialog-container > div.fc-dialog.fc-choice-dialog > div.fc-footer-buttons-container > div.fc-footer-buttons > button.fc-button.fc-cta-consent.fc-primary-button > p"));
		consent.click();

		WebElement homeBtn = this.driver.findElement(By.cssSelector("#tree-node > ol > li > span > button > svg"));
		homeBtn.click();

		WebElement docBtn = this.driver.findElement(By.cssSelector(
				"#tree-node > ol > li > ol > li:nth-child(2) > span > button"));
		docBtn.click();

		WebElement workSpaceBtn = this.driver.findElement(By.cssSelector(
				"#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li:nth-child(1) > span > button"));
		workSpaceBtn.click();

		
		WebElement selectReact = this.driver.findElement(By.cssSelector(
				"#tree-node > ol > li > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li.rct-node.rct-node-parent.rct-node-expanded > ol > li:nth-child(1) > span > label > span.rct-title"));
		;
		selectReact.click();
		
	}

	@AfterEach
	void tearDown() {
//		this.driver.quit();
	}
}
