package br.com.sec4you.bingo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.sec4you.bingo.dt.Generate;
import br.com.sec4you.bingo.dt.GenerateID;
import br.com.sec4you.bingo.dt.GenerateNumberList;
import java.util.Set;


public class Rest {
	@Path("/rest")
	@Produces("application/json")
	@Consumes("application/json")
	@GET
	public Response getAG() {
		int id = new GenerateID().getId(6);
		Set<Integer> numberList = new GenerateNumberList().getNumberList(24);

		return Response.ok(new Generate(id, numberList)).build();
  }
}