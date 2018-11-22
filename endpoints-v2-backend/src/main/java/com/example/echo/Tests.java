package com.example.echo;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import java.util.ArrayList;


//import org.junit.Test;

class Tests {

//unitarias
	
	@Test
	void testCrearConductor() {
		Proxy proxy = Proxy.reemplazarConstructora();
		IUsuario us = proxy.crearConductor("nicole", "nickypinguino", "123", "20", "789");
		assertTrue(us.getCorreo().equals("nickypinguino"));
	}
	
	@Test
	void testCrearPasajero() {
		Proxy proxy = Proxy.reemplazarConstructora();
		IUsuario us = proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		assertTrue(us.getCorreo().equals("gabrielaloos"));
	}
	
	@Test
	void testIniciarSesion() throws Exception {

		Proxy proxy = Proxy.reemplazarConstructora();
		IUsuario us= proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		SesionUsuario nuevasesion = proxy.iniciarSesion(us.getCorreo(), us.getContrasena());
		assertEquals(nuevasesion.getId(), us.getId());
	}
	
	
// integracion
	

	@Test
	void testPagoEfectivo() throws Exception{
		Proxy proxy = Proxy.reemplazarConstructora();
		IUsuario us = proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		SesionUsuario nuevasesion = proxy.iniciarSesion(us.getCorreo(), us.getContrasena());
		Facade facade = Facade.reemplazarConstructora();
		IPagos p= new PagosEfectivo();
		p.asignarAtributos("1000-789-456-2018-5pm-multa-pesos");
		IPagos pagoEfectivo = facade.pagoEfectivo(nuevasesion.getSesion(), p);
		assertEquals(pagoEfectivo.getIdPasajero(), nuevasesion.getId());
	}
	

	
	@Test
	void testPagoTarjeta() throws Exception{
		Proxy proxy = Proxy.reemplazarConstructora();
		IUsuario us= proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		SesionUsuario nuevasesion = proxy.iniciarSesion(us.getCorreo(), us.getContrasena());
		Facade facade = Facade.reemplazarConstructora();
		IPagos p= new PagosPSEConTarjeta();
		p.asignarAtributos("100-789-456-2018-5pm-multa-123456-visa-2018-2354");
		IPagos pagoTarjeta = facade.pagoConTarjeta(nuevasesion.getSesion(), p);
		assertEquals(pagoTarjeta.getIdPasajero(), nuevasesion.getId());
	}
	
	
	
	@Test
	void testPagoCuentaBancaria() throws Exception{
		Proxy proxy = Proxy.reemplazarConstructora();
		proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		SesionUsuario nuevasesion = proxy.iniciarSesion("gabrielaloos", "123");
		Facade facade = Facade.reemplazarConstructora();
		IPagos p= new PagosPSECuentaBancaria();
		p.asignarAtributos("100-789-456-2018-5-multa-1212-bancolombia");
		IPagos pagoCuentaB = facade.pagoCuentaBancaria(nuevasesion.getSesion(), p);
		assertEquals(pagoCuentaB.getIdPasajero(), nuevasesion.getId());
	}
	

	
	
	
//sistema
	
	@Test
	void testListarPagos() throws Exception{
		Proxy proxy = Proxy.reemplazarConstructora();
		IUsuario us=proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		SesionUsuario nuevasesion = proxy.iniciarSesion(us.getCorreo(), us.getContrasena());
		Facade facade = Facade.reemplazarConstructora();
		IPagos p= new PagosEfectivo();
		p.asignarAtributos("1000-789-456-2018-5pm-multa-pesos");
		facade.pagoEfectivo(nuevasesion.getSesion(), p);	
		ArrayList<IPagos> lista= facade.listarPagos(nuevasesion.getId(), nuevasesion.getSesion());
		assertTrue(lista.get(1).getIdPasajero().equals(nuevasesion.getId()));
				
	}
	
	
	@Test
	void testVariosPagos() throws Exception{
		Proxy proxy = Proxy.reemplazarConstructora();
		IUsuario us = proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		SesionUsuario nuevasesion = proxy.iniciarSesion(us.getCorreo(), us.getContrasena());
		Facade facade = Facade.reemplazarConstructora();
		
		
		IPagos pE= new PagosEfectivo();
		pE.asignarAtributos("1000-789-456-2018-5pm-multa-pesos");
		facade.pagoEfectivo(nuevasesion.getSesion(), pE);
		
		IPagos pT= new PagosPSEConTarjeta();
		pT.asignarAtributos("100-789-456-2018-5pm-multa-123456-visa-2018-2354");
		facade.pagoConTarjeta(nuevasesion.getSesion(), pT);
		
		IPagos p= new PagosPSECuentaBancaria();
		p.asignarAtributos("100-789-456-2018-5-multa-1212-bancolombia");
		facade.pagoCuentaBancaria(nuevasesion.getSesion(), p);
		
	
		assertTrue(facade.pagos.size()>2);
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
