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
		valor = atb[0];
		idConductor = atb[1];
		idPasajero = atb[2];
		fecha = atb[3];
		hora = atb[4];
		tipoPago = atb[5];
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
        
	
	

//	private String Valor;
//	private String referencia;
//	private String UsuarioPaga;
//	private String UsuarioPagado;
//	private String concepto;
//
//	@Override
//	public void setValores(String infoPago) {
//		 String[] para = infoPago.split(",");
//		 this.setValor(para[0]);
//		 this.setReferencia(para[1]);
//	     this.setUsuarioPaga(para[2]);
//	     this.setUsuarioPagado(para[3]);
//	     this.setConcepto(para[4]);
//	}
//
//	public String getValor() {
//		return Valor;
//	}
//
//	public void setValor(String valor) {
//		Valor = valor;
//	}
//
//	public String getReferencia() {
//		return referencia;
//	}
//
//	public void setReferencia(String referencia) {
//		this.referencia = referencia;
//	}
//
//	public String getUsuarioPaga() {
//		return UsuarioPaga;
//	}
//
//	public void setUsuarioPaga(String usuarioPaga) {
//		UsuarioPaga = usuarioPaga;
//	}
//
//	public String getUsuarioPagado() {
//		return UsuarioPagado;
//	}
//
//	public void setUsuarioPagado(String usuarioPagado) {
//		UsuarioPagado = usuarioPagado;
//	}
//
//	public String getConcepto() {
//		return concepto;
//	}
//
//	public void setConcepto(String concepto) {
//		this.concepto = concepto;
//	}
//	

}
