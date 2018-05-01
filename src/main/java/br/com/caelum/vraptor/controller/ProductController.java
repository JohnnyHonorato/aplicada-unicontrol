package br.com.caelum.vraptor.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Locale.Category;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.DAO.ProductDAO;
import br.com.caelum.vraptor.model.Product;

@Controller
public class ProductController {

	private ProductDAO bd = new ProductDAO();
	@Inject
	private Result result;

	@Post
	public void insert(Product product) {
		bd.insert(product);
		result.forwardTo(this).confirmacao();
	}

	@Get
	public List<Product> listar() {
		return bd.getAll();
	}

	@Get
	public void formulario() {
		result.include("categorias", Category.values());
	}

	@Get
	public void confirmacao() {
		
	}
}
