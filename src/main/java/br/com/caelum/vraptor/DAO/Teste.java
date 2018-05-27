package br.com.caelum.vraptor.DAO;

import br.com.caelum.vraptor.model.Output;
import br.com.caelum.vraptor.model.Product;

public class Teste {

	public static void main(String[] args) {

		Output p4 = new Output();
		p4.setAmount(10);
		p4.setId_product(1);
		OutputDAO p2 = new OutputDAO();
		p2.insert(p4);
	}
}
