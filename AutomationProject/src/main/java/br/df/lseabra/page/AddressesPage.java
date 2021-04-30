package br.df.lseabra.page;

import org.openqa.selenium.By;

import br.df.lseabra.core.BasePage;

public class AddressesPage extends BasePage {
	
	public void proceedToCheckoutAddress() throws InterruptedException {
		ClicarBotaoScript2(By.name("processAddress"));
	}
	public String obterClienteLogado() {
		return obterTextoScript(By.xpath("//div[@class='header_user_info']/a/span"));
	}


}
