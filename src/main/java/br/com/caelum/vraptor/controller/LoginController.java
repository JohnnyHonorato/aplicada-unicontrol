package br.com.caelum.vraptor.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.model.User;

@Controller
public class LoginController {

	@Get
	public void formulario() {
		
	}
	
	@Post
	public void autentica(User user) {
		
	}
}
