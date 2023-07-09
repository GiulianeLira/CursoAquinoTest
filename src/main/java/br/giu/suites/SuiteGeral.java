package br.giu.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.giu.tests.ContaTest;
import br.giu.tests.MovimentacaoTest;
import br.giu.tests.RemoverMovimentacaoContaTest;
import br.giu.tests.ResumoTest;
import br.giu.tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoTest.class,
	
})
public class SuiteGeral {

}
