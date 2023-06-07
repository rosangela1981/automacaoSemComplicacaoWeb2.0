package br.com.chronosacademy.pages;

import br.com.chronosacademy.Core.Driver;
import br.com.chronosacademy.maps.LoginMap;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    LoginMap loginMap;

    public LoginPage() {
        loginMap = new LoginMap();
        PageFactory.initElements(Driver.getDriver(), loginMap);
    }

    public void clickbtnLogin() {
        Driver.visibilityOf(loginMap.btnLogin);
        loginMap.btnLogin.click();
    }

    public void clickbtnFechar() {
        loginMap.btnFechar.click();

    }

    public void clickDivFecharModal() {
        loginMap.divFecharModal.click();
    }

    public void setInpUserName(String username) {
        if (username!= null) {
            loginMap.inpUserName.sendKeys(username);
        }
    }

    public void setInpPassword(String password) {
        if (password !=null) {
            loginMap.inpPassword.sendKeys(password);
        }
    }

    public void clickInpRemember() {
        loginMap.inpRemember.click();
    }
    public void clickLinkCreateAccount(){
        loginMap.linkCreateAccount.click();
    }
    public void clickBtnSignIn(){
        loginMap.btnSignIn.click();
    }
    public boolean isBtnSignIn(){
        return loginMap.btnSignIn.isEnabled();
    }
    public void visibilityOFBtnFechar(){
        Driver.visibilityOf(loginMap.btnFechar);
    }
    public void invisibilityOFBtnFechar(){
        Driver.invisibilityOf(loginMap.btnFechar);
    }

    public void aguardaLoader(){
        Driver.attributeChange(loginMap.divLoader, "display", "none");
    }
}
