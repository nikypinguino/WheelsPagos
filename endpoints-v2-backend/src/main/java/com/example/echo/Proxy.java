package com.example.echo;

import java.util.ArrayList;
import java.util.Random;


public class Proxy implements IProxy {
	

	private static Proxy unicaInstancia;
	private Facade facade;
	protected ArrayList<IUsuario> usuarios = new ArrayList<IUsuario>();

	public static Proxy reemplazarConstructora() {
		if (unicaInstancia == null)
			unicaInstancia = new Proxy();
		return unicaInstancia;
	}

	@Override
	public SesionUsuario iniciarSesion(String correo, String contrasena) {
		
		int aux=0;
		for (int i = 0; i < usuarios.size(); i++) {
			aux=+1;
			if(usuarios.get(i).getCorreo().equalsIgnoreCase(correo) &&
					usuarios.get(i).getContrasena().equalsIgnoreCase(contrasena)){
				
				SesionUsuario s= new SesionUsuario();
				s.setSesion(aux);
				s.setId(usuarios.get(i).getId());
				facade.adicionarSesion(s);
				System.out.println("Tiene acceso");
				return s;
				
			} else {
				System.out.println("No tiene acceso");
			}
		}
		return null;

	}



//	@Override
//	public SesionUsuario test(long sesion) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//	

	@Override
	public void crearPasajero(String nombre, String correo, String contrasena, String edad, String tipo, String id){
		IUsuario usuario = new Pasajero();
		usuario.crearUsuario(nombre, correo, contrasena, edad, tipo, id);
		usuarios.add(usuario);
	}
	

	@Override
	public void crearConductor(String nombre, String correo, String contrasena, String edad, String tipo, String id){
		IUsuario usuario = new Conductor();
		usuario.crearUsuario(nombre, correo, contrasena, edad, tipo, id);
		usuarios.add(usuario);
	}

//	private Facade facade = Facade.rConstructora();
//	private static Proxy instanciaUnica = null;
//
//	private ArrayList<IUsuario> usuarios = new ArrayList();
//
//	public static Proxy rConstructora() {
//		if (instanciaUnica == null) {
//			instanciaUnica = new Proxy();
//		}
//		return instanciaUnica;
//	}
//
//	@Override
//	public Sesion auth(String user, String pass) {
//		Random ran = new Random();
//		for (IUsuario us : usuarios) {
//			if (us.getCorreo().equals(user)&&us.getPass().equals(pass)) {
//				Sesion session = new Sesion();
//				session.setSession(ran.nextLong());
//				session.setId(us.getId());
//				facade.guardarSesion(session);
//				return session;
//			}
//
//		}
//
//		return null;
//	}
//
//	@Override
//	public Sesion test(long sesion) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public void crearPasajero(String correo, String password, String nombre, String apellido, int edad, String id) {
//		IUsuario user=new Pasajero();
//		user.setCorreo(correo);
//		user.setPass(password);
//		user.setNombre(nombre);
//		user.setApellido(apellido);
//		user.setEdad(edad);
//		user.setId(id);
//		usuarios.add(user);
//	}
//
//	@Override
//	public void crearConductor(String correo, String password, String nombre, String apellido, int edad) {
//		// TODO Auto-generated method stub
//		
//	}
//	
	
	
	

}
