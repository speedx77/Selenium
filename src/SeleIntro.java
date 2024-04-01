import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleIntro {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver -> Use Methods -> Close Browser
		//ChromeDriver driver = new ChromeDriver(); both work but ChromeDriver can only invoke chrome methods not firefox/safari
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close(); //closes out of original tab (if new ones are opened it won't close out)
		
		driver.quit(); //quits entire window/browser sesh
		
		

	}

}
