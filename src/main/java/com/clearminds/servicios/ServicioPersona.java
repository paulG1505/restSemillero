package com.clearminds.servicios;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.clearminds.entidades.Persona;

@Path("/srvpersonas")
public class ServicioPersona {
	@Path("/busqueda")
	@GET
	public String consultar() {
		return "Persona";
	}
	@Path("/recuperar")
	@GET
	@Produces({MediaType.APPLICATION_JSON})//retorno
	public Persona recuperar() {
		return new Persona("Paul","Guaman");
	}
	@Path("/ingresar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})//envio
	public void ingresar(Persona persona){
		System.out.println("Ingresando Persona"+persona);
	}
	
	@Path("/actualizar")
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Persona actualizar(Persona persona){
		System.out.println("Ingresando Persona"+persona);
		persona.setName(persona.getName().toUpperCase());
		persona.setLastName(persona.getLastName().toUpperCase());
		System.out.println("Persona Modificada"+persona);
		return persona;
	}
	
	
}
