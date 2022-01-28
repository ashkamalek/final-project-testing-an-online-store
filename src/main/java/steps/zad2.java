package steps;

import io.cucumber.java.en.And;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

public class zad2 {
    public static void main(String[] args) throws IOException {

      //  System.setProperty("webdriver.gecko.driver", "D:\\intellij for selenium\\firefox\\geckodriver\\geckodriver.exe"); // Setting system properties of FirefoxDriver
      //  WebDriver driver = new FirefoxDriver(); //Creating an object of FirefoxDriver

        System.setProperty("webdriver.chrome.driver", "D:\\intellij for selenium\\SeleniumCourse2\\src\\main\\sources\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

       // System.setProperty("webdriver.opera.driver", "D:\\intellij for selenium\\opera\\operadriver_win64\\operadriver.exe");
       // WebDriver driver = new OperaDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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

        driver.findElement(By.name("address1")).sendKeys("201 Ohua Ave");
        driver.findElement(By.name("postcode")).sendKeys("96811");
        driver.findElement(By.name("city")).sendKeys("Honolulu");
        driver.findElement(By.name("phone")).sendKeys("5555555");
        WebElement source = driver.findElement(By.name("id_country"));
        Select list1 = new Select(source);
        list1.selectByVisibleText("United Kingdom");

        driver.findElement(By.name("confirm-addresses")).click();

//wybierze metodę odbioru - PrestaShop "pick up in store",

        WebDriverWait wait4 = new WebDriverWait(driver, Duration.of(30, ChronoUnit.SECONDS));
        wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"js-delivery\"]/div/div[1]/div[1]/div/span")));
        driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/div/div[1]/div[1]/div/span")).click();

        WebDriverWait wait2 = new WebDriverWait(driver, Duration.of(30, ChronoUnit.SECONDS));
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='confirmDeliveryOption']")));
        driver.findElement(By.xpath("//button[@name='confirmDeliveryOption']")).click();

        //wybierze opcję płatności - Pay by Check,

        driver.findElement(By.id("payment-option-1")).click();

        driver.findElement(By.xpath("//*[@id=\"conditions-to-approve\"]/ul/li/div[1]/span")).click();

//kliknie na "order with an obligation to pay",
        driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]")).click();

//zrobi screenshot z potwierdzeniem zamówienia i kwotą.

        Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

        ImageIO.write(screenshot.getImage(), "jpg", new File("D:\\intellij for selenium\\moj projekt\\mamochoteududisctgokota\\SC"));

        //wykopsanie adresu
        WebDriverWait wait5 = new WebDriverWait(driver, Duration.of(70, ChronoUnit.SECONDS));
        wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]")));
        driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]")).click();

        driver.findElement(By.xpath("//*[@id=\"addresses-link\"]/span")).click();

        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/div[1]/article/div[2]/a[2]")).click();

        //driver.quit();
    }}

