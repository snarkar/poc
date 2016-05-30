package dev.sathiyan.spring.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee
{
		@Id
		//@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "employee_id")
		private int employeeId;

		@Column(name="employee_name")
		private String employeeName;	
		

		//default constructor
		public Employee()
	    {
			
	    }

		public Employee(String employeeName)
		{
				this.employeeName = employeeName;
		}

		public int getEmployeeId()
		{
				return this.employeeId;
		}

		public void setEmployeeId(int employeeId)
		{
				this.employeeId = employeeId;
		}

		public String getEmployeeName()
		{
				return this.employeeName;
		}

		public void setEmployeeName(String employeeName)
		{
				this.employeeName = employeeName;
		}

		

/*		@Override
    public String toString()
    {
		    return "Employee [employeeId=" + this.employeeId + ", employeeName=" + this.employeeName + "]";
    }*/
}
