package br.df.lseabra.page;

import org.openqa.selenium.By;

import br.df.lseabra.core.BasePage;
import br.df.lseabra.core.DriverFactory;

public class LoginPage extends BasePage {
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("http://automationpractice.com/");	
	}
	
	public void setEmail(String email) {
		escreve("email", email);
	}
	
	public void setSenha(String senha) {
		escreve("passwd", senha);
	}
	
	public void clicarEmEntrar() {
		clicarBotao(By.id("SubmitLogin"));
		
	}

	public void clicarEmSignIn() {
		clicarBotao(By.xpath("//a[@class = 'login']"));
		
	}
}
