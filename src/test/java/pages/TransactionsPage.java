package pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TransactionsPage {

    public TransactionsPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//*[@class='MuiTypography-root MuiTypography-body1 MuiListItemText-primary css-18euqpt'])[2]")
    public WebElement chargebacksMenu;

    @FindBy(xpath = "(//a[@class='MuiButtonBase-root MuiListItemButton-root MuiListItemButton-gutters MuiListItemButton-root MuiListItemButton-gutters css-rp9w8u'])[2]")
    public WebElement transactionMenu;

    @FindBy(xpath = "(//*[@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-7qerre-MuiSvgIcon-root'])[1]")
    public WebElement locationsFilter;

    @FindBy(xpath = "//button[normalize-space()='Clear']")
    public WebElement clearButtoninLocations;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")
    public WebElement checkboxArtisan;

    @FindBy(xpath = "(//input[@type='checkbox'])[8]")
    public WebElement checkboxBlissful;

    @FindBy(xpath = "//button[normalize-space()='Apply (2 selected)']")
    public WebElement applyButtoninLocations;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[3]/main[1]/div[1]/div[1]/header[1]/div[1]/div[1]/button[3]")
    public WebElement marketplacesFilter;
    //(//*[@class='MuiTouchRipple-root css-8je8zh-MuiTouchRipple-root'])[4] ---- not working

    @FindBy(xpath = "//button[normalize-space()='Clear']")
    public WebElement clearButtoninMarketplaces;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement checkboxGrubhub;

    @FindBy(xpath = "//button[normalize-space()='Apply (1 selected)']")
    public WebElement applyButtoninMarketplaces;

    @FindBy(xpath = "//button[normalize-space()='Download']")
    public WebElement downloadButton;

    @FindBy(xpath = "//table[@class='MuiTable-root css-15i8i05-MuiTable-root']")
    public List<WebElement> table;














}
