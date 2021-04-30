package br.df.lseabra.test;

import org.junit.Assert;
import org.junit.Test;
import br.df.lseabra.core.BaseTest;
import br.df.lseabra.core.Steps;


public class LoginTest extends BaseTest {
	
	Steps steps = new Steps();
	@Test
	public void comprarMaisDeUmProduto2() throws InterruptedException {
		
		//- Printed Chiffon Dress na cor verde e tamanho "M"
		steps.adicionarProdutoAoCarrinho("Printed Chiffon Dress", "color_15", "M");
		Assert.assertTrue(steps.obterMensagemDeSucessoAoAdicionarProdutoAoCarrinho());
		
		steps.clicarEmProceedToCheckout();
		Assert.assertTrue(steps.verificaSeProdutoEstaNoCarrinho("Printed Chiffon Dress"));
		Assert.assertEquals("Color : Green, Size : M",steps.obterCorETamanho("Printed Chiffon Dress"));
				
		//- Faded Short Sleeve T-shirts na cor azul
		steps.adicionarProdutoAoCarrinho("Faded Short Sleeve T-shirts", "color_14");
		Assert.assertTrue(steps.obterMensagemDeSucessoAoAdicionarProdutoAoCarrinho());
		
		steps.clicarEmProceedToCheckout();
		Assert.assertTrue(steps.verificaSeProdutoEstaNoCarrinho("Faded Short Sleeve T-shirts"));
		Assert.assertTrue(steps.verificaSeProdutoPossuiDeterminadaCor("Faded Short Sleeve T-shirts", "Color : Blue"));

		//- Blouse na quantidade 2
		steps.adicionarProdutoAoCarrinhoInserindoQuantidade("Blouse", "2");
		Assert.assertTrue(steps.obterMensagemDeSucessoAoAdicionarProdutoAoCarrinho());
		
		steps.clicarEmProceedToCheckout();
		Assert.assertTrue(steps.verificaSeProdutoEstaNoCarrinho("Blouse"));
		Assert.assertEquals("2",steps.obterQuantidadeDeProdutoParaUmItemEspecificoAdicionadoAoCarrinho("Blouse"));
		
		//- Printed Dress
		steps.adicionarProdutoAoCarrinho("Printed Dress");
		Assert.assertTrue(steps.obterMensagemDeSucessoAoAdicionarProdutoAoCarrinho());
		
		steps.clicarEmProceedToCheckout();
		Assert.assertTrue(steps.verificaSeProdutoEstaNoCarrinho("Printed Dress"));

	}
	

}
