package com.TestBBC;

import com.TestBBC.Homepage.Home_page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;

/**
 * Created by Trupesh on 14/06/2017.
 */
public class Commonpage extends Basepage{


    public Commonpage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }


    public void teardown(){
    driver.quit();
}

}
