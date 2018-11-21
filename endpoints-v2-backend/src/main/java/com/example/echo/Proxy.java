package com.example.echo;

import java.util.ArrayList;
import java.util.Random;


public class Proxy implements IProxy {
	

	private static Proxy unicaInstancia;
	private Facade facade= Facade.reemplazarConstructora();
	protected ArrayList<IUsuario> usuarios = new ArrayList<IUsuario>();

	public static Proxy reemplazarConstructora() {
		if (unicaInstancia == null)
			unicaInstancia = new Proxy();
		return unicaInstancia;
	}

	@Override
	public SesionUsuario iniciarSesion(String correo, String contrasena) {
		
		long aux= 12345;
		for (int i = 0; i < usuarios.size(); i++) {
			
			if(usuarios.get(i).getCorreo().equalsIgnoreCase(correo) &&
					usuarios.get(i).getContrasena().equalsIgnoreCase(contrasena)){
				SesionUsuario s= new SesionUsuario();
				s.setSesion(aux);
				s.setId(usuarios.get(i).getId());
				facade.adicionarSesion(s);
				System.out.println("Tiene acceso");
				aux++;
				return s;
				
			} else {
				System.out.println("No tiene acceso");
			}
		}
		return null;

	}


	@Override
	public IUsuario crearPasajero(String nombre, String correo, String contrasena, String edad, String id){
		IUsuario usuario = new Pasajero();
		usuario.crearUsuario(nombre, correo, contrasena, edad, id);
		usuarios.add(usuario);
		System.out.println("Usuario creado");
		return usuario;
	}
	

	@Override
	public IUsuario crearConductor(String nombre, String correo, String contrasena, String edad, String id){
		IUsuario usuario = new Conductor();
		usuario.crearUsuario(nombre, correo, contrasena, edad, id);
		usuarios.add(usuario);
		return usuario;
	}
	
	

}
