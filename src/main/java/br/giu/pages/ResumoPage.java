package br.giu.pages;

import org.junit.Test;
import org.openqa.selenium.By;

import br.giu.core.BasePage;

public class ResumoPage extends BasePage {
	
	@Test
	public void excluirMovimentacao() {
		clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-remove-circle']"));
		
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}

}
