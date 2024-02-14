package Utilities;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.asserts.SoftAssert;
import pages.HistoryPage;

import static org.junit.Assert.assertEquals;

public class ReusableMethods {

    static HistoryPage historyPage=new HistoryPage();
    static SoftAssert softAssert=new SoftAssert();

    public static void wait(int saniye){
        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/test-output/Screenshots/" + name + date + ".png";
        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);
        return target;
    }


    //JS
    // A function that scrolls the page up to the specified element.
    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void TestSums(){
    double expSum=0;
    HistoryPage historyPage = new HistoryPage();
            for (int i = 2; i < 9; i++) {
                List<WebElement> tableOrder = Driver.getDriver().findElements(By.xpath("//td[" + i + "]"));
                WebElement actSumElement = Driver.getDriver().findElement(By.xpath("(//td[" + i + "])[11]"));
                for (int j = 0; j <10; j++) {
                    String deger = tableOrder.get(j).getText().replaceAll("[^\\d.]", "");
                    expSum += Double.parseDouble(deger);
                }
                String actSumStr = actSumElement.getText().replaceAll("[^\\d.]", "");
                double actSum = Double.parseDouble(actSumStr);
                System.out.println(i + " .column sums:" + expSum + " and " + actSum + " was seen as Grand Total");
                //actions.moveToElement(historyPage.nextButton).perform();
                 // historyPage.nextButton.click();
                softAssert.assertEquals(actSum, expSum);
            }
        softAssert.assertAll();
    }


}

