package com.clearminds.servicios;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.clearminds.pg.dtos.Estudiante;
import com.clearminds.pg.excepciones.BDDExcepcion;
import com.clearminds.pg.servicios.ServicioEstudiante;

@Path("/estudiantes")
public class ServicioPersona {
	ServicioEstudiante srvEstudiante= new ServicioEstudiante();
	
	@Path("/get")
	@GET
	public void get(){
		System.out.println("asdsd");
	}
	
	
	@Path("/insertar")
	@POST
	@Consumes({MediaType.APPLICATION_JSON})//envio
	public void ingresar(Estudiante persona){
		try {
			srvEstudiante.insertarEstudiante(persona)
			;
		} catch (BDDExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			e.getMessage();
		}
	}
	
	@Path("/actualizar")
	@PUT
	@Consumes({MediaType.APPLICATION_JSON})
	public void actualizar(Estudiante persona){
		try {
			srvEstudiante.actualizarEstudiante(persona);
		} catch (BDDExcepcion e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
