package com.example.echo;

import java.util.ArrayList;

public class Facade {

	
	private ArrayList<Long> sesiones = new ArrayList();
	private ArrayList<IPagos> pagos = new ArrayList();
	
	
	

	public void adicionarSesion(SesionUsuario s) {
		sesiones.add(s.getSesion());
	}
	
	
	
	public IPagos pagoEfectivo (long sesion,Pagos pago) {
		Pagos p= pago;
		for (int i=0; i<sesiones.size();i++) {
			if (sesion==sesiones.get(i)) {
				pagos.add(p);
				System.out.println("Pago realizado");
				return pago;
			}
		}
		return null;
	}
	
	
	public IPagos pagoConTarjeta(long sesion,Pagos pago) {
		
		
		
		return null;
	}
	
	
	public String listarPagos(String id, long sesion) {
		String lista = "";
		for (int i=0; i <sesiones.size(); i++) {
			if (sesiones.get(i)==sesion) {
				for(int k=0; k <pagos.size(); k++) {
					lista = lista + "Valor" + pagos.get(i).getValor() 
							+ "\n" + "Id Conductor:" + pagos.get(i).getIdConductor() 
							+ "\n" + "Id Pasajero:" + pagos.get(i).getIdPasajero() 
							+ "\n" + "Tipo pago:" + pagos.get(i).getTipoPago();
				}
			}
		}
		
		return lista;

	}

		


	
	
//	public IPago pagoEfectivo (long session,Pagos pago) {
//		Pagos pag = (Pagos) pago; 
//		for (long ses:Sesiones) {
//			if(session==ses) {
//				pagos.add(pago);
//				return pago;
//			}
//		}
//		return null;
//	}
//
//
//	public ArrayList<IPago> listarPagos(String id,long sesion) {
//		System.out.println("lista");
//		ArrayList<IPago> lista = new ArrayList();
//		for (long ses:Sesiones) {
//			if(sesion==ses) {
//				for(IPago pago:pagos) {
//					if(pago.getUsuarioPaga().equals(id)) {
//						lista.add(pago);
//					}
//				}
//				return lista;
//			}
//		}
//		return null;
//	}
//
//
//	public ArrayList<IPago> listarTPagos(long sesion) {
//		for (long ses:Sesiones) {
//			if(sesion==ses) {
//				return pagos;
//			}
//		}
//		return null;
//	}
}
