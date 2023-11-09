package tests;

import org.testng.annotations.Test;
import pages.WelcomeScreen;

public class FirstTest extends BaseTest {

    @Test
    public void test(){
        System.out.println("ohlaaa");
        WelcomeScreen welcomeScreen = getWelcomScreeen();
        welcomeScreen.clickOnForm();
    }
}
