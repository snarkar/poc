package dev.sathiyan.spring.dao;

import java.sql.SQLException;

import dev.sathiyan.spring.bean.AccountUser;


public interface AccountUserDao {

	
	void save(AccountUser currentaccountuser) throws SQLException;
	
	AccountUser findByint_key(int id) throws SQLException;
	
	//AccountUser updateAccountUser(AccountUser accountuser);

	//void deleteAccountUser(AccountUser accountuser);
	
}
