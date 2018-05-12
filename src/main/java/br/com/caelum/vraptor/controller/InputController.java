package br.com.caelum.vraptor.controller;

import java.util.Locale.Category;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.InputDAO;
import br.com.caelum.vraptor.model.Input;

@Controller
public class InputController {

	private InputDAO bd = new InputDAO();
	@Inject
	private Result result;
	
	@Post
	public void insert(Input input) {
		bd.insert(input);
		result.redirectTo(this).confirmacaoCad();
	}
	
	@Get
	public void formulario() {
		
	}
	
	@Get
	public void confirmacaoCad() {

	}
}
