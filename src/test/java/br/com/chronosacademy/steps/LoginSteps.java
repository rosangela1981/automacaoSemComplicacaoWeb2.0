package br.com.chronosacademy.steps;

import br.com.chronosacademy.Core.Driver;
import br.com.chronosacademy.enums.Browser;
import br.com.chronosacademy.pages.LoginPage;
import br.com.chronosacademy.pages.NewAccountPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;

import java.util.Map;

public class LoginSteps {

    LoginPage loginPage;

    @Before
    public void iniciaNavegador(){
        new Driver( Browser.CHROME);
    }

    @After
    public void fechaNavegador() {
        Driver.getDriver().quit();
    }


    @Dado("que a modal esteja sendo exibida")
    public void queAModalEstejaSendoExibida() {
       Driver.getDriver().get("https://advantageonlineshopping.com/");
       loginPage = new LoginPage();
       loginPage.clickbtnLogin();
       loginPage.visibilityOFBtnFechar();
       loginPage.aguardaLoader();
    }
    @Quando("for realizado um clique fora da modal")
    public void forRealizadoUmCliqueForaDaModal() {
        loginPage.clickDivFecharModal();
    }
    @Entao("a janela modal deve ser fechada")
    public void aJanelaModalDeveSerFechada() throws Exception {
        try {
            loginPage.invisibilityOFBtnFechar();
        }catch (Exception e){
            throw new Exception(" A janela modal não foi fechada");
        }
    }

    @Quando("for realizado um clique no link Create New Account")
    public void forRealizadoUmCliqueNoLinkCreateNewAccount() {
        loginPage.clickLinkCreateAccount();
        
    }

    @Entao("a pagina Create New Account deve ser exibida")
    public void aPaginaCreateNewAccountDeveSerExibida() {
        NewAccountPage newAccountPage = new NewAccountPage();
        Assert.assertEquals("CREATE ACCOUNT",newAccountPage.geTextNewAccount());

    }

    @Quando("os campos de login sejam preenchidos da seguinte forma")
    public void osCamposDeLoginSejamPreenchidosDaSeguinteForma(Map<String, String>map) {
        String username = map.get("login");
        String password = map.get("password");
        boolean remmenber = Boolean.parseBoolean(map.get("remmenber"));

        loginPage.setInpUserName(username);
        loginPage.setInpPassword(password);
        if(remmenber )loginPage.clickInpRemember();
        
    }

    @Quando("for realizado o clique no botao sign in")
    public void forRealizadoOCliqueNoBotaoSignIn() {
        loginPage.clickBtnSignIn();
        
    }

    @Entao("deve ser possivel logar no sistema")
    public void deveSerPossivelLogarNoSistema() {

        
    }

    @Entao("o sistema devera exibir uma mensagem de erro")
    public void oSistemaDeveraExibirUmaMensagemDeErro() {
        
    }

    @Entao("o botao sign in deve permanecer desabilitado")
    public void oBotaoSignInDevePermanecerDesabilitado() {
        boolean enabled = loginPage.isBtnSignIn();
        Assert.assertFalse(enabled);
    }
}
