package dev.sathiyan.spring.controller;


import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;






import dev.sathiyan.spring.bean.Employee;
import dev.sathiyan.spring.dao.EmployeeDao;
@RestController
@RequestMapping("/emp/")
public class HelloController {
	

	
	/*@RequestMapping(value = "/user/", method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> listAllUsers() {
		List<Employee> emp = employeeDao.findByPrimaryKey();
		if(emp.isEmpty()){
			return new ResponseEntity<List<Employee>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Employee>>(emp, HttpStatus.OK);
	}*/
	
	
	@Autowired
	EmployeeDao employeeDao;
	
	@RequestMapping(value = "/{id}")
	public ResponseEntity<Employee> getEmployee(@PathVariable("id") int id) throws SQLException {
		System.out.println("Fetching User with id " + id);
		Employee emp = employeeDao.findByPrimaryKey(id);
		if (emp == null) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
	
	/*@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String getGreeting(@PathVariable String name) {
		String result="Hello "+name;		
		return result;
	}
	
	@RequestMapping(value = "/{name}/{id}", method = RequestMethod.GET)
	public String getGreeting(@PathVariable String name, @PathVariable String id) {
		String result= name +", your id is " +id;		
		return result;
	}*/
	
	/*@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ResponseEntity<Void> createAcs(@RequestBody Employee emp, UriComponentsBuilder uiBuilder) {
		String result =	"Post method hitted";
		System.out.println(result);
		HttpHeaders headers = new HttpHeaders();
		//headers.setLocation(uiBuilder.path("/user/{id}").buildAndExpand().toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}*/
	
	//<---------------------------------------------------Create a user-------------------------------------------------------------->
	
	
	
	@RequestMapping(value = "/create/", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Void> createEmpolyee(@RequestBody Employee emp,    UriComponentsBuilder ucBuilder) throws SQLException {
        System.out.println("Creating User " + emp.getEmployeeName());
 
        if (employeeDao.isUserExist(emp)) {
            System.out.println("A User with name " + emp.getEmployeeName() + " already exist");
            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
        }
 
        employeeDao.save(emp);
 
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/{id}").buildAndExpand(emp.getEmployeeId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
	
	//------------------- Update a User --------------------------------------------------------
    
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") int id, @RequestBody Employee emp) throws SQLException {
        System.out.println("Updated User " + id);
         
        Employee currentEmployee = employeeDao.findByPrimaryKey(id);
         
        if (currentEmployee==null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }
 
        currentEmployee.setEmployeeName(emp.getEmployeeName());
        currentEmployee.setEmployeeId(emp.getEmployeeId());
         
        employeeDao.updateEmployee(currentEmployee);
        return new ResponseEntity<Employee>(currentEmployee, HttpStatus.OK);
    }
	
    
  //------------------- Delete a User --------------------------------------------------------
    
    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Employee> deleteUser(@PathVariable("id") int id) throws SQLException {
        System.out.println("Fetching & Deleting User with id " + id);
 
        Employee emp = employeeDao.findByPrimaryKey(id);
        if (emp == null) {
            System.out.println("Unable to delete. Employee with id " + id + " not found");
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }
 
        employeeDao.deleteEmployee(emp);
        return new ResponseEntity<Employee>(HttpStatus.OK);
    }
 
	
	
	
	
	
	
	
	
}