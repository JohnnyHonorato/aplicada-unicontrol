package br.com.caelum.vraptor.controller;

import java.util.List;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.DAO.ProductDAO;
import br.com.caelum.vraptor.model.Product;

@Controller
public class ProductController {

	private ProductDAO bd = new ProductDAO();
	
	@Post
	public void insert(Product product) {
		bd.insert(product);
	}
	
	@Get
	public List<Product> listar(){
		return bd.getAll();
	}
}
