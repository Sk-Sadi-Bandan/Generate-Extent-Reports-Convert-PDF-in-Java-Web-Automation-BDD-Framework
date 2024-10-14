package extentreport.version0;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class ExtentReportTests {
    private static ExtentSparkReporter sparkReporter;
    private static ExtentReports extent;
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private int wait = 3000;

    @BeforeAll
    public static void beforeAll() throws IOException {
        WebDriverManager.chromedriver().setup();
        extent = new ExtentReports();
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") +"\\test-output\\testReport.html");
        extent.attachReporter(sparkReporter);

        sparkReporter.config().setOfflineMode(true);
        sparkReporter.config().setDocumentTitle("Pickaboo Automation Report");
        sparkReporter.config().setReportName("Test Report");
        sparkReporter.config().setTheme(Theme.STANDARD);
        sparkReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");
        sparkReporter.config().setEncoding("UTF-8");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void findElementByCompleteTextMatch() {
        extentTest = extent.createTest("Pickaboo Test Automation Result by Extent Report", "Test finding element by complete text match");

        extentTest.log(Status.INFO,"Starting the tests : " + extentTest.getStatus());
        extentTest.assignCategory("First_Test");

        try {
            driver.get("https://www.pickaboo.com/login/");

            WebElement checkBoxDemoPage1 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/Email']"));
            checkBoxDemoPage1.click();
            Thread.sleep(wait);

            WebElement messageInputBox1 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/Email']"));
            messageInputBox1.sendKeys("01749653931");
            Thread.sleep(wait);

            WebElement checkBoxDemoPage2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            checkBoxDemoPage2.click();
            Thread.sleep(wait);

            WebElement messageInputBox2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
            messageInputBox2.sendKeys("sadi1234");
            Thread.sleep(wait);

            WebElement checkBoxDemoPage3 = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
            checkBoxDemoPage3.click();
            Thread.sleep(wait);

            WebElement checkBoxDemoPage4 = driver.findElement(By.xpath("//div[@class='home-banner__menu']//a[@class='a-tag'][normalize-space()='Smartphones']"));
            checkBoxDemoPage4.click();
            Thread.sleep(wait);

//            WebElement header = driver.findElement(By.tagName("h1"));
//            Assertions.assertEquals("Checkbox Demo", header.getText());

            extentTest.log(Status.PASS, "First test passed");
        } catch (Exception ex) {
            extentTest.log(Status.FAIL, ex);
            //throw ex;
        }
    }

    @Test
    public void findElementByCompleteTextMatch_second() {
        extentTest = extent.createTest("Pickaboo Test Automation Result by Extent Report", "Test finding element by complete text match");

        extentTest.log(Status.INFO,"Starting the tests : " + extentTest.getStatus());
        extentTest.assignCategory("Second_Test");

        try {
            driver.get("https://www.pickaboo.com/");

//            WebElement checkBoxDemoPage1 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/Email']"));
//            checkBoxDemoPage1.click();
//            Thread.sleep(wait);
//
//            WebElement messageInputBox1 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/Email']"));
//            messageInputBox1.sendKeys("01749653931");
//            Thread.sleep(wait);
//
//            WebElement checkBoxDemoPage2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//            checkBoxDemoPage2.click();
//            Thread.sleep(wait);
//
//            WebElement messageInputBox2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//            messageInputBox2.sendKeys("sadi1234");
//            Thread.sleep(wait);
//
//            WebElement checkBoxDemoPage3 = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//            checkBoxDemoPage3.click();
//            Thread.sleep(wait);

            WebElement checkBoxDemoPage4 = driver.findElement(By.xpath("//div[@class='home-banner__menu']//a[@class='a-tag'][normalize-space()='Electronics & Appliances']"));
            checkBoxDemoPage4.click();
            Thread.sleep(wait);

//            WebElement header = driver.findElement(By.tagName("h1"));
//            Assertions.assertEquals("Checkbox Demo", header.getText());

            extentTest.log(Status.PASS, "Second test passed");
        } catch (Exception ex) {
            extentTest.log(Status.FAIL, ex);
        }
    }

    @Test
    public void findElementByCompleteTextMatch_third() {
        extentTest = extent.createTest("Pickaboo Test Automation Result by Extent Report", "Test finding element by complete text match");

        extentTest.log(Status.INFO,"Starting the tests : " + extentTest.getStatus());
        extentTest.assignCategory("Third_Test");

        try {
            driver.get("https://www.pickaboo.com/");

//            WebElement checkBoxDemoPage1 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/Email']"));
//            checkBoxDemoPage1.click();
//            Thread.sleep(wait);
//
//            WebElement messageInputBox1 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/Email']"));
//            messageInputBox1.sendKeys("01749653931");
//            Thread.sleep(wait);
//
//            WebElement checkBoxDemoPage2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//            checkBoxDemoPage2.click();
//            Thread.sleep(wait);
//
//            WebElement messageInputBox2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//            messageInputBox2.sendKeys("sadi1234");
//            Thread.sleep(wait);
//
//            WebElement checkBoxDemoPage3 = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//            checkBoxDemoPage3.click();
//            Thread.sleep(wait);

            WebElement checkBoxDemoPage4 = driver.findElement(By.xpath("//div[@class='home-banner__menu']//a[@class='a-tag'][normalize-space()='Mobile Accessories']"));
            checkBoxDemoPage4.click();
            Thread.sleep(wait);

//            WebElement header = driver.findElement(By.tagName("h1"));
//            Assertions.assertEquals("Checkbox Demo", header.getText());

            extentTest.log(Status.PASS, "Third test passed");
        } catch (Exception ex) {
            extentTest.log(Status.FAIL, ex);
        }
    }

    @Test
    public void findElementByCompleteTextMatch_4() {
        extentTest = extent.createTest("Pickaboo Test Automation Result by Extent Report", "Test finding element by complete text match");

        extentTest.log(Status.INFO,"Starting the tests : " + extentTest.getStatus());
        extentTest.assignCategory("Fourth_Test");

        try {
            driver.get("https://www.pickaboo.com/");

//            WebElement checkBoxDemoPage1 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/Email']"));
//            checkBoxDemoPage1.click();
//            Thread.sleep(wait);
//
//            WebElement messageInputBox1 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/Email']"));
//            messageInputBox1.sendKeys("01749653931");
//            Thread.sleep(wait);
//
//            WebElement checkBoxDemoPage2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//            checkBoxDemoPage2.click();
//            Thread.sleep(wait);
//
//            WebElement messageInputBox2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//            messageInputBox2.sendKeys("sadi1234");
//            Thread.sleep(wait);
//
//            WebElement checkBoxDemoPage3 = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//            checkBoxDemoPage3.click();
//            Thread.sleep(wait);

            WebElement checkBoxDemoPage4 = driver.findElement(By.xpath("//div[@class='home-banner__menu']//a[@class='a-tag'][normalize-space()='Computers']"));
            checkBoxDemoPage4.click();
            Thread.sleep(wait);

//            WebElement header = driver.findElement(By.tagName("h1"));
//            Assertions.assertEquals("Checkbox Demo", header.getText());

            extentTest.log(Status.PASS, "Fourth test passed");
        } catch (Exception ex) {
            extentTest.log(Status.FAIL, ex);
        }
    }

    @Test
    public void SingleInputTest() {
        extentTest = extent.createTest("Pickaboo Test Automation Result by Extent Report", "Test finding element by complete text match");

        extentTest.log(Status.INFO,"Starting the tests : " + extentTest.getStatus());
        extentTest.assignCategory("Fifth_Test");

        try {
            driver.get("https://www.pickaboo.com/");

//            WebElement checkBoxDemoPage1 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/Email']"));
//            checkBoxDemoPage1.click();
//            Thread.sleep(wait);
//
//            WebElement messageInputBox1 = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/Email']"));
//            messageInputBox1.sendKeys("01749653931");
//            Thread.sleep(wait);
//
//            WebElement checkBoxDemoPage2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//            checkBoxDemoPage2.click();
//            Thread.sleep(wait);
//
//            WebElement messageInputBox2 = driver.findElement(By.xpath("//input[@placeholder='Password']"));
//            messageInputBox2.sendKeys("sadi1234");
//            Thread.sleep(wait);
//
//            WebElement checkBoxDemoPage3 = driver.findElement(By.xpath("//span[@class='MuiButton-label']"));
//            checkBoxDemoPage3.click();
//            Thread.sleep(wait);

            WebElement checkBoxDemoPage4 = driver.findElement(By.xpath("//div[@class='home-banner__menu']//a[@class='a-tag'][normalize-space()='Computer Accessories']"));
            checkBoxDemoPage4.click();
            Thread.sleep(wait);

//            WebElement header = driver.findElement(By.tagName("h1"));
//            Assertions.assertEquals("Checkbox Demo", header.getText());

            extentTest.log(Status.PASS, "Fifth test passed");
        } catch (Exception ex) {
            extentTest.log(Status.FAIL, ex);
        }
    }


    @AfterAll
    public static void afterClassCore(TestInfo testInfo) {
        if (driver != null) {
            driver.quit();
        }

        extent.flush();
    }
}