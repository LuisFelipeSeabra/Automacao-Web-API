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
import br.df.lseabra.test.SignInTeste;
import br.df.lseabra.test.SummaryTest;

@RunWith(Suite.class)
@SuiteClasses({
	IndexTest.class,
	SummaryTest.class,
	SignInTeste.class,
	AddressesTest.class,
	ShippingTest.class,
	PaymentTest.class
})
public class SuiteSemLoginTest {
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void conectar() {
		page.acessarTelaInicial();

	}
	
		
	@AfterClass
	public static void finalizaTudo() {
		DriverFactory.killDriver();
	}

}