package br.com.devconf.page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.support.PageFactory;

import br.com.devconf.Hooks;
import br.com.devconf.map.LoginMap;

public class LoginPage extends LoginMap{
	

	public LoginPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void validarTelaInicial() {
		String textoDaTela = listaUsuario.getText();
		String textoEsperado = "Accepted usernames are:";
		System.out.println(textoDaTela);
		
		/**
		 * Para validar a tela podemos utiizar o método assertEquals
		 * @parametro 1 - Mensagem que será exibida caso não encontre a tela
		 * @parametro 2 - Texto Esperado
		 * @parametro 3 - Texto que foi exibido na tela 
		 */
		assertEquals("Tela de Login não foi encontrada",textoEsperado, textoDaTela);
	}

	public void setUsuario(String usuario) {
		/**
		 * Pessoal o erro estava neste método, deixamos uma String fixa no paramento
		 * do método sendKeys ao invés do paramento passado pela classe LogintSteps.
		 * 
		 * Anterior "objUsuario.sendKeys(usuario);"
		 */
		objUsuario.sendKeys(usuario);
		
	}

	public void setSenha(String senha) {
		objSenha.sendKeys(senha);
		
	}

	public void logar() {
		objLogin.click();		
	}

	public void validarAutenticacao() {
		objProduto.isDisplayed();		
	}

}
