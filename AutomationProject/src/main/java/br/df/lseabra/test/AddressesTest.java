package br.df.lseabra.test;

import org.junit.Test;

import br.df.lseabra.core.BaseTest;
import br.df.lseabra.core.Steps;

public class AddressesTest extends BaseTest {

	Steps steps = new Steps();
	@Test
	public void clicarEmProceedToCheckut() throws InterruptedException {
		steps.clicarEmProsseguirTelaAddress();
	}
	
}
