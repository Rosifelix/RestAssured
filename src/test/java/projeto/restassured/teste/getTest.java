package projeto.restassured.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import io.restassured.response.Response;
import projeto.restassured.apiobjects.UserAPI;

public class getTest {

    private UserAPI userAPI;
    
    
    @Before
    public void setUp() {
    	userAPI = new UserAPI("https://reqres.in");
    }

    @Test
	public void testGet() {
        Response response = userAPI.getUsers(2);
		assertEquals(200, response.getStatusCode());
	}

	@Test
	public void testGetBody() {
		Response response = userAPI.getUsers(2);
		assertEquals("7", response.jsonPath().getString("data[0].id"));
		assertEquals("michael.lawson@reqres.in", response.jsonPath().getString("data[0].email"));
		assertEquals("Michael", response.jsonPath().getString("data[0].first_name"));
		assertEquals("Lawson", response.jsonPath().getString("data[0].last_name"));
		assertEquals("8", response.jsonPath().getString("data[1].id"));
		assertEquals("lindsay.ferguson@reqres.in", response.jsonPath().getString("data[1].email"));
		assertEquals("Lindsay", response.jsonPath().getString("data[1].first_name"));
		assertEquals("Ferguson", response.jsonPath().getString("data[1].last_name"));

	}
}
