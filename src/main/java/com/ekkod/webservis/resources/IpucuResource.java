package com.ekkod.webservis.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.ekkod.web.model.Ipucu;
import com.ekkod.webservis.service.IpucuService;

@Path("/ipucu")
public class IpucuResource {
	
	IpucuService service=new IpucuService();
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Ipucu> getirIpuclari(@PathParam("id") int id){
		return service.getirIpuclari(id);
	}

}
