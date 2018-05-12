package br.com.caelum.vraptor.DAO;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.vraptor.model.Input;
import br.com.caelum.vraptor.model.Product;


public class InputDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("PU");
	private EntityManager manager = factory.createEntityManager();
	private ProductDAO productBD = new ProductDAO();

	public void insert(Input input) {
		if (input.getAmount() <= 0)
			throw new IllegalArgumentException();
		productBD.updateAmount(input.getAmount(), input.getProduct().getId());
		manager.getTransaction().begin();
		input.setData(Calendar.getInstance().getTime());
		manager.merge(input);
		manager.getTransaction().commit();
	}

	public Input getById(Long id) {
		return manager.find(Input.class, id);
	}

	public void remove(Long id) {
		Input input = getById(id);
		productBD.updateAmount((input.getAmount() * -1), input.getProduct().getId());
		manager.remove(input);
		manager.flush();
	}

	public List<Product> getAllProductFromInputById(Long id) {
		String query = "select i.product from Input i where i.product.id = :idProduct";
		return manager.createQuery(query).setParameter("idProduct", id).getResultList();
	}

	public List<Product> getAllProductFromInputByName(String name) {
		String query = "select i.product from Input i where i.product.name = :nameProduct";
		return manager.createQuery(query).setParameter("nameProduct", name).getResultList();
	}
}