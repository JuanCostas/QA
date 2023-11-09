package pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WelcomeScreen extends BaseScreen {

    @AndroidFindBy(uiAutomator = "new UiSelector().className(android.widget.TextView).textContains(Forms)")
    private AndroidElement formButton;


    public WelcomeScreen (AndroidDriver<AndroidElement> driver){
     super(driver);
    }

    public void clickOnForm (){
        clickButton(this.formButton);
    }

}
