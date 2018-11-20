package com.example.echo;

public class Pasajero extends Usuario {

	 public Pasajero() {
	        super();
	    }

	@Override
	public void crearUsuario(String nombre, String correo, String contrasena, String edad, String tipo, String id) {
		this.setNombre(nombre);
		this.setCorreo(correo);
		this.setContrasena(contrasena);
		this.setEdad(edad);
		this.setTipo(tipo);
		this.setId(id);
	}

	@Override
	public void modificarUsuario(String correo, String nombre) {
		if (this.getCorreo().equalsIgnoreCase(correo)) {
			this.setNombre(nombre);
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
