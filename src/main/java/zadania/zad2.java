package zadania;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class zad2 {
    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "D:\\intellij for selenium\\firefox\\geckodriver\\geckodriver.exe"); // Setting system properties of FirefoxDriver
        WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver

       // System.setProperty("webdriver.opera.driver", "D:\\intellij for selenium\\opera\\operadriver_win64\\operadriver.exe");
       // WebDriver driver = new OperaDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//zaloguje się na tego samego użytkownika z zadania 1,

        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.findElement(By.id("_desktop_user_info")).click();

        driver.findElement(By.className("form-control")).sendKeys("joanna.m.malek@gmail.com");
        driver.findElement(By.name("password")).sendKeys("PastelTropics");
        driver.findElement(By.id("submit-login")).click();

//wybierze do zakupu Hummingbird Printed Sweater,
        driver.findElement(By.id("category-3")).click();
        driver.findElement(By.xpath("//img[@alt='Brown bear printed sweater']")).click();

//wybierze rozmiar M,

       WebElement source1 = driver.findElement(By.id("group_1")); //multiple value list
        Select list = new Select(source1);
        list.selectByValue("2");
//wybierze 5 sztuk według parametru podanego w teście,
        WebDriverWait wait3 = new WebDriverWait(driver, Duration.of(5, ChronoUnit.SECONDS));
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".touchspin-up")));

WebElement button = driver.findElement(By.cssSelector(".touchspin-up"));

    for (int i=1; i < 5; i ++) {
            button.click();
        }


//dodaj produkt do koszyka,
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.of(5, ChronoUnit.SECONDS));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("add")));
       driver.findElement(By.className("add")).click();

//przejdzie do opcji - checkout,
       WebDriverWait wait = new WebDriverWait(driver, Duration.of(5, ChronoUnit.SECONDS));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.cart-content-btn a")));
       driver.findElement(By.cssSelector("div.cart-content-btn a")).click();
       driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")).click();

//potwierdzi address (możesz go dodać wcześniej ręcznie),
        driver.findElement(By.name("confirm-addresses")).click();

//wybierze metodę odbioru - PrestaShop "pick up in store",
        driver.findElement(By.id("delivery_option_1")).click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.of(5, ChronoUnit.SECONDS));
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.name("confirmDeliveryOption")));
        driver.findElement(By.name("confirmDeliveryOption")).click();
//wybierze opcję płatności - Pay by Check,


//kliknie na "order with an obligation to pay",


//zrobi screenshot z potwierdzeniem zamówienia i kwotą.


        //driver.quit();
    }}

