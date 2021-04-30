package br.df.lseabra.page;

import org.openqa.selenium.By;

import br.df.lseabra.core.BasePage;

public class ShippingPage extends BasePage {
	
	public void proceedToCheckoutShipping() throws InterruptedException {
		ClicarBotaoScript2(By.name("processCarrier"));
	}

	public void agree() {
		clicarBotao(By.xpath("//p[@class = 'checkbox']//input"));
	}

	public Boolean verificaSeCheckBoxFoiClicado() throws InterruptedException {
		return isCheckMarcado(By.xpath("//p[@class = 'checkbox']//input/../../span[@class='checked']"));
	}
}
