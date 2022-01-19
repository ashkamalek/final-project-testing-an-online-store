package zadania;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;


//@RunWith(Cucumber.class)
//@CucumberOptions(features="scr/Cucumber/Features", plugin= {"pretty", "html:out"})
public class zad1 {

    public static void main(String[] args) throws InterruptedException {



        //System.setProperty("webdriver.chrome.driver", "D:\\intellij for selenium\\chrome\\chromedriver.exe");
       // WebDriver driver = new ChromeDriver();

      //  System.setProperty("webdriver.opera.driver", "D:\\intellij for selenium\\opera\\operadriver_win64\\operadriver.exe");
      //  WebDriver driver = new OperaDriver();

       System.setProperty("webdriver.gecko.driver", "D:\\intellij for selenium\\firefox\\geckodriver\\geckodriver.exe"); // Setting system properties of FirefoxDriver
        WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.findElement(By.id("_desktop_user_info")).click();
        driver.findElement(By.className("form-control")).sendKeys("joanna.m.malek@gmail.com");
        driver.findElement(By.name("password")).sendKeys("PastelTropics");
        driver.findElement(By.id("submit-login")).click();

        driver.findElement(By.id("address-link")).click();
//alias, address, city, zip/postal code, country, phone
        driver.findElement(By.name("alias")).sendKeys("alias");
        driver.findElement(By.name("address1")).sendKeys("201 Ohua Ave");
        driver.findElement(By.name("postcode")).sendKeys("96811");
        driver.findElement(By.name("city")).sendKeys("Honolulu");
        driver.findElement(By.name("phone")).sendKeys("5555555");
        WebElement source = driver.findElement(By.name("id_country"));
        Select list = new Select(source);
        list.selectByVisibleText("United Kingdom");
        // list.selectByValue("17");







        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button")).submit();
    }

}
