package br.giu.pages;

import br.giu.core.BasePage;

public class HomePage extends BasePage {
	
	public String obterSaldoConta(String nome) {
		return		obterCelula("Conta", nome, "Saldo", "tabelaSaldo").getText();
				
		
	}

}
