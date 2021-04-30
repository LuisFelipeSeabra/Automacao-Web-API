package br.df.lseabra.suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.df.lseabra.core.DriverFactory;
import br.df.lseabra.page.LoginPage;
import br.df.lseabra.test.AddressesTest;
import br.df.lseabra.test.IndexTest;
import br.df.lseabra.test.PaymentTest;

import br.df.lseabra.test.ShippingTest;
import br.df.lseabra.test.SummaryTest;


@RunWith(Suite.class)
@SuiteClasses({
	IndexTest.class,
	SummaryTest.class,
	AddressesTest.class,
	ShippingTest.class,
	PaymentTest.class
})
public class SuiteTest {
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void Login() {
		page.acessarTelaInicial();
		page.clicarEmSignIn();
		page.setEmail("felipeseabra2405@gmail.com");
		page.setSenha("felipe");
		page.clicarEmEntrar();
	}
	
	@AfterClass
	public static void finalizaTudo() {
		DriverFactory.killDriver();
	}

}

