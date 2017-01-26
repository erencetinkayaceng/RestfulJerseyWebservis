package com.ekkod.webservis.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ekkod.web.model.Kategori;
import com.ekkod.webservis.service.KategoriService;

@Path("/kategori")
public class KategoriResource {
	
	KategoriService service=new KategoriService();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Kategori> getirNormalKategoriler(@PathParam("id")int id){
		return service.getirNormalKategoriler(id);
	}
	
}
