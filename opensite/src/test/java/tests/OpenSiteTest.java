package tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenSiteTest {
	
	private WebDriver driver;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\agile\\Desktop\\drive\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		 
		// driver.get("www.gmail.com");
		 
			       
		     	}
	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		driver.get("https://www.mercadolivre.com.br/");
		assertTrue("Wrong title",driver.getTitle().contentEquals("Mercado Livre Brasil - Frete Grátis no mesmo dia"));
		driver.findElement(By.xpath("/html/body/header/div/form/input")).click();
		driver.findElement(By.xpath("/html/body/header/div/form/input")).sendKeys("Relogio",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/div[1]/div/div/div/div[2]/div/div")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/section/div[1]/div/div/div/div[2]/div/div/div/ul/a[1]/div[2]/div[2]/div")).click();
		//driver.findElement(By.xpath("//*[@id=\"root-app\"]/div/div[1]/aside/section/div[4]/ul/li[1]/a")).click();
	}
	

}
