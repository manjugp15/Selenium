import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_disabledTextBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/gsuma/Desktop/demo_1.html");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('un1').value='Qspider'");
		

	}

}
