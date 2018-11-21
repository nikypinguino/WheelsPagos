package com.example.echo;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;

//import org.junit.Test;

class ProxyTest {


	@Test
	void testIniciarSesion() {

		Proxy proxy = Proxy.reemplazarConstructora();
		proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		SesionUsuario nuevasesion = proxy.iniciarSesion("gabrielaloos", "123");
		assertTrue(nuevasesion.getId().equals("456"));
	}
	
	@Test
	void testPagoEfectivo(){
		Proxy proxy = Proxy.reemplazarConstructora();
		IUsuario us = proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		SesionUsuario nuevasesion = proxy.iniciarSesion(us.getCorreo(), us.getContrasena());
		Facade facade = Facade.reemplazarConstructora();
		IPagos p= new PagosEfectivo();
		p.asignarAtributos("100-789-456-2018-5-multa");
		IPagos pagoEfectivo = facade.pagoEfectivo(nuevasesion.getSesion(), p);
		assertEquals(pagoEfectivo.getIdPasajero(), nuevasesion.getId());
	}
	
	
	
	
	
	
	@Test
	void testPago(){
		
	}
	
	
	
	@Test
	void testPagoTarjeta(){
		Proxy proxy = Proxy.reemplazarConstructora();
		IUsuario us= proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		SesionUsuario nuevasesion = proxy.iniciarSesion(us.getCorreo(), us.getContrasena());
		Facade facade = Facade.reemplazarConstructora();
		PagosPSE p= new PagosPSEConTarjeta();
		p.asignarAtributos("100-789-456-2018-5-ruta");
		IPagos pagoTarjeta = facade.pagoConTarjeta(nuevasesion.getSesion(), p);
		assertEquals(pagoTarjeta.getIdPasajero(), nuevasesion.getId());
	}
	
	@Test
	void testPagoCuentaBancaria(){
		Proxy proxy = Proxy.reemplazarConstructora();
		proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		SesionUsuario nuevasesion = proxy.iniciarSesion("gabrielaloos", "123");
		Facade facade = Facade.reemplazarConstructora();
		PagosPSECuentaBancaria p= new PagosPSECuentaBancaria();
		IPagos pagoCuentaB = facade.pagoCuentaBancaria(nuevasesion.getSesion(), p);
		assertEquals(pagoCuentaB.getIdPasajero(), nuevasesion.getId());
	}
	
	@Test
	void testListarPagos(){
		Proxy proxy = Proxy.reemplazarConstructora();
		proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		SesionUsuario nuevasesion = proxy.iniciarSesion("gabrielaloos", "123");
		Facade facade = Facade.reemplazarConstructora();
		PagosPSEConTarjeta p= new PagosPSEConTarjeta();
		IPagos pagoTarjeta = facade.pagoConTarjeta(nuevasesion.getSesion(), p);
	
		String pagos= facade.listarPagos("456", nuevasesion.getSesion()).get(0).getIdPasajero();
	
		assertEquals(pagos, pagoTarjeta.getIdPasajero());
			
		
	}

	
	
	
	
	
	
	
	
	
	

}
