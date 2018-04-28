package br.com.caelum.vraptor.DAO;

import br.com.caelum.vraptor.model.Category;
import br.com.caelum.vraptor.model.Product;

public class Teste {

	public static void main(String[] args) {
		
		ProductDAO d = new ProductDAO();
	
		Product i = new Product();
		i.setCategory(Category.ELETRICA);
		
		
		d.insert(i);
	}

}
