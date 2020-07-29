package org.example;

import org.openqa.selenium.By;

public class RegisterSuccessPage extends Util{
    private By _registerSuccessfulMessage = By.xpath("//div[text()=\"Your registration completed\"]");
    String expectedRegisterSuccessfulMessage = "Your registration completed";

    public void verifyUserIsOnRegisterResultPage(){
        assertURL("registerresult");
    }



    public void userCanSeeSuccessfulMessage()
    {
        assertTextMessage(getTextFromElement(_registerSuccessfulMessage),expectedRegisterSuccessfulMessage,"user on register page");
        System.out.println(_registerSuccessfulMessage);
    }


}
