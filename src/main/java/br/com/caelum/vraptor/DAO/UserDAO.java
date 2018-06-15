package br.com.caelum.vraptor.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.vraptor.model.User;

public class UserDAO {

	EntityManagerFactory factory = Persistence.createEntityManagerFactory("nn");
	private EntityManager manager = factory.createEntityManager();

	public boolean existe(User user) {
		return !manager.createQuery("select u from User u where u.nome =" + ":nome and u.senha = :senha", User.class)
				.setParameter("nome", user.getNome()).setParameter("senha", user.getSenha()).getResultList().isEmpty();
	}
	
	public void salvar(User user) {
		manager.persist(user);
	}
}
