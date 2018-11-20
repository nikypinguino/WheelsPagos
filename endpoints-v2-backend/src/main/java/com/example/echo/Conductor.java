package com.example.echo;

public class Conductor extends Usuario{

	 public Conductor() {
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
	

}
