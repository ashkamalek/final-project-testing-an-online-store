package zadania;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class zad2 {
    public static void main(String[] args) {


        System.setProperty("webdriver.opera.driver", "D:\\intellij for selenium\\opera\\operadriver_win64\\operadriver.exe");
        WebDriver driver = new OperaDriver();

//zaloguje się na tego samego użytkownika z zadania 1,
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
        driver.findElement(By.id("_desktop_user_info")).click();

        driver.findElement(By.className("form-control")).sendKeys("joanna.m.malek@gmail.com");
        driver.findElement(By.name("password")).sendKeys("PastelTropics");
        driver.findElement(By.id("submit-login")).click();

//wybierze do zakupu Hummingbird Printed Sweater,
        driver.findElement(By.id("category-3")).click();
        driver.findElement(By.xpath("//img[@alt='Brown bear printed sweater']")).click();

//wybierze rozmiar M,
      //driver.findElement(By.xpath("//section/p[text() = 'Size']/..//li")).click();

//wybierze 5 sztuk według parametru podanego w teście,


//dodaj produkt do koszyka,
        driver.findElement(By.className("add")).click();

//przejdzie do opcji - checkout,
        driver.findElement(By.xpath("//a[@href='//mystore-testlab.coderslab.pl/index.php?controller=cart&amp;action=show']")).click();




        //*[@class="btn btn-primary"] class="btn btn-primary
//potwierdzi address (możesz go dodać wcześniej ręcznie),


//wybierze metodę odbioru - PrestaShop "pick up in store",
        driver.findElement(By.id("delivery_option_1")).click();

//wybierze opcję płatności - Pay by Check,


//kliknie na "order with an obligation to pay",


//zrobi screenshot z potwierdzeniem zamówienia i kwotą.

    }}

