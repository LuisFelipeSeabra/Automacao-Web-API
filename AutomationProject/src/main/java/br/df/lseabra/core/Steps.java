package br.df.lseabra.core;

import org.apache.commons.lang3.RandomStringUtils;

import br.df.lseabra.page.AddressesPage;
import br.df.lseabra.page.IndexPage;
import br.df.lseabra.page.PaymentPage;
import br.df.lseabra.page.ShippingPage;
import br.df.lseabra.page.SignInPage;
import br.df.lseabra.page.SummaryPage;

public class Steps {
	IndexPage pageIndex = new IndexPage();
	AddressesPage pageAddress = new AddressesPage();
	PaymentPage pagePayment = new PaymentPage();
	ShippingPage pageShipping = new ShippingPage();
	SummaryPage pageSummary = new SummaryPage();
	SignInPage signIn = new SignInPage();
	
	public void adicionarProdutoAoCarrinho(String produto, String cor, String tamanho) {
		pageIndex.pesquisar(produto);
		pageIndex.clicarProduto(produto);
		pageIndex.selecionarCor(cor);
		pageIndex.selecionarTamanho(tamanho);
		pageIndex.addCart();
	}
	public void adicionarProdutoAoCarrinho(String produto, String cor) {
		pageIndex.pesquisar(produto);
		pageIndex.clicarProduto(produto);
		pageIndex.selecionarCor(cor);
		pageIndex.addCart();
	}
	public void adicionarProdutoAoCarrinho(String produto) {
		pageIndex.pesquisar(produto);
		pageIndex.clicarProduto(produto);
		pageIndex.addCart();
	}
	public void adicionarProdutoAoCarrinhoInserindoQuantidade(String produto, String qtd) {
		pageIndex.pesquisar(produto);
		pageIndex.clicarProduto(produto);
		pageIndex.setQtd(qtd);
		pageIndex.addCart();
	}
	
	public String obterQuantidadeDeProdutoParaUmItemEspecificoAdicionadoAoCarrinho(String Produto) {
		return pageSummary.obterQtd(Produto);
	}
	public Boolean obterMensagemDeSucessoAoAdicionarProdutoAoCarrinho() {
		return pageIndex.obterMensagem().contains("Product successfully added to your shopping cart");
	}
	public void clicarEmProceedToCheckout() throws InterruptedException {
		espera();
		pageIndex.proceedToCheckout();
	}
	public Boolean verificaSeProdutoEstaNoCarrinho(String produto) throws InterruptedException {
		espera();
		return pageSummary.verificaSeExisteElemento(produto);
	}
	public Boolean verificaSeProdutoEstaNoCarrinho2(String produto) throws InterruptedException {
		espera();
		return pageSummary.verificaSeExisteElementoSemEspera(produto);
	}
	public String obterCorETamanho(String Produto) {
		return pageSummary.obterColorSize(Produto);
	}
	public void clicarEmProsseguirTelaSummary() throws InterruptedException {
		espera();
		pageSummary.proceedToCheckoutCartSummary();
	}
	public void clicarEmProsseguirTelaAddress() throws InterruptedException {
		espera();
		pageAddress.proceedToCheckoutAddress();
	}
	public void concordarEClicarEmProsseguirTelaShipping() throws InterruptedException {
		espera();
		pageShipping.agree();
		pageShipping.proceedToCheckoutShipping();
	}
	public boolean verificaSeTemoDeServicoFoiPreenchido() throws InterruptedException {
		espera();
		return pageShipping.verificaSeCheckBoxFoiClicado();
	}
	
	
	
	public void selecionarOpcaoPagamentoPayByBankWireEConfirmarCompra()  {
		pagePayment.payByBankWire();
		pagePayment.confirmOrder();
	}
	public String obterMensagemDeSucessoAoEfetuarPagamento() throws InterruptedException {
		espera();
		return pagePayment.storeComplete();
	}
	public Boolean verificaSeProdutoPossuiDeterminadaCor(String produto,String cor) throws InterruptedException {
		espera();
		return pageSummary.obterColorSize(produto).startsWith(cor);
	}
	public void excluirProdutoDoCarrinho(String produto) throws InterruptedException {
		espera();
		pageSummary.excluirProdutoDoCarrinho(produto);
	}
	//Mesmo com as Esperas Explicitas inseridas na "BasePage" fez-se necessário a utilização de Thread.sleep
	public void espera() throws InterruptedException {
		Thread.sleep(1000);
	}
	public void registrarCliente(String email, String name, String lastname, String password, String address, String city, String state, String postcode,String mobilePhone, String alias)  {
		signIn.setEmail(email);
		signIn.clicarCriarConta();
		signIn.clicarTitleMr();
		signIn.setName(name);
		signIn.setLastName(lastname);
		signIn.setPassword(password);
		signIn.setAddress(address);
		signIn.setCity(city);
		signIn.setState(state);
		signIn.setPostCode(postcode);
		signIn.setMobilePhone(mobilePhone);
		signIn.setAlias(alias);
		signIn.register();
	}
	public String obterClienteLogado() {
		return pageAddress.obterClienteLogado();
	}

	public String geradorEmail() {
	    String generatedString = RandomStringUtils.randomAlphabetic(5);
	    return generatedString + "@aa.com";
	}
	public Integer obterQuantosProdutosForamAdicionadosAoCarrinho() {
		return pageSummary.obterQuantosProdutosForamAdicionadosNoCarrinho();
	}
	public Integer obterQuantidadeDeProdutosQueForamAdicionadosAoCarrinho() {
		return pageSummary.obterQuantidadeDeProdutosQueForamAdicionadosNoCarrinho();
	}
	
	
}
