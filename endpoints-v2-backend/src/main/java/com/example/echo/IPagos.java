package com.example.echo;

public interface IPagos {

	public void asignarAtributos(String todo);

	public String getValor();

	public String getIdConductor();

	public String getIdPasajero();

	public String getFecha();

	public String getHora();

	public String getTipoPago();

	public void setHora(String hora);

	public void setTipoPago(String tipoPago);

	public void setValor(String valor);

	public void setFecha(String fecha);

	public void setIdConductor(String idConductor);

	public void setIdPasajero(String idPasajero);
	
	public String retornarValores();

}
