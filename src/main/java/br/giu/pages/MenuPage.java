package br.giu.pages;

import br.giu.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaIserirConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}
	
	public void acessarTelaListarConta() {
		clicarLink("Contas");
		clicarLink("Listar");
	}
	
	public void acessarTelaIserirMovimentacao() {
		clicarLink("Criar Movimentação");
		
	}
	
	public void acessarTelaResumo() {
		clicarLink("Resumo Mensal");
		
	}

}
