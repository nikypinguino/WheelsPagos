/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.echo;

public class PagosPSEConTarjeta extends PagosPSE {

	String numTarjeta;
	String entidad;
	String fechaExpiracion;
	String codigoSeguridad;

	public PagosPSEConTarjeta() {
		super();
	}

	public void asignarAtributos(String todo) {
		String atb[] = todo.split("-");
		numTarjeta = atb[0];
		entidad = atb[1];
		fechaExpiracion = atb[2];
		codigoSeguridad = atb[3];
		super.asignarAtributos(atb[0]);
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public String getEntidad() {
		return entidad;
	}

	public void setEntidad(String entidad) {
		this.entidad = entidad;
	}

	public String getFechaExpiracion() {
		return fechaExpiracion;
	}

	public void setFechaExpiracion(String fechaExpiracion) {
		this.fechaExpiracion = fechaExpiracion;
	}

	public String getCodigoSeguridad() {
		return codigoSeguridad;
	}

	public void setCodigoSeguridad(String codigoSeguridad) {
		this.codigoSeguridad = codigoSeguridad;
	}

//	private String addnumTar(){
//		return "Numero de tarjeta: " + this.getNumTarjeta() + "\n";
//	}
//	
//	public String retornarValores(){
//		return addnumTar() ;
//	}
}
