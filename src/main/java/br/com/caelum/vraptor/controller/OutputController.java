package br.com.caelum.vraptor.controller;

import java.util.List;
import java.util.Locale.Category;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.OutputDAO;
import br.com.caelum.vraptor.model.Input;
import br.com.caelum.vraptor.model.Output;

@Controller
public class OutputController {

private OutputDAO bd = new OutputDAO();
	
	@Inject
	private Result result;

	@Post
	public void insert(Output output) {
		bd.insert(output);
		result.forwardTo(this).confirmacaoCad();
	}

	@Get
	public void formulario() {

	}

	@Get
	public List<Output> listar() {
		return bd.getAll();
	}

	@Get
	public void confirmacaoExcluir() {

	}

	@Get
	public void confirmacaoCad() {

	}

	@Delete
	public void remover(Output output) {
		bd.remove(output);
		result.redirectTo(this).confirmacaoExcluir();
	}
}
