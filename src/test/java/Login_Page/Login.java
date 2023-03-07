package Login_Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Login {
@FindBy(xpath = "//td[text()='Test Task']//following-sibling::td[2]/button")
    WebElement Editbtn;

    WebDriver driver;
    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }


    public String Login_With_valid() throws IOException, InterruptedException {
        Thread.sleep(2000);
        Editbtn.click();

     return null;
    }
}
