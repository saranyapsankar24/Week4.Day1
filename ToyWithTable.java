package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToyWithTable {
	public static void main(String[] args) {
		//Open a chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		//Maximize the window
		driver.manage().window().maximize();
		//Launch the URL https://www.chittorgarh.com/
		driver.get("http://www.leafground.com/pages/table.html");
		//Find the table
		WebElement elementTable = driver.findElement(By.xpath("//table"));
		//Get the count of number of rows
		int rowSize = elementTable.findElements(By.xpath("//tr")).size();
		System.out.println("Row size is : " + rowSize);
		//Get the count of number of columns
		int columnSize = elementTable.findElements(By.xpath("//th")).size();
		System.out.println("Column size is : " +columnSize);
		//Get the progress value of 'Learn to interact with Elements'
		String text = driver.findElement(By.xpath("//table//tr[@class='even']")).getText();
		System.out.println("Progress value :  " +   text);
		//Check the vital task for the least completed progress.
		WebElement checkbox = driver.findElement(By.xpath("(//input[@name='vital'])[5]"));
		checkbox.click();
		if(checkbox.isSelected()) {
			System.out.println("Check box is checked");
		} else {
			System.out.println("Check box is not checeked");
		}
		//Close the browser
		driver.close();
	}

}
