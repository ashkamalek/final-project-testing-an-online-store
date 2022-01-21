package zadania;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class ogorkowyStepDefinition {

    @Given("i launch firefox browser and open stores website")
    public void i_launch_firefox_browser_and_open_stores_website() {
        System.setProperty("webdriver.gecko.driver", "D:\\intellij for selenium\\firefox\\geckodriver\\geckodriver.exe"); // Setting system properties of FirefoxDriver
        WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @When("on the main page click on sign in")
    public void on_the_main_page_click_on_sign_in(){
       driver.findElement(By.id("_desktop_user_info")).click();
    }

   @Then("log in")
   public void log_in(){
        driver.findElement(By.className("form-control")).sendKeys("joanna.m.malek@gmail.com");
        driver.findElement(By.name("password")).sendKeys("PastelTropics");
        driver.findElement(By.id("submit-login")).click();
   }

   @Then("on the account site click on the Create new address")
   public void on_the_account_site_click_on_the_Create_new_address(){
         driver.findElement(By.id("address-link")).click();
   }

   // When("refill address to the account with the following data: alias, {int} Ohua Ave, Honolulu, {int}, United Kingdom, {int}", (Integer int1, Integer int2, Integer int3) -> {
        //driver.findElement(By.name("alias")).sendKeys("alias");
    //        driver.findElement(By.name("address1")).sendKeys("201 Ohua Ave");
    //        driver.findElement(By.name("postcode")).sendKeys("96811");
    //        driver.findElement(By.name("city")).sendKeys("Honolulu");
    //        driver.findElement(By.name("phone")).sendKeys("5555555");
    //        WebElement source = driver.findElement(By.name("id_country"));
    //        Select list = new Select(source);
    //        list.selectByVisibleText("United Kingdom");
    //        // list.selectByValue("17");
    //    throw new io.cucumber.java8.PendingException();
    //});

    @And("click save")
    public void click_save(){
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button")).submit();
    }

    //Then("address on the account has been filled", () -> {
        // Write code here that turns the phrase above into concrete actions
    //});

}




