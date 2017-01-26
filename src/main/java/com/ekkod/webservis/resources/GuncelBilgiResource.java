package com.ekkod.webservis.resources;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ekkod.web.model.GuncelBilgi;
import com.ekkod.webservis.service.GuncelBilgiService; 


@Path("/guncelbilgi")
public class GuncelBilgiResource {
	
	GuncelBilgiService service =new GuncelBilgiService();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<GuncelBilgi> getirGuncelBilgiler(@PathParam("id") int id){		
		return service.getirGuncelBilgiler(id);
	}
}
