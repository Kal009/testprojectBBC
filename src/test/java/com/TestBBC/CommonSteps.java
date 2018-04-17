package com.TestBBC;

import com.TestBBC.Homepage.Home_page;
import com.TestBBC.Loginpage.Login_page;
import com.TestBBC.Newspage.News_page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.io.IOException;

/**
 * Created by Trupesh on 14/06/2017.
 */
public class CommonSteps extends BaseSteps{
        Home_page hp;
        Commonpage cp = new Commonpage(driver);


        public CommonSteps() throws IOException {
        }
}
