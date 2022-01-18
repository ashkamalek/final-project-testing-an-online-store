package zadania;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class zad2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.opera.driver", "D:\\intellij for selenium\\opera\\operadriver_win64\\operadriver.exe");
        WebDriver driver = new OperaDriver();

//zaloguje się na tego samego użytkownika z zadania 1,
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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


//dodaj produkt do koszyka,
       // driver.findElement(By.className("add")).click();

//przejdzie do opcji - checkout,
       driver.findElement(By.cssSelector("div.cart-content-btn a")).click();
       driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a")).click();

//potwierdzi address (możesz go dodać wcześniej ręcznie),
        driver.findElement(By.name("confirm-addresses")).click();

//wybierze metodę odbioru - PrestaShop "pick up in store",
        driver.findElement(By.id("delivery_option_1")).click();
       // driver.findElement(By.("confirmDeliveryOption")).click();
//wybierze opcję płatności - Pay by Check,


//kliknie na "order with an obligation to pay",


//zrobi screenshot z potwierdzeniem zamówienia i kwotą.

    }}

