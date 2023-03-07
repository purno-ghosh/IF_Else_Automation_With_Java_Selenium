package Login_Page;

import SetUp_Page.Setup;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login_Runner extends Setup {
    Login object;


    //https://demo.zeuz.ai/web/level/two/test/web_level_two_scenerio_edit_delete_test

    @Test(enabled = true, priority = 0)
    public void Login_With_valid() throws IOException, InterruptedException {
        driver.get("https://demo.zeuz.ai/web/level/two/test/web_level_two_scenerio_edit_delete_test");
//   object = new Login(driver);
//   String nn = object.Login_With_valid();
//   Assert.assertEquals(nn, "PRODUCTS");
//   System.out.println("Assertion Done ! Result::> " + nn);
    }
}
