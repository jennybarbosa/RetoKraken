package com.newtours.registro.testing.stepdefinitions;

import java.util.List;

import com.newtours.registro.testing.models.NuevoUsuario;
import com.newtours.registro.testing.steps.RegistroUsuarioSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class RegistroStepDefinitions {
	
	@Steps
	RegistroUsuarioSteps registroSteps;
	
	@Given("^I am in registry page$") 
	public void iAmInRegistryPage() {
	    registroSteps.abrirApp();
	}


	@When("^I insert data$")
	public void iInsertData(List<NuevoUsuario> nuevoUsuarioLista) {
	  registroSteps.irARegistro();
	  registroSteps.escribirPrimerNombre(nuevoUsuarioLista.get(0).getFirstName());
	  registroSteps.escribirApellido(nuevoUsuarioLista.get(0).getLastName());
	  registroSteps.escribirTelefono(nuevoUsuarioLista.get(0).getPhone());
	  registroSteps.escribirEmail(nuevoUsuarioLista.get(0).getMail());
	  registroSteps.escribirDireccion(nuevoUsuarioLista.get(0).getAddress());
	  registroSteps.escribirCiudad(nuevoUsuarioLista.get(0).getCity());
	  registroSteps.escribirEstado(nuevoUsuarioLista.get(0).getState());
	  registroSteps.escribirCodigoPostal(nuevoUsuarioLista.get(0).getPostalCode());
	  registroSteps.seleccionarPais();
	  registroSteps.escribirUsuario(nuevoUsuarioLista.get(0).getUserName());
	  registroSteps.escribirContrasena(nuevoUsuarioLista.get(0).getPassword());
	  registroSteps.confirmarContrasena(nuevoUsuarioLista.get(0).getPasswordConfirm());
	  registroSteps.clickEnSubmit();
	  
	}

	@Then("^I validate \"([^\"]*)\" message$")
	public void iValidateMessage(String confirmText) {
	  registroSteps.confirmarTexto(confirmText);
	}
}
