package tests;

import org.testng.annotations.Test;

public class AccountsTest extends  BaseTest{
    @Test(description = "Check if User can create an account")
    public void createAccount(){
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        accountsPage.open();
        accountsPage.clickNew();
        accountsPage.fillIN("test", "+375291111111", "https://www.google.com/",
                "Description", "12", "test", "test", "11111",
                "test", "test", "test", "test", "11111",
                "test", "test");
        accountsPage.save();
    }
}