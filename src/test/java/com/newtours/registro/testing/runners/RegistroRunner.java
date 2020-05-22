package com.newtours.registro.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/com/newtours/registro/testing/features",
glue="com.newtours.registro.testing.stepdefinitions",
snippets=SnippetType.CAMELCASE)
public class RegistroRunner {

	
}
