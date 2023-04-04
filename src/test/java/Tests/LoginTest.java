
package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(description = "Check if User can log in")
    public void login() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
    }
}