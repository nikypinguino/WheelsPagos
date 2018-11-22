package com.example.echo;

public class PagosEfectivo extends PagosPSE{
	
	String moneda;
	
	public void asignarAtributos(String todo) {
		String atb[] = todo.split("-");
		this.setMoneda(atb[0]);
		super.asignarAtributos(todo);
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}
	
	

}
