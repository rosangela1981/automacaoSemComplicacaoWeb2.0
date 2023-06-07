package br.com.chronosacademy.pages;

import br.com.chronosacademy.Core.Driver;
import br.com.chronosacademy.maps.NewAccountMap;
import org.openqa.selenium.support.PageFactory;

public class NewAccountPage {
    NewAccountMap newAccountMap;

    public NewAccountPage(){
        newAccountMap = new NewAccountMap();
        PageFactory.initElements(Driver.getDriver(),newAccountMap);
    }

    public String geTextNewAccount(){
        Driver.visibilityOf(newAccountMap.textCreateAccount);
        return newAccountMap.textCreateAccount.getText();
    }


}
