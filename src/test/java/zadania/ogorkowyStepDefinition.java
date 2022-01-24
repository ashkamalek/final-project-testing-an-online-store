package zadania;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ogorkowyStepDefinition {

    WebDriver driver;

    @Given("i launch firefox browser and open stores website")
    public void launchBrowser() {
        System.setProperty("webdriver.gecko.driver", "D:\\intellij for selenium\\firefox\\geckodriver\\geckodriver.exe"); // Setting system properties of FirefoxDriver
        driver = new FirefoxDriver(); //Creating an object of FirefoxDriver

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @When("on the main page click on sign in")
    public void sign_In() {

        WebElement signIn = driver.findElement(By.id("_desktop_user_info"));
        signIn.click();
    }

    @Then("log in")
    public void logIn() {
        WebElement email = driver.findElement(By.className("form-control"));
        email.sendKeys("joanna.m.malek@gmail.com");

        WebElement name = driver.findElement(By.name("password"));
        name.sendKeys("PastelTropics");

        WebElement submit = driver.findElement(By.id("submit-login"));
        submit.click();
    }

    @Then("on the account site click on the Create new address")
    public void on_the_account_site_click_on_the_Create_new_address() {
        WebElement goToAddress = driver.findElement(By.id("address-link"));
        goToAddress.click();
    }

    @When("refill address to the account with the following data: alias, 201 Ohua Ave, Honolulu, 96811, United Kingdom, 5555555")
    public void refill() {
        WebElement alias = driver.findElement(By.name("alias"));
        alias.sendKeys("alias");

        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("201 Ohua Ave");

        WebElement postcode = driver.findElement(By.name("postcode"));
        postcode.sendKeys("96811");

        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Honolulu");

        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("5555555");

        WebElement source = driver.findElement(By.name("id_country"));
        Select list = new Select(source);
        list.selectByVisibleText("United Kingdom");
        // list.selectByValue("17");

    }

    @And("click save")
    public void click_save() {
        WebElement save = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button"));
        save.submit();
    }

  //  @Then("delete the address")
  //  public void erasing() {
  //      WebElement erasing = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/article/div[2]/a[2]"));
  //      erasing.click();

   //     if(driver.findElement(By.id("notifications"))!= null){
   //         System.out.println("Element is Present: Address successfully deleted!");
   //     }
  //      else{
  //          System.out.println("Element is Absent");
  //      }

            //driver.quit();

   //     }
    }




