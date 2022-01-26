package steps;

/*public class StepDefinition1_POM {

    WebDriver driver;
 //   signInPage signInUser;

    @Given("The User launches Firefox browser and opens stores website")
    public void launchBrowser() {

        //  System.setProperty("webdriver.chrome.driver", "D:\\intellij for selenium\\SeleniumCourse2\\src\\main\\sources\\drivers\\chromedriver.exe");
        //  WebDriver driver = new ChromeDriver();



        System.setProperty("webdriver.gecko.driver", "D:\\intellij for selenium\\firefox\\geckodriver\\geckodriver.exe"); // Setting system properties of FirefoxDriver
        driver = new FirefoxDriver(); //Creating an object of FirefoxDriver

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @When("While on the landing page of that site, the User clicks on the Sign in button to create a new account")
    public void sign_In() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.of(20, ChronoUnit.SECONDS));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("_desktop_user_info")));
        WebElement signIn = driver.findElement(By.id("_desktop_user_info"));
        signIn.click();

    }

    @Then("The User fills in email address and password of his new account and clicks the Sign in button")
    public void signIn() {


       // signInPage signInUser = new signInPage(driver);

//signInUser.enterEmail();
//signInUser.enterPassword();
//signInUser.clickSignIn();



        WebElement email = driver.findElement(By.className("form-control"));
        email.sendKeys("joanna.m.malek@gmail.com");

        WebElement name = driver.findElement(By.name("password"));
        name.sendKeys("PastelTropics");

        WebElement submit = driver.findElement(By.id("submit-login"));
        submit.click();
    }

    @Then("While on the account page, the User clicks on the Create new address button")
    public void on_the_account_site_click_on_the_Create_new_address() {
        WebElement goToAddress = driver.findElement(By.id("address-link"));
        goToAddress.click();
    }

    @When("The User fills in the form with the following data: kot, 201 Ohua Ave, Honolulu, 96811, United Kingdom, 5555555")
    public void refill() {


        WebElement alias = driver.findElement(By.name("alias"));
        alias.sendKeys("kot");

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

    @And("The User saves changes by clicking the Save button, after which The User can verify the correctness of the Data provided")
    public void click_save() {
        WebElement save = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/form/footer/button"));
        save.submit();

        WebElement check = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/article/div[1]/h4"));
        String expected = "kot";
        String actual = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/article/div[1]/h4")).getText();
        Assert.assertEquals(expected, actual);

        System.out.println("Provided alias: " + actual);

        WebElement check1 = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/article/div[1]/address"));
        String expected1 = "Joanna Malek\n" +
                "201 Ohua Ave\n" +
                "Honolulu\n" +
                "96811\n" +
                "United Kingdom\n" +
                "5555555";
        String actual1 = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/article/div[1]/address")).getText();
        Assert.assertEquals(expected1, actual1);

        System.out.println("Provided data: " + actual1);
    }

    //  @Then("The User deletes his Data by clicking the Delete button, after which The User receives a message confirming his Data has been deleted")
    //  public void erasing() {
    //      WebElement erasing = driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/article/div[2]/a[2]"));
    //      erasing.click();

    //      WebElement check1 = driver.findElement(By.id("notifications"));

    //Assert.assertNotNull(check1);
    //     Assert.assertNull(check1);

}


//     if(driver.findElement(By.id("notifications"))!= null){
//         System.out.println("Element is Present: Address successfully deleted!");
//     }
//     else{
//         System.out.println("Element is Absent");
//   }

//driver.quit();

//     }
//   }
*/



