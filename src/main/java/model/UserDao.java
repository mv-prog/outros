package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	public void create(User user) {
		entityManager.persist(user);
	}

	public void delete(User user) {
		if (entityManager.contains(user))
			entityManager.remove(user);
		else
			entityManager.remove(entityManager.merge(user));
	}

	public void update(User user) {
		entityManager.merge(user);
	}

	public User getById(String email) {
		return entityManager.find((User.class), email);
	}
	public List<User> getAllUsers(){
		return entityManager.createQuery("select u from User u").getResultList();
	}
}
