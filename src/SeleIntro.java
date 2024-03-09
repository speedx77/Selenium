import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleIntro {

	public static void main(String[] args) {
		
		//Invoking Browser
		//Chrome - ChromeDriver -> Use Methods -> Close Browser
		//ChromeDriver driver = new ChromeDriver(); both work but ChromeDriver can only invoke chrome methods not firefox/safari
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.paramountplus.com");
		
		driver.close();
		
		

	}

}
