package com.example.echo;

public interface IUsuario {
	
	public String getNombre();
	
	public String getId();

	public String getContrasena();

	public String getEdad();

	public String getCorreo();

	public String getTipo();

	public void setNombre(String nombre);

	public void setContrasena(String contrasena);

	public void setEdad(String edad);

	public void setCorreo(String correo);

	public void setTipo(String tipo);
	
	public void setId(String id);
	
	public void crearUsuario(String nombre, String correo, String contrasena, String edad, String tipo, String id);
	
	public void modificarUsuario(String correo, String nombre);
	
//	  public void adicionar(String correo, String password, String nombre, String apellido, int edad,String id);
//      public void modificar(String password, String nombre, String apellido, int edad);
//      public String getNombre();
//      public String getCorreo();
//      public String getPass();
//      public String getApellido();
//      public int getEdad();
//      public void setNombre(String nombre);
//      public void setCorreo(String correo);
//      public void setPass(String pass);
//      public void setApellido(String apellido);
//      public void setEdad(int edad);
//      public String getId();
//      public void setId(String id);

}
