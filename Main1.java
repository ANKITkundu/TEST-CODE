import com.codeborne.selenide.Selenide;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
public class Main1 {
    public static void main(String[] args) {

        open("https://www.imdb.com");
        $(By.id("suggestion-search")).setValue("Game of Thrones").sendKeys(Keys.ENTER);
        System.out.println($(By.linkText("Game of Thrones")).getText());
        System.out.println($(By.linkText("Game of Thrones: A Telltale Games Series")).getText());
        System.out.println(Selenide.title());
        String pngFileName = screenshot("my_file_name");
    }
}
