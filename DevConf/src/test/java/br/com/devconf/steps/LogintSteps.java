package br.com.devconf.steps;

import br.com.devconf.page.LoginPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class LogintSteps {

	@Dado("possa acessar a tela de login do sistema")
	public void possa_acessar_a_tela_de_login_do_sistema() {
		LoginPage lp = new LoginPage();
		lp.validarTelaInicial();

	}

	@Quando("informar um {string} válido")
	public void informar_um_válido(String string) {
		LoginPage lp = new LoginPage();
		lp.setUsuario(string);
		
		
	}

	@Quando("inserir uma {string} válida")
	public void inserir_uma_válida(String string) {
		LoginPage lp = new LoginPage();
		lp.setSenha(string);
	}

	@Quando("clicar no botão login")
	public void clicar_no_botão_login() {
		
		LoginPage lp = new LoginPage();
		lp.logar();

	}

	@Então("o sistema deve exibir os produtos")
	public void o_sistema_deve_exibir_os_produtos() {
		LoginPage lp = new LoginPage();
		lp.validarAutenticacao();
		
	}

}
