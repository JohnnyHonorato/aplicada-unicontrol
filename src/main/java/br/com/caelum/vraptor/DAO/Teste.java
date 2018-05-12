package br.com.caelum.vraptor.DAO;

import br.com.caelum.vraptor.model.Category;
import br.com.caelum.vraptor.model.Input;
import br.com.caelum.vraptor.model.Product;

public class Teste {

	public static void main(String[] args) {
		
		InputDAO d = new InputDAO();
	
		Input ds = new Input();
		ds.setAmount(10);
		ds.setId_product(4);
		
		d.insert(ds);
		
	
	
	}

}
