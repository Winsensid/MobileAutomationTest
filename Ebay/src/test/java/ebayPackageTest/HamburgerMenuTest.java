package ebayPackageTest;

import ebayPackage.HamburgerMenu;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HamburgerMenuTest extends HamburgerMenu {

    HamburgerMenu Hamburger;
    @BeforeMethod
    public void init(){
        Hamburger = PageFactory.initElements(appiumDriver, HamburgerMenu.class);
    }

    @Test
    public void setHamburgerTest(){
       Hamburger.setHamburger();
       Hamburger.setHelp();
       Hamburger.setGuest();
    }
    @Test
    public void setHamburger2Test(){
        Hamburger.setHamburger2();

    }

}
