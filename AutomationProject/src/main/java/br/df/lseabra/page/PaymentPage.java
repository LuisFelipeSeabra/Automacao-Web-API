package br.df.lseabra.page;

import org.openqa.selenium.By;

import br.df.lseabra.core.BasePage;

public class PaymentPage extends BasePage {
	public void pesquisar(String produto) {
		escreve("search_query_top", produto);
		clicarBotao(By.xpath("//button[@name = 'submit_search']"));
		
	}
	public String obterMensagem() {
		return obterTextoScript(By.xpath("//div[@class = 'layer_cart_product col-xs-12 col-md-6']//h2"));
	}
	public boolean verificaSeExisteElemento(String valor) {
		return isElemento(valor, By.xpath("//tbody//p[@class = 'product-name']//a"));
	}
	public String obterColorSize(String valor) {
		return obterTexto(By.xpath("//tbody//p[@class = 'product-name']//a[text() = '"+valor+"']/../following-sibling::small/a"));
	}
	public void setQtd(String valor) {
		escreve("quantity_wanted", valor);
	}
	public String obterQtd(String valor) {
		return obterAtributo(By.xpath("//tbody//p[@class = 'product-name']//a[text() = '"+valor+"']/../..//following-sibling::td[3]/input[1]"));
	}
	public void payByBankWire() {
		ClicarBotaoScript(By.xpath("//p[@class = 'payment_module']/a[@title='Pay by bank wire']"));
	}	
	public void confirmOrder() {
		ClicarBotaoScript(By.xpath("//p[@id = 'cart_navigation']//button[@type = 'submit']"));
	}	
	public String storeComplete() {
		return obterTextoScript(By.xpath("//p[@class = 'cheque-indent']//strong"));
	}

}
