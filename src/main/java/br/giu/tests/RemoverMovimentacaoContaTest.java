package br.giu.tests;

import org.junit.Assert;
import org.junit.Test;

import br.giu.core.BaseTest;
import br.giu.pages.ContasPage;
import br.giu.pages.MenuPage;

public class RemoverMovimentacaoContaTest extends BaseTest{
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void testExcluirContaComMovimentacao() {
		menuPage.acessarTelaListarConta();
		
		contasPage.clicarExcluirConta("Conta do Teste alterada");
		
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
		
	}

}
