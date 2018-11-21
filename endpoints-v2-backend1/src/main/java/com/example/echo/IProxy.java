package com.example.echo;

import com.google.api.server.spi.config.Named;

public interface IProxy {

	public SesionUsuario iniciarSesion(String correo, String contrasena);

	public void crearPasajero(String nombre, String correo, String contrasena, String edad, String id);
	
	public void crearConductor(String nombre, String correo, String contrasena, String edad, String id);

}
