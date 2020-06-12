package br.com.devconf.execucao;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/**
 * Código criado no  minu curso de Cucumber + Junit + Selenium  no DEV CONF 2020
 * @author jediael.santana@gmail.com linkedin: https://www.linkedin.com/in/jediael-santana-34110464/
 * @version 1.0
 */


@RunWith(Cucumber.class)
@CucumberOptions(
		  features = "src/test/java/br/com/devconf/Login.feature", 
		  glue = { "br/com/devconf"},  
		  plugin = { "pretty"}, 
		  monochrome = true 
		)

public class RunnerTest {

}
