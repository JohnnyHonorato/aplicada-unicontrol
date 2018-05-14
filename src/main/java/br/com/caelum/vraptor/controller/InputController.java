package br.com.caelum.vraptor.controller;

import java.util.List;
import java.util.Locale.Category;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.InputDAO;
import br.com.caelum.vraptor.model.Input;
import br.com.caelum.vraptor.model.Product;

@Controller
public class InputController {

	private InputDAO bd = new InputDAO();
	@Inject
	private Result result;
	
	@Post
	public void insert(Input input) {
		bd.insert(input);
		
	}
	
	@Get
	public void formulario() {
		
	}
	
	@Get
	public List<Input> listar() {
		return bd.getAll();
	}
	
	@Delete
	public void remover(Long id) {
		bd.remove(id);
		result.redirectTo(this).confirmacaoExcluir();
	}

	private void confirmacaoExcluir() {
		
	}

}
