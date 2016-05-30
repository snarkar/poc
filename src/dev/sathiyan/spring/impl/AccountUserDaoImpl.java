package dev.sathiyan.spring.impl;

import java.math.BigInteger;
import java.sql.SQLException;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import dev.sathiyan.spring.bean.AccountUser;
import dev.sathiyan.spring.bean.Employee;
import dev.sathiyan.spring.dao.AccountUserDao;


@Service("accountUserDao")
@Repository("accountUserDao")
@Transactional(propagation = Propagation.REQUIRED)


public class AccountUserDaoImpl extends BaseDaoImpl implements AccountUserDao {

	@Override
	public void save(AccountUser currentaccountuser) throws SQLException {
		
		entityManager.persist(currentaccountuser);
		
	}

	@Override
	public AccountUser findByint_key(int id) throws SQLException {
		
		AccountUser accountuser = entityManager.find(AccountUser.class, id);

		return accountuser;
	}

	/*@Override
	public AccountUser updateAccountUser(AccountUser currentAccountUser) {

		AccountUser account_user = entityManager
		
		return accountuser;

	}
	*/
}
