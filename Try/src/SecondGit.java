
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondGit{

public static void main(String[] args) {
// TODO Auto-generated method stub

//setting the driver executable
System.setProperty("webdriver.gecko.driver", "D:\\Deepa\\Selenium Workspace\\Selenium Installations\\geckodriver.exe");

//Initiating your chromedriver
WebDriver driver=new FirefoxDriver();

//Applied wait time
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//maximize window
driver.manage().window().maximize();

//open browser with desried URL
driver.get("https://www.gmail.com");

//closing the browser
driver.close();

}

}
