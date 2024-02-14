package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HistoryPage {

    public HistoryPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='MuiInputBase-input MuiOutlinedInput-input css-1x5jdmq']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//*[@class='MuiInputBase-input MuiOutlinedInput-input MuiInputBase-inputAdornedEnd css-1uvydh2']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "(//button[normalize-space()='Login'])[1]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='MuiButtonBase-root MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeLarge MuiButton-textSizeLarge MuiButton-root MuiButton-text MuiButton-textPrimary MuiButton-sizeLarge MuiButton-textSizeLarge css-ic1i4k']")
    public WebElement skipforNowButton;

    @FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-18euqpt'])[2]")
    public WebElement chargebacksMenu;

    @FindBy(xpath = "(//a[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-rp9w8u'])[3]")
    public WebElement historyByStoreMenu;

    @FindBy(xpath = "//tbody")
    public WebElement table;

    @FindBy(xpath = "//td[2]")
    public List<WebElement>  td2Elements;

    @FindBy(xpath = "(//td[2])[11]")
    public WebElement actualSum;

    @FindBy(xpath = "(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-i4bv87-MuiSvgIcon-root'])[3]")
    public WebElement nextButton;

    @FindBy(css = "div#main_start_app div.MuiStack-root.css-udwogp > div > div > div > div")
    public WebElement DDM;

    @FindBy(xpath = "//li[@data-value='50']")
    public WebElement row50;

}
