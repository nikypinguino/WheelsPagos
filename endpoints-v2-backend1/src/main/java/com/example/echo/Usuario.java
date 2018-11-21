package com.example.echo;

public abstract class Usuario implements IUsuario {
	
	//hola ya llegue yo
	//hola esta es una prueba mil
	//help funcionaaaaaaaaaaaaa

//	abstract public void crearUsuario(String nombre, String correo, String contrasena, String edad, String tipo, String id);
	abstract public void modificarUsuario(String correo, String nombre);

	private String nombre;
	private String id;
	private String contrasena;
	private String edad;
	private String correo;

	public void crearUsuario(String nombre, String correo, String contrasena, String edad, String id) {
		this.setNombre(nombre);
		this.setCorreo(correo);
		this.setContrasena(contrasena);
		this.setEdad(edad);
		this.setId(id);
	}


	@Override
	public String getId() {
		return id;
	}



	@Override
	public String getNombre() {
		return nombre;
	}

	@Override
	public String getContrasena() {
		return contrasena;
	}

	@Override
	public String getEdad() {
		return edad;
	}

	@Override
	public String getCorreo() {
		return correo;
	}

	@Override
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	@Override
	public void setEdad(String edad) {
		this.edad = edad;
	}

	@Override
	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}



}
