package br.df.lseabra.page;

import org.openqa.selenium.By;
import br.df.lseabra.core.BasePage;

public class IndexPage extends BasePage {

	public void pesquisar(String produto) {
		escreve("search_query_top", produto);
		clicarBotao(By.xpath("//button[@name = 'submit_search']"));
		
	}
	public void clicarProduto(String produto) throws InterruptedException {
		espera();
		clicarBotao(By.xpath("//ul[@class='product_list grid row']//h5//a[@title = '"+produto+"']"));
	}
	public void selecionarCor(String cor) {
		clicarBotao(By.id(cor));
	}
	public void selecionarCorVerde() {
		clicarBotao(By.id("color_15"));
	}
	public void selecionarCorAzul() {
		clicarBotao(By.id("color_14"));
	}
	public void selecionarTamanho(String tam) {
		selecionarCombo("group_1", tam);
	}
	public void addCart() throws InterruptedException {
		espera();
		clicarBotao(By.xpath("//p[@id = 'add_to_cart']//button[@type = 'submit']"));
	}
	public String obterMensagem() {
		return obterTextoScript(By.xpath("//div[@class = 'layer_cart_product col-xs-12 col-md-6']//h2"));
	}
	public void proceedToCheckout() {
		ClicarBotaoScript(By.xpath("//a[@title='Proceed to checkout']//span"));
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
	public Integer obterQuantosProdutosForamAdicionadosNoCarrinho() {
		return obterQuantosProdutosForamAdicionadosNoCarrinho(By.xpath("//tbody//p[@class = 'product-name']//a"));	
	}
	public Integer obterQuantidadeDeProdutosQueForamAdicionadosNoCarrinho() {
		return obterQuantidadeDeProdutosQueForamAdicionadosNoCarrinho(By.xpath("//tbody//td[@class='cart_quantity text-center']//input[2]"));	
	}
	public void espera() throws InterruptedException {
		Thread.sleep(100);
	}
}
