package br.com.sec4you.bingo;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import br.com.sec4you.bingo.dt.GetID;
import br.com.sec4you.bingo.dt.Generate;
import br.com.sec4you.bingo.dt.GenerateID;
import br.com.sec4you.bingo.dt.GetNumberList;
import br.com.sec4you.bingo.dt.GenerateNumberList;

import java.util.Set;

@Path("/rest")
@Produces("application/json")
@Consumes("application/json")
public class Rest {
	@GET
	public Response getGame() {
		int id = new GenerateID().getId(6);
		Set<Integer> numberList = new GenerateNumberList().getNumberList(24, id);

		return Response.ok(new Generate(id, numberList)).build();
	}
	@POST
	public Response postGame(GetID i) throws Exception {
		try {
			if(i != null) {
				if(i.getId().length() == 6) {
					int id = Integer.parseInt(i.getId());
					Set<Integer> numberList = GetNumberList.getNumberList(id); 
					
					return Response.ok(new Generate(id, numberList)).build();
				}
				else {
					return Response.status(Response.Status.BAD_REQUEST).entity("ID_inválido").build();
				}
			}
			else {
				return Response.status(Response.Status.BAD_REQUEST).entity("ID_inválido").build();
			}
		}
		catch(Exception e) {
			return Response.status(Response.Status.BAD_REQUEST).entity("ID_inválido" + e).build();
		}
	}
}