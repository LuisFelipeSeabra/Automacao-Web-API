package br.df.lseabra.test;

import org.junit.Assert;
import org.junit.Test;

import br.df.lseabra.core.BaseTest;
import br.df.lseabra.core.Steps;

public class SignInTeste extends BaseTest {

	Steps steps = new Steps();
	
	@Test
	public void registrarClienteEVerificarClienteLogado() throws InterruptedException {
		steps.registrarCliente(steps.geradorEmail(), "luis", "Felipe", "12345", "Qd central", "Brasilia", "Alabama", "00000","61982512045", "teste");
		Assert.assertEquals("luis Felipe", steps.obterClienteLogado());
		
	}
}
