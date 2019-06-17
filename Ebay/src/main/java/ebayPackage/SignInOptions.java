package ebayPackage;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInOptions extends MobileAPI2 {

@FindBy (id = "com.ebay.mobile:id/textview_sign_out_status\n")
    WebElement SigninButton;

public void setSigninButton(){
    SigninButton.click();
    }
}
