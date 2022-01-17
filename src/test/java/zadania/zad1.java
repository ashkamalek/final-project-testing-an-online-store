package zadania;


import cucumber.api.junit.Cucumber;
import io.cucumber.testng.CucumberOptions;
import org.checkerframework.checker.units.qual.Current;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;





@RunWith(Cucumber.class)
@CucumberOptions(features="scr/Cucumber/Features", plugin= {"pretty", "html:out"})
public class zad1 {

    public static void main(String[] args) {



        System.setProperty("webdriver.opera.driver", "D:\\intellij for selenium\\opera\\operadriver_win64\\operadriver.exe");
        WebDriver driver = new OperaDriver();



        driver.manage().window().maximize();
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
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/section/div[10]/div[1]/select")).getCssValue("United Kingdom");
        driver.findElement(By.name("phone")).sendKeys("5555555");

        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button")).submit();
    }

}
