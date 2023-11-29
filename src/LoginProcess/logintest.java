package LoginProcess;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

    WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        // Additional setup code can be added here, such as navigating to the website
    }

    @Test(priority = 3)
    public void printItemNames() {
        List<WebElement> addToCartButtons = driver.findElements(By.className("btn"));
        List<WebElement> itemsNames = driver.findElements(By.className("inventory_item_name"));

        for (int i = 0; i < addToCartButtons.size(); i++) {
            addToCartButtons.get(i).click();
        }

        for (int i = 0; i < itemsNames.size(); i++) {
            String itemName = itemsNames.get(i).getText();
            System.out.println(itemName);
        }
    }

    @AfterTest
    public void postTesting() {
        driver.quit();
        // Additional cleanup code can be added here
    }
}
public class FinalPriceCheck {
    public static void main(String[] args) {
        // Assuming finalPrice is the variable that holds the value of the final price after tax
        double finalPrice = calculateFinalPrice(); // You should replace this with the actual calculation of the final price

        if (finalPrice % 2 == 0) {
            System.out.println("The final price is even and the value is: " + finalPrice);
        } else {
            System.out.println("The final price is odd and the value is: " + finalPrice);
        }
    }

    // Example method for calculating the final price (replace this with your actual calculation)
    private static double calculateFinalPrice() {
        // Replace this with your actual calculation logic
        double basePrice = 100.0; // Replace with the actual base price
        double taxRate = 0.1; // Replace with the actual tax rate
        return basePrice * (1 + taxRate);
    }
}
