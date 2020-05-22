package com.newtours.registro.testing.pageobjects;

import static org.junit.Assert.assertThat;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://newtours.demoaut.com/mercurywelcome.php")
public class RegistroUsuarioPageObject extends PageObject{
	
	//Localizadores
		By registryLink = By.xpath("//a[text()='REGISTER']");
		By txtFirstName = By.name("firstName");
		By txtlastTName = By.name("lastName");
		By txtPhone = By.name("phone");
		By txtMail = By.name("userName");
		By txtAddress = By.name("address1");
		By txtCity = By.name("city");
		By txtState = By.name("state");
		By txtpostalCode = By.name("postalCode");
		By listCountry = By.name("country");
		By txtUserName = By.name("email");
		By txtPassword = By.name("password");
		By txtConfirmPassword = By.name("confirmPassword");
		By btnSubmit = By.name("register");
		By txtConfirmText = By.xpath("//a[@href=\"mercurysignoff.php\"]");
		
		//Getters
		public By getRegistryLink() {
			return registryLink;
		}
		public By getTxtFirstName() {
			return txtFirstName;
		}
		public By getTxtlastTName() {
			return txtlastTName;
		}
		public By getTxtPhone() {
			return txtPhone;
		}
		public By getTxtMail() {
			return txtMail;
		}
		public By getTxtAddress() {
			return txtAddress;
		}
		public By getTxtCity() {
			return txtCity;
		}
		public By getTxtState() {
			return txtState;
		}
		public By getTxtpostalCode() {
			return txtpostalCode;
		}
		public By getListCountry() {
			return listCountry;
		}
		public By getTxtUserName() {
			return txtUserName;
		}
		public By getTxtPassword() {
			return txtPassword;
		}
		public By getTxtConfirmPassword() {
			return txtConfirmPassword;
		}
		public By getBtnSubmit() {
			return btnSubmit;
		}
		public By getTxtConfirmText() {
			return txtConfirmText;
		}
		
		
		
}
