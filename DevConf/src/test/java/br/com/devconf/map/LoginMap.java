package br.com.devconf.map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginMap {
	
	@FindBy(xpath = "//*[@id=\"login_credentials\"]/h4")
	protected WebElement listaUsuario;
	
	@FindBy(id = "user-name")
	protected WebElement objUsuario;
	
	@FindBy(id = "password")
	protected WebElement objSenha;
	
	@FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/input[3]")
	protected WebElement objLogin;
	
	@FindBy(xpath = "//*[@id=\"inventory_filter_container\"]/div")
	protected WebElement objProduto;

}
