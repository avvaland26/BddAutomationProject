package org.example;

import org.openqa.selenium.By;


public class RegisterPage extends Util{
    //Registration locators
    private By _gender = By.xpath("//input[@id=\"gender-female\"]");
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _dateOfBirthday = By.xpath("//select[@name=\"DateOfBirthDay\"]");
    private By _dateOfBirthMonth = By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    private By _dateOfBirthYear = By.xpath("//select[@name=\"DateOfBirthYear\"]");
    private By _emailField = By.xpath("//input[@id=\"Email\"]");
    private By _companyName = By.xpath("//input[@id=\"Company\"]");
    private By _newsLetter = By.xpath("//input[@id=\"Newsletter\"]");
    private By _password = By.xpath("//input[@id=\"Password\"]");
    private By _confirmPassword = By.xpath("//input[@id=\"ConfirmPassword\"]");
    private By _registerSubmitButton = By.xpath("//input[@id=\"register-button\"]");

    public void verifyUserIsOnRegistrationPage(){

        assertURL("register");
    }
    public void userEnterRegistrationDetails(){
        //sleep1(2);
        clickOnElement(_gender);
        typeText(_firstName,"Anjana");
        typeText(_lastName,"Valand");
        //sleep1(2);
        selectFromDropDownByVisibleText(_dateOfBirthday,"15");
        //sleep1(2);
        selectFromDropDownByVisibleText(_dateOfBirthMonth,"March");
        //sleep1(2);
        selectFromDropDownByVisibleText(_dateOfBirthYear,"2000");
        typeText(_emailField,"kavyanjali2614+"+timestamp()+"@gmail.com");
        typeText(_companyName,"ABC Ltd");
        clickOnElement(_newsLetter);
        typeText(_password,"unique");
        typeText(_confirmPassword,"unique");

    }
    public void userClickOnSubmitButton(){
        //sleep1(2);
        clickOnElement(_registerSubmitButton);
    }
}

