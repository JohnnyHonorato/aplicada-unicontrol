package br.com.caelum.vraptor.DAO;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.vraptor.model.OutPut;

public class OutputDAO implements Serializable {
	private static final long serialVersionUID = 1L;

	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("nn");
	private EntityManager manager = factory.createEntityManager();

	private ProductDAO productBD = new ProductDAO();

	public void insert(OutPut output) {
		if (output.getAmount() <= 0)
			throw new IllegalArgumentException();
		productBD.updateAmount((output.getAmount() * -1), output.getId_product());
		manager.getTransaction().begin();
		output.setData(Calendar.getInstance().getTime());
		manager.merge(output);
		manager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	public List<OutPut> getAll() {
		return manager.createQuery("FROM " + OutPut.class.getName()).getResultList();
	}

	public OutPut getById(long id) {
		return manager.find(OutPut.class, id);
	}

	public void remove(OutPut outputD) {
		OutPut output = manager.find(OutPut.class, outputD.getId());
		productBD.updateAmount(output.getAmount(), output.getId_product());
		manager.getTransaction().begin();
		manager.remove(output);
		manager.getTransaction().commit();
	}

}
