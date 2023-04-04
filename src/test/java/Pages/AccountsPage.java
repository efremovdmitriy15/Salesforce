package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import wrappers.Input;
import wrappers.TextArea;

public class AccountsPage extends BasePage {
    public AccountsPage (WebDriver driver) {
        super(driver);
    }

    @Step("Opening accounts page")
    public void open() {
        driver.get("https://kazak.lightning.force.com/lightning/o/Account/list?filterName=Recent");
    }

    @Step ("Clicking on New account")
    public void clickNew(){
        driver.findElement(By.cssSelector("[title=New]")).click();
    }

    @Step ("Filling in New Account's form")
    public void fillIN(String accountName, String phone, String website, String description, String employees,
                       String billingStreet, String billingCity, String billingZipCode, String billingState,
                       String billingCountry, String shippingStreet, String shippingCity, String shippingZipCode,
                       String shippingState, String shippingCountry) {
        new Input(driver, "Account Name").write(accountName);
        new Input(driver, "Phone").write(phone);
        new Input(driver, "Website").write(website);
        new TextArea(driver, "Description").write(description);
        new Input(driver, "Employees").write(employees);
        new TextArea(driver, "Billing Street").write(billingStreet);
        new Input(driver, "Billing City").write(billingCity);
        new Input(driver, "Billing Zip/Postal Code").write(billingZipCode);
        new Input(driver, "Billing State/Province").write(billingState);
        new Input(driver, "Billing Country").write(billingCountry);
        new TextArea(driver, "Shipping Street").write(shippingStreet);
        new Input(driver, "Shipping City").write(shippingCity);
        new Input(driver, "Shipping Zip/Postal Code").write(shippingZipCode);
        new Input(driver, "Shipping State/Province").write(shippingState);
        new Input(driver, "Shipping Country").write(shippingCountry);
    }

    @Step ("Saving new account")
    public void save() {
        driver.findElement(By.xpath("//button[text()='Save']")).click();
    }
}
