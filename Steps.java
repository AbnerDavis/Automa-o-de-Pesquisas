package testes;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no(String string) {
		metodo.abrirNavegador(string);
	}

	@Then("valido informacao")
	public void valido_informacao() {
	  
	}

	@When("pesquisar por {string}")
	public void pesquisar_por(String string) {
		metodo.escrever(string, el.getPesquisar());
		metodo.submit(el.getPesquisar());
	}

	@Then("valido as informacao")
	public void valido_as_informacao() {
	    
	}

	@Then("valido a informacao")
	public void valido_a_informacao() {
	   
	}
	
}
