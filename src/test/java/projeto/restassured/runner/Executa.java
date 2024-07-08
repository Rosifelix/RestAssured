package projeto.restassured.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith( Cucumber.class)
@CucumberOptions (
		features = "src/main/resources/features",
		dryRun = false,
		tags = "@listausuario",
		glue = "projeto.restassured.teste",
		monochrome = true,
		snippets = SnippetType.CAMELCASE,
		plugin = {"pretty","html:target/testeapi-report.html"}
		)
public class Executa {



}

