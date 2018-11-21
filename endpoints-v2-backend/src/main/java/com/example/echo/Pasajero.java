package com.example.echo;

public class Pasajero extends Usuario {

	 public Pasajero() {
	        super();
	    }
	 
//	 public Pasajero(String correo, String contrasena) {
//		 super.setCorreo(correo);
//		super.setContrasena(contrasena);
//	 }

	 
	@Override
	public void crearUsuario(String nombre, String correo, String contrasena, String edad, String id) {
		super.setNombre(nombre);
		super.setCorreo(correo);
		super.setContrasena(contrasena);
		super.setEdad(edad);
		super.setId(id);
	}

	@Override
	public void modificarUsuario(String correo, String nombre) {
		if (super.getCorreo().equalsIgnoreCase(correo)) {
			super.setNombre(nombre);
		}
		
	}
	 
	 
	 
}
