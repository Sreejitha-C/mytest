import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {

    public static void main(String[] args) throws InterruptedException {

      
        // Create a new WebDriver instance for Chrome
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        driver.get("http://18.191.167.16:8080/qaenv/");
        System.out.println(driver.getCurrentUrl());
    }
}
