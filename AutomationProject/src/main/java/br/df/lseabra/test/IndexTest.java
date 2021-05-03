package br.df.lseabra.test;
import org.junit.Assert;
import org.junit.Test;
import br.df.lseabra.core.BaseTest;
import br.df.lseabra.core.Steps;

public class IndexTest extends BaseTest {
	
	Steps steps = new Steps();

	@Test
	public void selecionarProdutoInformandoCorETamanhoEAdicionarAoCarrinho() throws InterruptedException {
		steps.adicionarProdutoAoCarrinho("Printed Chiffon Dress", "color_15", "M");
		Assert.assertTrue(steps.obterMensagemDeSucessoAoAdicionarProdutoAoCarrinho());
		
		steps.clicarEmProceedToCheckout();
		Assert.assertTrue(steps.verificaSeProdutoEstaNoCarrinho("Printed Chiffon Dress"));
		Assert.assertEquals("Color : Green, Size : M",steps.obterCorETamanho("Printed Chiffon Dress"));
	}
	@Test
	public void selecionarProdutoInformandoCorEAdicionarAoCarrinho() throws InterruptedException {
		steps.adicionarProdutoAoCarrinho("Faded Short Sleeve T-shirts", "color_14");
		Assert.assertTrue(steps.obterMensagemDeSucessoAoAdicionarProdutoAoCarrinho());
		
		steps.clicarEmProceedToCheckout();
		Assert.assertTrue(steps.verificaSeProdutoEstaNoCarrinho("Faded Short Sleeve T-shirts"));
		Assert.assertTrue(steps.verificaSeProdutoPossuiDeterminadaCor("Faded Short Sleeve T-shirts", "Color : Blue"));

	}
	@Test
	public void selecionarProdutoInformandoQuantidadeEAdicionarAoCarrinho() throws InterruptedException {
		steps.adicionarProdutoAoCarrinhoInserindoQuantidade("Blouse", "2");
		Assert.assertTrue(steps.obterMensagemDeSucessoAoAdicionarProdutoAoCarrinho());
		
		steps.clicarEmProceedToCheckout();
		Assert.assertTrue(steps.verificaSeProdutoEstaNoCarrinho("Blouse"));
		Assert.assertEquals("2",steps.obterQuantidadeDeProdutoParaUmItemEspecificoAdicionadoAoCarrinho("Blouse"));
	}
	@Test
	public void selecionarProdutosEAdicionarAoCarrinho() throws InterruptedException {
		steps.adicionarProdutoAoCarrinho("Printed Dress");
		steps.espera();
		Assert.assertTrue(steps.obterMensagemDeSucessoAoAdicionarProdutoAoCarrinho());
		steps.espera();
		steps.clicarEmProceedToCheckout();
		steps.espera();
		Assert.assertTrue(steps.verificaSeProdutoEstaNoCarrinho("Printed Dress"));
	}
}
