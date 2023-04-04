package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public static final By USERNAME_INPUT = By.id("username");
    public static final By PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");
    public LoginPage (WebDriver driver) {
        super(driver);
    }

    @Step ("Opening login page")
    public void open(){
        driver.get(BASE_URL);
    }
    @Step ("Login by user '{user}'")
    public void login(String user, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        driver.findElement((By.cssSelector("[title=User]"))).isDisplayed();
    }
}