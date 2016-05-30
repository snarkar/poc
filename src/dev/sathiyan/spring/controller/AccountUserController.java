package dev.sathiyan.spring.controller;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import dev.sathiyan.spring.bean.AccountUser;
import dev.sathiyan.spring.bean.Employee;
import dev.sathiyan.spring.dao.AccountUserDao;


@RestController
@RequestMapping("/accountuser/")
public class AccountUserController {

	//<-----------------------------------------find accountuser----------------------------------->
	@Autowired
	AccountUserDao accountUserDao;
	
	@RequestMapping(value = "/{id}")
	public ResponseEntity<AccountUser> getAccountUser(@PathVariable("id") int id) throws SQLException {
		System.out.println("Fetching User with id " + id);
		AccountUser accuser = accountUserDao.findByint_key(id);
		if (accuser == null) {
			System.out.println("User with id " + id + " not found");
			return new ResponseEntity<AccountUser>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<AccountUser>(accuser, HttpStatus.OK);
	}
		
		
		
		
		
		//<---------------------------------------------------Create a user-------------------------------------------------------------->
		
		
		
		@RequestMapping(value = "/create/", method = RequestMethod.POST)
	    public ResponseEntity<Void> createAccountUser(@RequestBody AccountUser currentaccountuser,    UriComponentsBuilder ucBuilder) throws SQLException {
	        System.out.println("Creating User " + currentaccountuser.getAddressLine1());
	        System.out.println("Creating User " + currentaccountuser.getAddressLine2());
	        System.out.println("Creating User " + currentaccountuser.getCity());
	        System.out.println("Creating User " + currentaccountuser.getCompany());
	        System.out.println("Creating User " + currentaccountuser.getCountry());
	        System.out.println("Creating User " + currentaccountuser.getEmail());
	        System.out.println("Creating User " + currentaccountuser.getFirstName());
	        System.out.println("Creating User " + currentaccountuser.getInitial());
	        System.out.println("Creating User " + currentaccountuser.getintKey());
	        System.out.println("Creating User " + currentaccountuser.getLastName());
	        System.out.println("Creating User " + currentaccountuser.getNameKey());
	        System.out.println("Creating User " + currentaccountuser.getShortName());
	        System.out.println("Creating User " + currentaccountuser.getState());
	        System.out.println("Creating User " + currentaccountuser.getSuffix());
	        System.out.println("Creating User " + currentaccountuser.getTitle());
	    
	        
	 
	        /*if (accountUserDao.isUserExist(emp)) {
	            System.out.println("A User with name " + emp.getEmployeeName() + " already exist");
	            return new ResponseEntity<Void>(HttpStatus.CONFLICT);
	        }*/
	 
	        accountUserDao.save(currentaccountuser);
	 
	        HttpHeaders headers = new HttpHeaders();
	        headers.setLocation(ucBuilder.path("/{id}").buildAndExpand().toUri());
	        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	    }
		
		
		
	
//------------------- Update a User --------------------------------------------------------
   /* 
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public ResponseEntity<AccountUser> updateAccountUser(@PathVariable("id") int id, @RequestBody AccountUser accuser) throws SQLException {
        System.out.println("Updating User " + id);
         
        AccountUser currentAccountUser = accountUserDao.findByint_number(id);
         
        if (currentAccountUser==null) {
            System.out.println("User with id " + id + " not found");
            return new ResponseEntity<AccountUser>(HttpStatus.NOT_FOUND);
        }
 
        currentAccountUser.setAddressLine1(accuser.getAddressLine1());
        currentAccountUser.setAddressLine2(accuser.getAddressLine2());

        currentAccountUser.setCity(accuser.getCity());
        currentAccountUser.setCompany(accuser.getCompany());
        currentAccountUser.setCountry(accuser.getCountry());
        currentAccountUser.setEmail(accuser.getEmail());        
        currentAccountUser.setFirstName(accuser.getFirstName());
        currentAccountUser.setInitial(accuser.getInitial());
        currentAccountUser.setLastModDate(accuser.getLastModDate());
        currentAccountUser.setNameKey(accuser.getNameKey());
        currentAccountUser.setPhone(accuser.getPhone());
        currentAccountUser.setShortName(accuser.getShortName());
        currentAccountUser.setState(accuser.getState());
        currentAccountUser.setSuffix(accuser.getSuffix());
        currentAccountUser.setTaxID(accuser.getTaxID());
        currentAccountUser.setTitle(accuser.getTitle());
        currentAccountUser.setZip(accuser.getZip());
        
        
        
        
        accountUserDao.updateAccountUser(currentAccountUser);
        return new ResponseEntity<AccountUser>(currentAccountUser, HttpStatus.OK);
    }	*/
	
	
	
		
}

