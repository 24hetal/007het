import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Smi_1 {
    protected static WebDriver driver;

    public static void main(String args[]){

        System.setProperty("webdriver.chrome.driver","src/main/java/Drivers/chromedriver.exe");

        driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();

         driver.get("https://www.amazon.co.uk/");
    }

}
