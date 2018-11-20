package com.example.echo;

public abstract class Usuario implements IUsuario {

//	abstract public void crearUsuario(String nombre, String correo, String contrasena, String edad, String tipo, String id);
	abstract public void modificarUsuario(String correo, String nombre);

	private String nombre;
	private String id;
	private String contrasena;
	private String edad;
	private String correo;
	private String tipo;

	public void crearUsuario(String nombre, String correo, String contrasena, String edad, String tipo, String id) {
		this.setNombre(nombre);
		this.setCorreo(correo);
		this.setContrasena(contrasena);
		this.setEdad(edad);
		this.setTipo(tipo);
		this.setId(id);
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setTipo(String tipo) {
		this.tipo = tipo;
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

//	 private String Correo;
//	    private String Pass;
//	    private String nombre;
//	    private String apellido;
//	    private String edad;
//	    private String id;
//
//	    abstract public void adicionar(String correo, String password, String nombre, String apellido, int edad,String id);
//
//	    abstract public void modificar(String password, String nombre, String apellido, int edad);
//
//		public String getCorreo() {
//			return Correo;
//		}
//
//		public void setCorreo(String correo) {
//			Correo = correo;
//		}
//
//		public String getPass() {
//			return Pass;
//		}
//
//		public void setPass(String pass) {
//			Pass = pass;
//		}
//
//		public String getNombre() {
//			return nombre;
//		}
//
//		public void setNombre(String nombre) {
//			this.nombre = nombre;
//		}
//
//		public String getApellido() {
//			return apellido;
//		}
//
//		public void setApellido(String apellido) {
//			this.apellido = apellido;
//		}
//
//		public String getEdad() {
//			return edad;
//		}
//
//		public void setEdad(String edad) {
//			this.edad = edad;
//		}
//
//		public String getId() {
//			return id;
//		}
//
//		public void setId(String id) {
//			this.id = id;
//		}

}
