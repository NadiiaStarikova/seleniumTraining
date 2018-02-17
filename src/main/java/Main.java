import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = initChromeDriver();
        driver.get("https://my.solidopinion.com/signin");
        WebElement mailField = driver.findElement(By.id("email"));
        mailField.sendKeys("frank.coviner@gmail.com");
        WebElement passField = driver.findElement(By.id("password"));
        passField.sendKeys("Cov35er28");
        WebElement loginButton = driver.findElement(By.id("go_login_page"));
        loginButton.click();
    }

    public static WebDriver initChromeDriver() {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "/drivers/chromedriver.exe");
        return new ChromeDriver();
    }
}
