package org.example;

import org.openqa.selenium.By;

public class HomePage extends Util{
    private By _RegistrationButton = By.xpath("//a[@class=\"ico-register\"]");//user click on register button
    private By _welcomeToOurStore = By.xpath("//h2[text()=\"Welcome to our store\"]");//click on welcome store link
    String expected = "Welcome to our store";//compare result


    public void verifyUserIsOnHomePage()

    {
       // sleep1(2);
        assertTextMessage(getTextFromElement(_welcomeToOurStore), expected, "user is on homepage");

    }

    public void clickOnRegisterButton() {
        //sleep1(2);

        clickOnElement(_RegistrationButton);//method for register button
    }

}
