package br.com.caelum.vraptor.DAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.vraptor.model.Product;

public class ProductDAO implements Serializable {

	private static final long serialVersionUID = 1L;

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("nn");
	private EntityManager manager = factory.createEntityManager();

	public void insert(Product product) {
		manager.getTransaction().begin();
		manager.merge(product);
		manager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<Product> getAll() {
		return manager.createQuery("FROM " + Product.class.getName()).getResultList();
	}

	public Product getById(Long id) {
		return manager.find(Product.class, id);
	}

	public void remove(Product product) {
		Product p = manager.find(Product.class, product.getId());
		manager.getTransaction().begin();
		manager.remove(p);
		manager.getTransaction().commit();
	}

	public void update(Product newProduct) {
		Product product = manager.find(Product.class, newProduct.getId());
		manager.getTransaction().begin();
		product.setAmount(newProduct.getAmount());
		product.setCategory(newProduct.getCategory());
		product.setDescription(newProduct.getDescription());
		product.setName(newProduct.getName());
		manager.getTransaction().commit();
	}

	public void updateAmount(int amount, Long id) {
		Product product = manager.find(Product.class, id);
		manager.getTransaction().begin();
		product.setAmount(amount + product.getAmount());
		manager.getTransaction().commit();
	}
}