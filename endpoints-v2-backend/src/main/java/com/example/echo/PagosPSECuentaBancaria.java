/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.echo;

public class PagosPSECuentaBancaria extends PagosPSE {

	String numCuenta;
	String entidadBancaria;

	public void asignarAtributos(String todo) {
		String atb[] = todo.split("-");
		this.setNumCuenta(atb[0]);
		this.setEntidadBancaria(atb[1]);
		super.asignarAtributos(atb[0]);
	}

	public String getEntidadBancaria() {
		return entidadBancaria;
	}

	public void setEntidadBancaria(String entidadBancaria) {
		this.entidadBancaria = entidadBancaria;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getNumCuenta() {
		return numCuenta;
	}


}
