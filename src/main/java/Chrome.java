import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
    public static void main(String[] args) throws InterruptedException {
        //Browser driver exe
      //System.setProperty("WebDriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chrome.exe");
        //create chrome instance
        WebDriver driver = new ChromeDriver();
        //time 10 sec
        Thread.sleep(10000);
        //open application
        driver.get("https://staging.dx0oqxblmo7a7.amplifyapp.com/login");

        //maximize browser
        driver.manage().window().maximize();


       //close browser
        driver.close();
    }
}

