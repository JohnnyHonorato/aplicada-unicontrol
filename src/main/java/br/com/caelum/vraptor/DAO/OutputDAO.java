package br.com.caelum.vraptor.DAO;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.vraptor.model.Output;

public class OutputDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("nn");
	private EntityManager manager = factory.createEntityManager();

	private ProductDAO productBD = new ProductDAO();

	public void insert(Output output) {
		if (output.getAmount() <= 0)
			throw new IllegalArgumentException();
		productBD.updateAmount((output.getAmount() * -1), output.getId_product());
		manager.getTransaction().begin();
		output.setData(Calendar.getInstance().getTime());
		manager.merge(output);
		manager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<Output> getAll() {
		return manager.createQuery("FROM " + Output.class.getName()).getResultList();
	}

	public Output getById(long id) {
		return manager.find(Output.class, id);
	}

	public void remove(Output outputD) {
		Output output = manager.find(Output.class, outputD.getId());
		productBD.updateAmount(output.getAmount(), output.getId_product());
		manager.getTransaction().begin();
		manager.remove(output);
		manager.getTransaction().commit();
	}

}
