package com.example.actions;


import com.example.locators.HomePageLocators;
import org.openqa.selenium.support.PageFactory;
import com.example.utils.HelperClass;

public class HomePageActions {

    HomePageLocators homePageLocators = null;

    public HomePageActions() {

        this.homePageLocators = new HomePageLocators();
        PageFactory.initElements(HelperClass.getDriver(),homePageLocators);
    }

    public String getHomePageText() {
        System.out.println("Heading :" + homePageLocators.homePageUserName.getText());
        return homePageLocators.homePageUserName.getText();
    }

}