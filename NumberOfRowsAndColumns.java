package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NumberOfRowsAndColumns {
	public static void main(String[] args) {
		//Open a chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Launch the URL https://www.chittorgarh.com/
		driver.get("https://html.com/tags/table/");
		//Find the number of tables in the page.
		int tableCount = driver.findElements(By.xpath("//table")).size();
		System.out.println("The number of tables in the page : " + tableCount);
		for(int i=1;i<tableCount;i++) {
			//Get the count of number of rows
			int rowCount = driver.findElements(By.xpath("(//table)["+ i + "]//tr")).size();
			System.out.println("The row count is : " + rowCount);
			//Get the column count of the table
			int columnCount = driver.findElements(By.xpath("(//table)["+ i +"]//th")).size();
			System.out.println("The Column count is : " +columnCount);	
		}
		//Close the driver
		driver.close();
	}
}
