package br.giu.core;

import static br.giu.core.DriverFactory.getDriver;
import static br.giu.core.DriverFactory.killDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.giu.pages.LoginPage;

public class BaseTest {
	
	private LoginPage page = new LoginPage();
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void inicializa() {
		page.acessarTelaInicial();
		
		page.setEmail("giulianevip@gmail.com");
		page.setSenha("133144");
		page.entrar();
	}

	@After
	public void finaliza() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File arquivo = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(arquivo, new File("target" + File.separator + "screenshot" +
		File.separator + testName.getMethodName() + ".jpg"));
	
		if (Propriedades.FECHAR_BROWSER) {
			
		}
		killDriver();
		
	
	}

}
