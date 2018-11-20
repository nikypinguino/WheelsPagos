package com.example.echo;

import com.google.api.server.spi.config.Named;

public interface IProxy {

	public SesionUsuario iniciarSesion(String correo, String contrasena);

//	public SesionUsuario test(long sesion);

	public void crearPasajero(String nombre, String correo, String contrasena, String edad, String tipo, String id);
	
	public void crearConductor(String nombre, String correo, String contrasena, String edad, String tipo, String id);

}
