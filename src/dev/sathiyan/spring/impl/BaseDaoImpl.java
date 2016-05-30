package dev.sathiyan.spring.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import dev.sathiyan.spring.dao.BaseDao;

public class BaseDaoImpl implements BaseDao {	
	
	
	@PersistenceContext
	EntityManager entityManager;

}
