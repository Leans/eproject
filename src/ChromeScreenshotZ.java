

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeScreenshotZ {
	
	public static void main(String[] args) {
		try {
		String baseUrl = "https://es.wikipedia.org/wiki/Wikipedia:Portada";
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		
		//Setting your Chrome options (Desired capabilities)
		ChromeOptions options = new ChromeOptions();
		//options.add_argument('--start-maximized');
		//options.add_argument('--start-fullscreen');
		
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().window().maximize();
		driver.get(baseUrl);
		
		//take screenshot
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //save screenshot in D:\ as "chrome_screenshot.png"
        FileUtils.copyFile(scrFile, new File("D:\\screenshots\\chrome_screenshot.png"));
        
        //close Chrome
        driver.close();
        
		}
		catch (Exception e) {
			System.out.println("Exception!");
		}
	}

}
