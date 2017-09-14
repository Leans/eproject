
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class FirefoxScreenshot {
	
	public static void main(String[] args) {
		try {
		//String baseUrl = "https://es.wikipedia.org/wiki/Wikipedia:Portada";
		String baseUrl = "http://google.com";
		System.setProperty("webdriver.gecko.driver","C:\\browser-drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("0.");
		driver.manage().window().fullscreen(); //TIRA ERROR
		System.out.println("1");
		driver.get(baseUrl);
		System.out.println("2");
		//1 NO ANDA EN FIREFOX
		//Actions actions = new Actions(driver);
		//actions.sendKeys(Keys.F11);
		//actions.perform();
		
		//2
		java.awt.Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(dimension);
		
		//3		
		BufferedImage image = new Robot().createScreenCapture(rectangle);
		ImageIO.write(image, "png", new File("D:\\screenshots\\firefox_screenshot_3.png"));
		
        //close Chrome
        driver.close();
        
        System.out.println("Operacion finalizada.");
        
		}
		catch (Exception e) {
			System.out.println("Exception!");
			System.out.println(e.getMessage());
		}
	}

}
