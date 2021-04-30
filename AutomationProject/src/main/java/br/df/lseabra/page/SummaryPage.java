package br.df.lseabra.page;

import org.openqa.selenium.By;

import br.df.lseabra.core.BasePage;

public class SummaryPage extends BasePage {
	public void pesquisar(String produto) {
		escreve("search_query_top", produto);
		clicarBotao(By.xpath("//button[@name = 'submit_search']"));	
	}
	public String obterMensagem() {
		return obterTextoScript(By.xpath("//div[@class = 'layer_cart_product col-xs-12 col-md-6']//h2"));	
	}
	public void proceedToCheckout() {
		ClicarBotaoScript(By.xpath("//a[@title='Proceed to checkout']//span"));
	}
	public void proceedToCheckoutCartSummary() throws InterruptedException {
		ClicarBotaoScript2(By.xpath("//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']//span"));
	}
	public boolean verificaSeExisteElemento(String valor) {
		return isElemento(valor, By.xpath("//tbody//p[@class = 'product-name']//a"));
	}
	public boolean verificaSeExisteElementoSemEspera(String valor) {
		return isElementoSemEspera(valor, By.xpath("//tbody//p[@class = 'product-name']//a"));
	}
	public String obterColorSize(String valor) {
		return obterTexto(By.xpath("//tbody//p[@class = 'product-name']//a[text() = '"+valor+"']/../following-sibling::small/a"));
	}
	public String obterQtd(String valor) {
		return obterAtributo(By.xpath("//tbody//p[@class = 'product-name']//a[text() = '"+valor+"']/../..//following-sibling::td[3]/input[1]"));
	}
	public void excluirProdutoDoCarrinho(String produto) throws InterruptedException {
		ClicarBotaoScript2(By.xpath("//tbody//p[@class = 'product-name']//a[text() = '"+produto+"']/../../..//a[@title = 'Delete']"));	
	}
	public Integer obterQuantosProdutosForamAdicionadosNoCarrinho() {
		return obterQuantosProdutosForamAdicionadosNoCarrinho(By.xpath("//tbody//p[@class = 'product-name']//a"));	
	}
	public Integer obterQuantidadeDeProdutosQueForamAdicionadosNoCarrinho() {
		return obterQuantidadeDeProdutosQueForamAdicionadosNoCarrinho(By.xpath("//tbody//td[@class='cart_quantity text-center']//input[2]"));	
	}
	
}
