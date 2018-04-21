package search;

import base.CommonAPI;
import home.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSearch extends CommonAPI{

    @Test
    public void test2() {
        SearchPage searchPage = PageFactory.initElements(driver, SearchPage.class);
        searchPage.searchItems();
    }

    //@Test
    public void search(){
        typeOnInputField("twotabsearchtextbox","iPhone");
        clickOnElement(".nav-input");
    }
}
