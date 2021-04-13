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

	@When("pesquisar o nome da escola {string}")
	public void pesquisar_o_nome_da_escola(String string) {
		metodo.escrever(string, el.getPesquisar());
		metodo.submit(el.getPesquisar());
	}

	@Then("valido {string}")
	public void valido(String string) {

	}

	@When("pesquisar a {string}")
	public void pesquisar_a(String string) {
		metodo.escrever(string, el.getPesquisar());
		metodo.submit(el.getPesquisar());
	}

	@Then("valido inovacao {string}")
	public void valido_inovacao(String string) {

	}

	@Then("valido felicidade {string}")
	public void valido_felicidade(String string) {

	}

}
