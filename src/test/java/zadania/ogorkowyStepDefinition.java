package zadania;


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

   // @When("on the main page click on sign in", () -> {
        // Write code here that turns the phrase above into concrete actions
       // throw new io.cucumber.java8.PendingException();
  //  });

  //  When("log in", () -> {
        // Write code here that turns the phrase above into concrete actions
   //     throw new io.cucumber.java8.PendingException();
   // });

   // When("on the account site click on the +Create new address", () -> {
   //     // Write code here that turns the phrase above into concrete actions
   //     throw new io.cucumber.java8.PendingException();
    //});

   // When("refill address to the account with the following data: alias, {int} Ohua Ave, Honolulu, {int}, United Kingdom, {int}", (Integer int1, Integer int2, Integer int3) -> {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java8.PendingException();
    //});

    //When("click save", () -> {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java8.PendingException();
    //});

    //Then("address on the account has been filled", () -> {
        // Write code here that turns the phrase above into concrete actions
    //    throw new io.cucumber.java8.PendingException();
    //});
















}




