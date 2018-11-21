package com.example.echo;

import java.util.ArrayList;

public class Facade {

	private static Facade unicaInstancia;
	private ArrayList<Long> sesiones = new ArrayList<Long>();
	private ArrayList<IPagos> pagos = new ArrayList<IPagos>();
	
	
	public static Facade reemplazarConstructora() {
		if (unicaInstancia == null)
			unicaInstancia = new Facade();
		return unicaInstancia;
	}
	

	public void adicionarSesion(SesionUsuario s) {
		sesiones.add(s.getSesion());
	}
	
	
	
	public IPagos pagoEfectivo (long sesion,IPagos pago) {
	IPagos p= pago;
		for (int i=0; i<sesiones.size();i++) {
			if (sesion==sesiones.get(i)) {
				pagos.add(p);
				System.out.println("Pago realizado");
				return pago;
			}
		}
		return null;
	}
	
	
	public IPagos pagoConTarjeta(long sesion,PagosPSE pago) {
		PagosPSE p= pago;
		for (int i=0; i<sesiones.size();i++) {
			if (sesion==sesiones.get(i)) {
				pagos.add(p);
				System.out.println("Pago realizado");
				return pago;
			}
		}
		return null;
		
	}
	
	public IPagos pagoCuentaBancaria(long sesion,PagosPSECuentaBancaria pago) {
		PagosPSECuentaBancaria p= pago;
		for (int i=0; i<sesiones.size();i++) {
			if (sesion==sesiones.get(i)) {
				pagos.add(p);
				System.out.println("Pago realizado");
				return pago;
			}
		}
		return null;
		
	}
	
	
	public ArrayList<IPagos> listarPagos(String id, long sesion) {
		ArrayList<IPagos> lista = new ArrayList<IPagos>();
		for (int i=0; i <sesiones.size(); i++) {
			if (sesiones.get(i)==sesion) {
				for(int k=0; k <pagos.size(); k++) {
					if(pagos.get(k).getIdPasajero().equals(id)) {
						lista.add(pagos.get(k));
					}
				}
				return lista;
			}
		}
		
		return null;

	}

	
}
