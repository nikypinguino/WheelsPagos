package com.example.echo;

public abstract class PagosPSE implements IPagos {
	
	protected IPagos interfaz;
	String confirmacionPago;
	
	String valor;
	String idConductor;
	String idPasajero;
	String fecha;
	String hora;
	String tipoPago;

	public void asignarAtributos(String todo) {
		String atb[] = todo.split("-");
		this.setValor(atb[1]);
		this.setIdConductor(atb[2]);
		this.setIdPasajero(atb[3]);
		this.setFecha(atb[4]);
		this.setHora(atb[5]);
		this.setTipoPago(atb[6]);
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
		return interfaz.retornarValores();
	}

	


	public String getConfirmacionPago() {
		return confirmacionPago;
	}

	public void setConfirmacionPago(String confirmacionPago) {
		this.confirmacionPago = confirmacionPago;
	}

	
	
	

}
