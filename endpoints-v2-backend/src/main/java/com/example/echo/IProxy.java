package com.example.echo;

import com.google.api.server.spi.config.Named;

public interface IProxy {

	public SesionUsuario iniciarSesion(String correo, String contrasena) throws Exception;

	public IUsuario crearPasajero(String nombre, String correo, String contrasena, String edad, String id);
	
	public IUsuario crearConductor(String nombre, String correo, String contrasena, String edad, String id);

}
