package projeto.restassured.teste;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import projeto.restassured.apiobjects.UserAPI;

public class UserTeste {

	// private abaixo copiei da class getTest
	// userAPI copiei da class getTest
	private UserAPI userAPI;
	Response response;

	@Given("a base URL {string}")
	public void a_base_url(String baseUrl) {
		userAPI = new UserAPI("baseUrl");
	}

	@When("o cliente faz uma solicitacao GET ")
	public void o_cliente_faz_uma_solicitacao_get() {
		response = userAPI.getUsers(2);
	}

	@Then("o codigo de status de resposta deve ser {int}")
	public void o_codigo_de_status_de_resposta_deve_ser(Integer int1) {
		assertEquals(200, response.getStatusCode());

	}
}
