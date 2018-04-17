package com.TestBBC.Loginpage;

import com.TestBBC.BaseSteps;
import com.TestBBC.Commonpage;
import com.TestBBC.Homepage.Home_page;
import com.TestBBC.Newspage.News_page;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

/**
 * Created by Trupesh on 14/06/2017.
 */
public class LoginpageSteps extends BaseSteps {

    Commonpage cp;
    Home_page hp;
    Login_page lp = new Login_page(driver);

    public LoginpageSteps() throws IOException {
    }

    @After("@Krishna")
    public void teardown(){
        driver.quit();

    }
    @Given("^user is in home page$")
    public void userIsInHomePage() throws Throwable {
        hp =new Home_page(driver);
        hp.homepage();
        System.out.println("start");
    }


    @When("^user click on login page$")
    public void userClickOnLoginPage() throws Throwable {
        Home_page hp = new Home_page(driver);
        hp.loginpagelink();
    }


    @Then("^user can see the sign in page$")
    public void userCanSeeTheSignInPage() throws Throwable {
        Login_page lp = new Login_page(driver);
        lp.resterlink();
    }
    @When("^user enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void userEnterUsernameAndPassword(String arg0, String arg1) throws Throwable {
        lp.loginpage(arg0, arg1);
    }


    @And("^user click on singin botton$")
    public void userClickOnSinginBotton() throws Throwable {
        Login_page lp = new Login_page(driver);
        lp.siginbotton();
    }

    @Then("^user should be in logged in page$")
    public void userShouldBeInLoggedInPage() throws Throwable {
        lp.errormassage();

    }

    @And("^tear down browser$")
    public void tearDownBrowser() throws Throwable {
        cp = new Commonpage(driver);
        cp.teardown();
    }


}
