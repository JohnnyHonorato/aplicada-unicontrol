package br.com.caelum.vraptor.DAO;

import br.com.caelum.vraptor.model.OutPut;
import br.com.caelum.vraptor.model.Product;

public class Teste {

	public static void main(String[] args) {

		OutPut p4 = new OutPut();
		p4.setAmount(10);
		p4.setId_product(1);
		OutputDAO p2 = new OutputDAO();
		p2.insert(p4);
	}
}
