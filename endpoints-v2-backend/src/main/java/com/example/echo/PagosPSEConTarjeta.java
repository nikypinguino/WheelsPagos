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

//	public PagosPSEConTarjeta() {
//		super();
//	}

	public void asignarAtributos(String todo) {
		String atb[] = todo.split("-");
		this.setNumTarjeta(atb[0]);
		this.setEntidad(atb[1]);
		this.setFechaExpiracion(atb[2]);
		this.setCodigoSeguridad(atb[3]);
		super.asignarAtributos(todo);
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

}
