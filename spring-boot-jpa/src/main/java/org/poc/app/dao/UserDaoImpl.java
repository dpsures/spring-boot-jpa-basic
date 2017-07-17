package org.poc.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.poc.app.pojos.Users;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Users> getAllUsers() {
		String hql = " from Users as u order by u.id";
		return (List<Users>) entityManager.createQuery(hql).getResultList();
	}

}
