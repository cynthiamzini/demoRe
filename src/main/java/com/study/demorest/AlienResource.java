package com.study.demorest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
//import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AlienResource {
//	@GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String getIt() {
//        return "Got it!";
//    }
	
	@GET
	@Produces("application/xml")
	public Alien getAlien() {
		System.out.println("getAlien called");
		Alien alien = new Alien();
		alien.setName("John");
		alien.setPoints(50);
		System.out.println(alien.getName());
		return alien;
	}

}
