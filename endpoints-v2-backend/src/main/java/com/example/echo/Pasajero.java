package com.example.echo;

public class Pasajero extends Usuario {

	 public Pasajero() {
	        super();
	    }

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
	 
	 
	 
	 

//	    public void adicionar(String correo, String password, String nombre, String apellido, int edad, String id) {
//	        super.setCorreo(correo);
//	        super.setPass(password);
//	        super.setNombre(nombre);
//	        super.setApellido(apellido);
//	        super.setEdad(edad);
//	        super.setId(id);
//	    }
//
//	    public void modificar(String password, String nombre, String apellido, int edad) {
//	        super.setPass(password);
//	        super.setNombre(nombre);
//	        super.setApellido(apellido);
//	        super.setEdad(edad);
//	    }
}
