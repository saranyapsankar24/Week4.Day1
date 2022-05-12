package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintRespectiveValues {
	public static void main(String[] args) {
		 //Open a chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Launch the URL https://html.com/tags/table/
		driver.get("https://html.com/tags/table/");
		List<WebElement> toGetRows = driver.findElements(By.xpath("(//table)[1]//tr"));
		int rowSize=toGetRows.size();
		System.out.println("Row count is " + rowSize);
		//You have to print the respective values based on given Library
		System.out.println(toGetRows.get(0).getText());
		System.out.println(toGetRows.get(2).getText());
		//Close the browser
		driver.close();
	}

}
