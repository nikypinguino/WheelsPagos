package com.example.echo;

public class Conductor extends Usuario{

	 public Conductor() {
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
	

}
