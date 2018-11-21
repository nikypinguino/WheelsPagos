package com.example.echo;

public class Pagos implements IPagos {

	String valor;
	String idConductor;
	String idPasajero;
	String fecha;
	String hora;
	String tipoPago;


	public void asignarAtributos(String todo) {
		String atb[] = todo.split("-");
		this.setValor(atb[0]);
		this.setIdConductor(atb[1]);
		this.setIdPasajero(atb[2]);
		this.setFecha(atb[3]);
		this.setHora(atb[4]);
		this.setTipoPago(atb[5]);
	}
	
	
	
	public String getValor() {
		return valor;
	}
	public String getIdConductor() {
		return idConductor;
	}
	public String getIdPasajero() {
		return idPasajero;
	}

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }


    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }
        
    
	public void setValor(String valor) {
		this.valor = valor;
	}



	public void setIdConductor(String idConductor) {
		this.idConductor = idConductor;
	}



	public void setIdPasajero(String idPasajero) {
		this.idPasajero = idPasajero;
	}



	public String retornarValores() {
		return "Valor: " + this.getValor() + 
				"\n" + " Id Conductor: " + this.getIdConductor() + 
				"\n" + " Id Pasajero: " + this.getIdPasajero() + 
				"\n" + " TipoPago: " + this.getTipoPago() ;
	}
        


}
