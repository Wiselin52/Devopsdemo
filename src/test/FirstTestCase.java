package test;

import static org.testng.Assert.assertEquals;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FirstTestCase {

	
	
	@Test
    public void testFirstApplicationBodyContent() throws Exception {
//		fail("Not yet implemented");
		try {
			String exePath = "/Users/wmathhuram/Downloads/chromedriver";
			System.setProperty("webdriver.chrome.driver", exePath);
			WebDriver driver = new ChromeDriver();
			driver.get("http://localhost:8081/Wiselintest/index.html");
			boolean flag = driver.findElement(By.tagName("body")).getText().equals("Hello NISUM!");
			assertEquals(flag,true);
		}
		catch(Exception e) {
			System.out.println("error occured while connecting chrome driver");
		}
	}

}

