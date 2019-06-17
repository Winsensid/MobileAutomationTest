package ebayPackage;

import base.MobileAPI2;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayClass extends MobileAPI2 {

    @FindBy(id = "com.ebay.mobile:id/home")
    WebElement home;

    @FindBy(xpath = "//android.widget.ImageView[@content-desc=\"shopping cart\"]\n")
    WebElement shoppingCar;

    @FindBy(id = "com.ebay.mobile:id/search_box\n")
    WebElement searchField;

    @FindBy (xpath = "//android.widget.TextView[@content-desc=\"Selling button\"]")
    WebElement sellingButton;

    @FindBy(xpath = "//android.widget.TextView[@content-desc=\"Deals button\"]")
    WebElement dealsButton;

    @FindBy (xpath = "//android.widget.TextView[@content-desc=\"Categories button\"]\n")
    WebElement categoriesButton;

    @FindBy (xpath = "//android.widget.TextView[@content-desc=\"Saved button\"]")
    WebElement savedButton;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Image search options\"]\n")
    WebElement searchByPhoto;

    @FindBy (id = "com.ebay.mobile:id/button_google\n")
    WebElement SignInGoogle;

    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]\n")
    WebElement Hamburger;

    @FindBy(id = "com.ebay.mobile:id/recycler_view_main\n")
    WebElement WatchingButton;

    public void setHome(){

        home.click();
    }

    public void setShoppingCard(){

        shoppingCar.click();
    }

    public void setSearchField(){

        searchField.sendKeys("Macbook Pro");
    }

    public void setSellingButton(){

        sellingButton.click();
    }

    public void setDealsButton(){

        dealsButton.click();
    }

    public void setCategoriesButton(){

        categoriesButton.click();
    }

    public void setSavedButton(){

        savedButton.click();
    }

    public void setSearchByPhoto(){

        searchByPhoto.click();
    }
    public void setSignInGoogle(){
        SignInGoogle.click();
    }

    public void setHamburger(){
        Hamburger.click();
    }
    public void setWatchingButton(){
        WatchingButton.click();
    }
}
