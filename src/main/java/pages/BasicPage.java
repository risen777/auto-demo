package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Sergey
 */
public class BasicPage {

    public void clickButton(String text){
  $(By.xpath("//div[text()='"+text+"']")).click();


    }

    public void clickButtonSpan(String text){
        $(By.xpath("//span[text()='"+text+"']/..")).click();

    }

    public void contentIsVisibleAlt(String text){
        $(By.xpath("//*[@alt='"+text+"']")).shouldBe(Condition.visible);

    }

}
