package br.df.lseabra.test;

import org.junit.Assert;
import org.junit.Test;

import br.df.lseabra.core.BaseTest;
import br.df.lseabra.core.Steps;

public class PaymentTest extends BaseTest {

	Steps steps = new Steps();
	@Test
	public void selecionarOpcaoPagamentoPayByBankWireEConfirmarCompra() throws InterruptedException {
		steps.selecionarOpcaoPagamentoPayByBankWireEConfirmarCompra();
		Assert.assertEquals("Your order on My Store is complete.", steps.obterMensagemDeSucessoAoEfetuarPagamento());
	}
}



