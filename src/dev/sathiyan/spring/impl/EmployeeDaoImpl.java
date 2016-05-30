package dev.sathiyan.spring.impl;

import javax.persistence.EntityManager;

import javax.persistence.EntityTransaction;

import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dev.sathiyan.spring.bean.Employee;
import dev.sathiyan.spring.dao.EmployeeDao;

@Service("employeeDao")
@Repository("employeeDao")
@Transactional(propagation = Propagation.REQUIRED)
public class EmployeeDaoImpl extends BaseDaoImpl implements EmployeeDao {

	@Override
	public void save(Employee employee) {	
		
		
			entityManager.persist(employee);

	}

	@Override
	public Employee findByPrimaryKey(int id) {
		
		Employee employee = entityManager.find(Employee.class, id);

		return employee;
	}

	/**
	 * @return the entityManager
	 */
	public EntityManager getEntityManager() {
		return entityManager;
	}

	/**
	 * @param entityManager
	 *            the entityManager to set
	 */
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public boolean isUserExist(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee updateEmployee(Employee currentEmployee) {

		Employee employee = entityManager.merge(currentEmployee);
		
		return employee;

	}

	@Override
	public void deleteEmployee(Employee currentEmployee) {



/*		EntityTransaction trans = entityManager.getTransaction();
		try {

			trans.begin();*/
		
	 			
			entityManager.remove(currentEmployee);
		

		/*	trans.commit();

		} catch (RuntimeException e) {

			trans.rollback();
		}
*/		
		
		

	}
}
