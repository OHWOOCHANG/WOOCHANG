package seleniumdemo;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		
		System.setProperty(
                "webdriver.chrome.driver",
                "C:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.kobis.or.kr/kobis/business/mast/mvie/searchMovieList.do");
		
		driver.findElement(By.name("sMovName")).sendKeys("아가씨");
		driver.findElement(By.xpath("//*[@id='searchMainTopMovie']/table/tbody/tr/td[2]/img")).click();
		
		driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr[1]/td[1]/a")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div[1]/section/div/ul/li[2]/a")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html/body/div[5]/div[2]/section[2]/div[1]/section/div/div[3]/table[1]")));
		
			
		WebElement temp_list = driver.findElement(By.xpath("/html/body/div[5]/div[2]/section[2]/div[1]/section/div/div[3]/table[1]"));
		List<WebElement> list = temp_list.findElements(By.tagName("tr"));
		
		
		ArrayList<String[]> data_list = new ArrayList<String[]>();
		
		
		for (WebElement data : list) {
			data_list.add(data.getText().split(" "));
		}
		
	}
}
