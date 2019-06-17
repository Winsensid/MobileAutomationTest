package ebayPackageTest;

import base.MobileAPI2;
import ebayPackage.EbayClass;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayClassTest extends MobileAPI2 {

    EbayClass ebayClass;
    @BeforeMethod
    public void init(){
        ebayClass = PageFactory.initElements(appiumDriver, EbayClass.class);
    }
    @Test(enabled = false)
    public void setHomeTest(){
        ebayClass.setHome();
    }

    @Test(enabled = false)
    public void setShoppingCar(){
        ebayClass.setShoppingCard();
    }
    @Test (enabled = false)
    public void setSearchField(){

        ebayClass.setSearchField();
    }
    @Test(enabled = false)
    public void setSellingButton(){

        ebayClass.setSellingButton();
    }
    @Test(enabled = false)
    public void setDealsButton(){

        ebayClass.setDealsButton();
    }
    @Test(enabled = false)
    public void setCategoriesButton(){

        ebayClass.setCategoriesButton();
    }

    @Test (enabled = false)
    public void setSavedButton(){
        ebayClass.setSavedButton();
    }
    @Test (enabled = false)
    public void setSearchByPhoto(){
        ebayClass.setSearchByPhoto();
    }
    @Test(enabled = false)
    public void setSignInGoogle(){
        ebayClass.setSignInGoogle();
    }
    @Test(enabled = false)
    public void setHamburger(){
        ebayClass.setHamburger();
    }
    @Test(enabled = false)
    public void setWatchingButton(){
        ebayClass.setWatchingButton();
    }
}
