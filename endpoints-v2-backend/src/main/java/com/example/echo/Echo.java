/*
 * Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.echo;

import java.util.ArrayList;
import java.util.Random;

import com.google.api.server.spi.auth.EspAuthenticator;
import com.google.api.server.spi.auth.common.User;
import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiIssuer;
import com.google.api.server.spi.config.ApiIssuerAudience;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.UnauthorizedException;

/**
 * The Echo API which Endpoints will be exposing.
 */
// [START echo_api_annotation]
@Api(name = "proxy", version = "v3", namespace = @ApiNamespace(ownerDomain = "wheels.endpoints.com", ownerName = "wheels.endpoints.com", packagePath = ""),
		// [START_EXCLUDE]
		issuers = {
				@ApiIssuer(name = "firebase", issuer = "https://securetoken.google.com/YOUR-PROJECT-ID", jwksUri = "https://www.googleapis.com/service_accounts/v1/metadata/x509/securetoken@system"
						+ ".gserviceaccount.com") }
// [END_EXCLUDE]
)
// [END echo_api_annotation]

public class Echo {

	Facade facade = Facade.reemplazarConstructora();
	Proxy proxy = Proxy.reemplazarConstructora();
	
	public Echo() {
		proxy.crearPasajero("gaby", "gabrielaloos", "123", "20", "456");
		proxy.crearConductor("nicole", "nickypinguino", "123", "20", "789");
	}
	
	/**
	 * Echoes the received message back. If n is a non-negative integer, the message
	 * is copied that many times in the returned message.
	 *
	 * <p>
	 * Note that name is specified and will override the default name of "{class
	 * name}.{method name}". For example, the default is "echo.echo".
	 *
	 * <p>
	 * Note that httpMethod is not specified. This will default to a reasonable HTTP
	 * method depending on the API method name. In this case, the HTTP method will
	 * default to POST.
	 */
	
	@ApiMethod(name = "IniciarSesion")
	public SesionUsuario iniciarSesion(Login log) throws Exception {
		return proxy.iniciarSesion(log.getCorreo(), log.getContraseña());
	}

	@ApiMethod(name = "PagoEfectivo")
	public IPagos pagoEfectivo(@Named ("sesion") long sesion,PagosEfectivo pago) throws Exception {
		return facade.pagoEfectivo(sesion,pago);
	}
	
	@ApiMethod(name = "PagoConTarjeta")
	public IPagos pagoConTarjeta(@Named ("sesion") long sesion,PagosPSEConTarjeta  pago) throws Exception {
		return facade.pagoConTarjeta(sesion,pago);
	}
	
	@ApiMethod(name = "PagoConCuentaBancaria")
	public IPagos pagoConCuentaBancaria(@Named ("sesion") long sesion,PagosPSECuentaBancaria pago) throws Exception {
		return facade.pagoCuentaBancaria(sesion, pago);
	}
	
	@ApiMethod(name = "ListarPagos")
	public ArrayList<IPagos> listarPagos(@Named ("sesion") long sesion,@Named ("ID") String id ) throws Exception {
		return facade.listarPagos(id,sesion);
	}



	// [START google_id_token_auth]
	@ApiMethod(httpMethod = ApiMethod.HttpMethod.GET, authenticators = { EspAuthenticator.class }, audiences = {
			"YOUR_OAUTH_CLIENT_ID" }, clientIds = { "YOUR_OAUTH_CLIENT_ID" })
	public Email getUserEmail(User user) throws UnauthorizedException {
		if (user == null) {
			throw new UnauthorizedException("Invalid credentials");
		}

		Email response = new Email();
		response.setEmail(user.getEmail());
		return response;
	}
	// [END google_id_token_auth]

	/**
	 * Gets the authenticated user's email. If the user is not authenticated, this
	 * will return an HTTP 401.
	 *
	 * <p>
	 * Note that name is not specified. This will default to "{class name}.{method
	 * name}". For example, the default is "echo.getUserEmail".
	 *
	 * <p>
	 * Note that httpMethod is not required here. Without httpMethod, this will
	 * default to GET due to the API method name. httpMethod is added here for
	 * example purposes.
	 */
	// [START firebase_auth]
	@ApiMethod(path = "firebase_user", httpMethod = ApiMethod.HttpMethod.GET, authenticators = {
			EspAuthenticator.class }, issuerAudiences = {
					@ApiIssuerAudience(name = "firebase", audiences = { "YOUR-PROJECT-ID" }) })
	public Email getUserEmailFirebase(User user) throws UnauthorizedException {
		if (user == null) {
			throw new UnauthorizedException("Invalid credentials");
		}

		Email response = new Email();
		response.setEmail(user.getEmail());
		return response;
	}
	// [END firebase_auth]
}