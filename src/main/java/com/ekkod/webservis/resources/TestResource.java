package com.ekkod.webservis.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ekkod.web.model.Test;
import com.ekkod.webservis.service.TestService;

@Path("/test")
public class TestResource {

	TestService service = new TestService();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Test> getirTestler(@PathParam("id") int id){
		return service.getirTestler(id);
	}
	
}
