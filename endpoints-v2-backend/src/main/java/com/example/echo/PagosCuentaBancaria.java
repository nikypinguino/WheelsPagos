/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.echo;

/**
 *
 * @author nikyr
 */
public class PagosCuentaBancaria {
    	
    String numTarjeta;
    String entidadBancaria;
    
    /*
    public void asignarAtributos (String todo) {
    String atb[] = todo.split("-");
    numTarjeta = atb[0];
    super.asignarAtributos(atb[1]);
    }
     */
    
    	public String getEntidadBancaria() {
		return entidadBancaria;
	}
        
        public void setEntidadBancaria(String entidadBancaria) {
        this.entidadBancaria = entidadBancaria;
    }
        
        public void Pagar(){
            
        }

    public String getNumTarjeta() {
        return numTarjeta;
    }

	private String addnumTar(){
		return "Numero de tarjeta: " + this.getNumTarjeta() + "\n";
	}
	
	public String retornarValores(){
		return addnumTar() ;
				
//				+ super.retornarValores();
		
	}

}
