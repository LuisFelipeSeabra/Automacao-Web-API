package br.df.lseabra.test;

import org.junit.Test;

import br.df.lseabra.core.BaseTest;
import br.df.lseabra.core.Steps;

public class ShippingTest extends BaseTest {

	Steps steps = new Steps();
	@Test
	public void concordarComTermoDeServicoEClicarEmProceedToCheckut() throws InterruptedException {
		steps.concordarEClicarEmProsseguirTelaShipping();
	}
	
}
