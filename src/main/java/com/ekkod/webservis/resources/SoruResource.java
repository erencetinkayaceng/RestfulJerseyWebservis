package com.ekkod.webservis.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ekkod.web.model.Soru;
import com.ekkod.webservis.service.SoruService;

@Path("/soru")
public class SoruResource {

	SoruService service=new SoruService();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Soru> getirSorular(@PathParam("id") int id){
		return service.getirSorular(id);
	}
}
