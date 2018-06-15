package br.com.caelum.vraptor.controller;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.UserDAO;
import br.com.caelum.vraptor.annotations.Public;
import br.com.caelum.vraptor.model.User;
import br.com.caelum.vraptor.validator.I18nMessage;
import br.com.caelum.vraptor.validator.Validator;

@Controller
public class LoginController {

	private final UserDAO dao;
	private final Validator validator;
	private final Result result;
	private final UserLogged userLogged;

	@Inject
	public LoginController(UserDAO dao, Validator validator, Result result, UserLogged userLogged) {
		this.dao = dao;
		this.validator = validator;
		this.result = result;
		this.userLogged = userLogged;
	}

	public LoginController() {
		this(null, null, null, null);
	}

	@Get @Public
	public void formulario() {

	}

	@Post @Public
	public void autentica(User user) {
		System.out.println(user.getNome());
		if (!dao.existe(user)) {
			validator.add(new I18nMessage("login", "login.invalido"));
			validator.onErrorUsePageOf(this).formulario();
		}
		userLogged.setUser(user);
		result.redirectTo(ProductController.class).listar();
	}

}
