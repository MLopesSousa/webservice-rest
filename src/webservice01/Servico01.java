package webservice01;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/servico01")
public class Servico01 {

	@GET
	public void doSomething() {
		System.out.println("Ola!!!!");
	}
}
