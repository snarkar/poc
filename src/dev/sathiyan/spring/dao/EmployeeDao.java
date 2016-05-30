package dev.sathiyan.spring.dao;

import java.sql.SQLException;

import dev.sathiyan.spring.bean.Employee;

public interface EmployeeDao
{
		void save(Employee employee) throws SQLException;

		Employee findByPrimaryKey(int id) throws SQLException;

		boolean isUserExist(Employee emp);

		Employee updateEmployee(Employee currentEmployee);

		void deleteEmployee(Employee currentEmployee);

}
