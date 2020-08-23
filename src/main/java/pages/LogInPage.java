package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sergey
 */
public class LogInPage {

  private   SelenideElement loginInput = $(By.cssSelector("#email"));
  private   SelenideElement passwordInput = $(By.cssSelector("#password"));

  public void inputLogin(String text){
    this.loginInput.val(text);

  }

  public void inputPassword(String text){
    this.passwordInput.val(text);

  }





}
