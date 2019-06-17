package ebayPackageTest;

import base.MobileAPI2;
import ebayPackage.Categories;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CategoriesTest extends MobileAPI2 {


    Categories categories;

    @BeforeMethod
    public void init(){
        categories = PageFactory.initElements(appiumDriver, Categories.class);
    }
    @Test
    public void setCategoriesTest(){
        categories.setCategories();
    }
    @Test
    public void setArtTest(){
        categories.setCategories();
        categories.setArt();
    }
    @Test
    public void setArtTest2(){
        categories.setCategories();
        categories.setArt();
        categories.setArtprints();
    }
    @Test
    public void setFilterTest(){
        categories.setCategories();
        categories.setArt();
        categories.setArtprints();
        categories.setFilter();
    }
}

