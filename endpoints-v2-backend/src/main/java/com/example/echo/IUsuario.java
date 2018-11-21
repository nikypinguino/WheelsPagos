package com.example.echo;

public interface IUsuario {

	public String getNombre();

	public String getId();

	public String getContrasena();

	public String getEdad();

	public String getCorreo();

	public void setNombre(String nombre);

	public void setContrasena(String contrasena);

	public void setEdad(String edad);

	public void setCorreo(String correo);

	public void setId(String id);

	public void crearUsuario(String nombre, String correo, String contrasena, String edad, String id);

	public void modificarUsuario(String correo, String nombre);


}
