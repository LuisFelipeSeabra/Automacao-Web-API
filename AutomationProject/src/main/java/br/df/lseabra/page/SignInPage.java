package br.df.lseabra.page;

import org.openqa.selenium.By;

import br.df.lseabra.core.BasePage;
import br.df.lseabra.core.DriverFactory;

public class SignInPage extends BasePage {
	
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("http://automationpractice.com/");	
	}
	
	public void setEmail(String email) throws InterruptedException {
		espera();
		escreve("email_create", email);
	}
		
	public void clicarCriarConta() throws InterruptedException {
		espera();
		clicarBotao(By.id("SubmitCreate"));
	}
	public void clicarTitleMr() throws InterruptedException {
		espera();
		clicarBotao(By.id("id_gender1"));
	}
	public void setName(String name) throws InterruptedException {
		espera();
		escreve("customer_firstname", name);
	}
	public void setLastName(String lastName) throws InterruptedException {
		espera();
		escreve("customer_lastname", lastName);
	}
	public void setPassword(String passwd) throws InterruptedException {
		espera();
		escreve("passwd", passwd);
	}
	public void setAddress(String address) throws InterruptedException {
		espera();
		escreve("address1", address);
	}
	public void setCity(String city) throws InterruptedException {
		espera();
		escreve("city", city);
	}
	public void setState(String state) throws InterruptedException {
		espera();
		selecionarCombo("id_state", state);
	}
	public void setPostCode(String postcode) throws InterruptedException {
		espera();
		escreve("postcode", postcode);
	}
	public void setCountry(String country) throws InterruptedException {
		espera();
		selecionarCombo("id_country", country);
	}
	public void setMobilePhone(String mobilePhone) throws InterruptedException {
		espera();
		escreve("phone_mobile", mobilePhone);
	}
	public void register() throws InterruptedException {
		espera();
		clicarBotao(By.id("submitAccount"));
	}
	public void setAlias(String alias) throws InterruptedException {
		espera();
		escreve("alias", alias);
	}
	public void espera() throws InterruptedException {
		Thread.sleep(100);
	}
}
