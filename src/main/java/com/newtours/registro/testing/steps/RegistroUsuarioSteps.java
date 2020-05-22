package com.newtours.registro.testing.steps;

import com.newtours.registro.testing.pageobjects.RegistroUsuarioPageObject;
import com.sqasa.web.demo.utils.KrakenWeb;

public class RegistroUsuarioSteps extends KrakenWeb {

	RegistroUsuarioPageObject registroPOM = new RegistroUsuarioPageObject();
	
	public void abrirApp () {
		
		configuracionesIniciales();
		abrirNavegadorEn(registroPOM);
	}
	
	//Metodos
	public void irARegistro () {
		click(registroPOM.getRegistryLink());
	}
	public void escribirPrimerNombre(String firstName) {
		escribirTexto(registroPOM.getTxtFirstName(), firstName);
	}
	public void escribirApellido(String lastName) {
		escribirTexto(registroPOM.getTxtlastTName(), lastName);
	}
	public void escribirTelefono(String phone) {
		escribirTexto(registroPOM.getTxtPhone(), phone);
	}
	public void escribirEmail(String mail) {
		escribirTexto(registroPOM.getTxtMail(), mail);
	}
	public void escribirDireccion(String address) {
		escribirTexto(registroPOM.getTxtAddress(), address);
	}
	public void escribirCiudad(String city) {
		escribirTexto(registroPOM.getTxtCity(), city);
	}
	public void escribirEstado(String state) {
		escribirTexto(registroPOM.getTxtState(), state);
	}
	public void escribirCodigoPostal(String postalCode) {
		escribirTexto(registroPOM.getTxtpostalCode(), postalCode);
	}
	public void seleccionarPais() {
		elegirDeListaSegunElTexto(registroPOM.getListCountry(), "COLOMBIA ");
	}
	public void escribirUsuario(String userName) {
		escribirTexto(registroPOM.getTxtUserName(), userName);
	}
	public void escribirContrasena(String password) {
		escribirTexto(registroPOM.getTxtPassword(), password);
	}
	public void confirmarContrasena(String confirmPassword) {
		escribirTexto(registroPOM.getTxtConfirmPassword(), confirmPassword);
	}
	public void clickEnSubmit() {
		click(registroPOM.getBtnSubmit());
	}
	public void confirmarTexto(String confirmText) {
		validarIgual(registroPOM.getTxtConfirmText(), confirmText);
	}
	
}

