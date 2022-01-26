package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class signInPage {

   WebDriver driver;

By txt_email = By.className("form-control");

By txt_password = By.name("password");

By btn_signIn = By.id("submit-login");

public void enterEmail(String joanna.m.malek@gmail.com) {

   driver.findElement(txt_email).sendKeys(joanna.m.malek@gmail.com);
}

public void enterPassword (String PastelTropics){
driver.findElement(txt_password).sendKeys(PastelTropics);

}

public void clickSignIn(){

   driver.findElement(btn_signIn).click();
}

  //  WebElement email = driver.findElement(By.className("form-control"));
   //     email.sendKeys("joanna.m.malek@gmail.com");

  //  WebElement name = driver.findElement(By.name("password"));
  //      name.sendKeys("PastelTropics");

  //  WebElement submit = driver.findElement(By.id("submit-login"));
  //      submit.click();




}
