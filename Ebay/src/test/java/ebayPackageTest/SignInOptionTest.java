package ebayPackageTest;

import base.MobileAPI2;
import ebayPackage.EbayClass;
import ebayPackage.SignInOptions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInOptionTest extends MobileAPI2 {


    EbayClass signInOptions;

    @BeforeMethod
    public void init() {
        signInOptions = PageFactory.initElements(appiumDriver, EbayClass.class);
    }

    @Test
    public void setSignInButton() {


    }
}
