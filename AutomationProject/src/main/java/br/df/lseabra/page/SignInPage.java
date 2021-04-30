package br.df.lseabra.page;

import org.openqa.selenium.By;

import br.df.lseabra.core.BasePage;
import br.df.lseabra.core.DriverFactory;

public class SignInPage extends BasePage {
	
	
	public void acessarTelaInicial() {
		DriverFactory.getDriver().get("http://automationpractice.com/");	
	}
	
	public void setEmail(String email) {
		escreve("email_create", email);
	}
		
	public void clicarCriarConta() {
		clicarBotao(By.id("SubmitCreate"));
	}
	public void clicarTitleMr() {
		clicarBotao(By.id("id_gender1"));
	}
	public void setName(String name) {
		escreve("customer_firstname", name);
	}
	public void setLastName(String lastName) {
		escreve("customer_lastname", lastName);
	}
	public void setPassword(String passwd) {
		escreve("passwd", passwd);
	}
	public void setAddress(String address) {
		escreve("address1", address);
	}
	public void setCity(String city) {
		escreve("city", city);
	}
	public void setState(String state) {
		selecionarCombo("id_state", state);
	}
	public void setPostCode(String postcode) {
		escreve("postcode", postcode);
	}
	public void setCountry(String country) {
		selecionarCombo("id_country", country);
	}
	public void setMobilePhone(String mobilePhone) {
		escreve("phone_mobile", mobilePhone);
	}
	public void register() {
		clicarBotao(By.id("submitAccount"));
	}
	public void setAlias(String alias) {
		escreve("alias", alias);
	}
	
}
