package br.com.caelum.vraptor.controller;

import java.util.List;
import java.util.Locale.Category;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Delete;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Put;
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
		result.redirectTo(this).confirmacaoCad();
	}
	
	@Post
	public void atualiza(Product product) {
		bd.update(product);
		result.redirectTo(this).listar();
	}
	
	@Get
	private void confirmacaoEdit() {
		
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
	public Product edita(long id) {
		return bd.getById(id);
	}

	@Get
	public void confirmacaoCad() {

	}

	@Get
	public void confirmacaoExcluir() {

	}

	@Delete
	public void remover(Product product) {
		bd.remove(product);
		result.redirectTo(this).confirmacaoExcluir();
	}

	@Get
	public Product pesquisarProduct(long id) {
		return bd.getById(id);
	}
}
