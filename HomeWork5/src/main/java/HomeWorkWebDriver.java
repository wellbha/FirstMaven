import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkWebDriver {
    protected static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\browserdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.co.uk/");
    }
}
