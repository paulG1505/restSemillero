package com.clearminds.servicios;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.clearminds.pg.dtos.Estudiante;
import com.clearminds.pg.excepciones.BDDExcepcion;
import com.clearminds.pg.servicios.ServicioEstudiante;

@Path("/estudiantes")
public class ServicioPersona {
//	@Path("/busqueda")
//	@GET
//	public String consultar() {
//		return "Persona";
//	}
//	@Path("/recuperar")
//	@GET
//	@Produces({MediaType.APPLICATION_JSON})//retorno
//	public Estudiante recuperar() {
//		return new Estudiante("Paul","Guaman");
//	}
	@Path("/insertar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})//envio
	public void ingresar(Estudiante persona){
		ServicioEstudiante srvEstudiante= new ServicioEstudiante();
		try {
			srvEstudiante.insertarEstudiante(persona)
			;
		} catch (BDDExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
	}
	
//	@Path("/actualizar")
//	@PUT
//	@Consumes({MediaType.APPLICATION_JSON})
//	@Produces({MediaType.APPLICATION_JSON})
//	public Estudiante actualizar(Estudiante persona){
//		System.out.println("Ingresando Persona"+persona);
//		persona.setNombre(persona.getNombre().toUpperCase());
//		persona.setApellido(persona.getApellido().toUpperCase());
//		System.out.println("Persona Modificada"+persona);
//		return persona;
//	}
	
	
}
