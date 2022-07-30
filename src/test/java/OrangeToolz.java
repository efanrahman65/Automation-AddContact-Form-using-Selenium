import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class OrangeToolz {
        WebDriver driver;

        @Before
        public void setup() {
                System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--headed");

                driver = new ChromeDriver(options);
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }



        @Test
        public void writeForm() throws InterruptedException {
                driver.get("http://159.89.38.11/login");
                WebElement txtEmail = driver.findElement(By.cssSelector("[type='email']"));
                txtEmail.sendKeys("test@orangetoolz.com");
                WebElement txtPassword = driver.findElement(By.cssSelector("[type='password']"));
                txtPassword.sendKeys("8Kh8nTe*^jdk");
                //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                Thread.sleep(50000);
                WebElement button = driver.findElement(By.tagName("button"));
                button.click();


                WebElement contactManageIcon = driver.findElement(By.xpath("//I[@class='fas fa-id-card fa-lg']"));
                contactManageIcon.click();
                WebElement contactManage = driver.findElement(By.xpath("//SPAN[@class='dt-side-nav__text'][text()='Contact Manage']"));
                contactManage.click();
                WebElement addContact = driver.findElement(By.xpath("(//A[@href='javascript:void(0)'])[5]"));
                addContact.click();

                //Filling up the Form

                // type number

                WebElement txtNumber = driver.findElement(By.cssSelector("[type='number']"));
                txtNumber.sendKeys("1688040999900");

                //Set Email
                WebElement idEmail = driver.findElement(By.name("email"));
                idEmail.sendKeys("ziaur.cuet.cse@gmail.com");


                 // identify element
                 WebElement m=driver.findElement(By.xpath("//DIV[@class='dt-card__body tabs-container']"));
                 //Javascript executor
                 ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", m); //Scroll Down

                //Set First Name
                WebElement txtFirstName = driver.findElement(By.name("first_name"));
                txtFirstName.sendKeys("Ziaur");

                //Set Last Name
                WebElement txtLastName = driver.findElement(By.name("last_name"));
                txtLastName.sendKeys("Rahman");

                //Set Birth Date
                WebElement txtDob = driver.findElement(By.xpath("(//INPUT[@type='text'])[11]"));
                txtDob.sendKeys("1996-12-06");

                //Set City
                WebElement txtCity = driver.findElement(By.name("city"));
                txtCity.sendKeys("Dhaka");

                //Set State
                WebElement txtState = driver.findElement(By.name("state"));
                txtState.sendKeys("Dhaka");

                //Set Zip Code
                WebElement txtZip = driver.findElement(By.name("zip"));
                txtZip.sendKeys("2030");

                //Set Country
                WebElement txtCountry = driver.findElement(By.name("country"));
                txtCountry.sendKeys("Bangladesh");

                //Set Address
                WebElement txtAddress = driver.findElement(By.name("address"));
                txtAddress.sendKeys("Sector12, Uttara");

                //Submit the Form
                WebElement txtSubmit = driver.findElement(By.xpath("//BUTTON[@class='btn btn-primary submit-file'][text()='Add Contact']"));
                txtSubmit.click();



        }

}