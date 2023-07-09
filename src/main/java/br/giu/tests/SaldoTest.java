package br.giu.tests;

import org.junit.Assert;
import org.junit.Test;
import br.giu.core.BaseTest;
import br.giu.pages.HomePage;


public class SaldoTest extends BaseTest {
	
	HomePage page = new HomePage();
	
	@Test
	public void testSaldoConta() {
		Assert.assertEquals("760.00", page.obterSaldoConta("Conta do Teste alterada"));
		
	}

}
