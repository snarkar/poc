package dev.sathiyan.spring.bean;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="account_user")
public class AccountUser {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Int_key")
	private int intKey;

	@Column(name="FirstName")
	private String firstName;
	

	@Column(name="Initial")
	private String initial;

	@Column(name="LastName")
	private String lastName;

	@Column(name="ShortName")
	private String shortName;

	@Column(name="NameKey")
	private String nameKey;

	@Column(name="Suffix")
	private String suffix;

	@Column(name="Title")
	private String title;
	
	@Column(name="Company")
	private String company;

	@Column(name="Addressline1")
	private String addressLine1;

	@Column(name="Addressline2")
	private String addressLine2;

	@Column(name="City")
	private String city;
	
	@Column(name="State")
	private String state;
	

	@Column(name="Zip")
	private Long zip;

	@Column(name="Country")
	private String country;

	@Column(name="TaxID")
	private Long taxID;

	@Column(name="Phone")
	private Long phone;

	@Column(name="Email")
	private String email;

	@Column(name="LastModDate")
	private Date lastModDate;

	
	
	//<-------------------------------------------------------------------------------------------->
	
	
	public int getintKey() {
		return intKey;
	}

	public void setintKey(int intKey) {
		this.intKey = intKey;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getInitial() {
		return initial;
	}

	public void setInitial(String initial) {
		this.initial = initial;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getShortName() {
		return shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getNameKey() {
		return nameKey;
	}

	public void setNameKey(String nameKey) {
		this.nameKey = nameKey;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getZip() {
		return zip;
	}

	public void setZip(Long zip) {
		this.zip = zip;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getTaxID() {
		return taxID;
	}

	public void setTaxID(Long taxID) {
		this.taxID = taxID;
	}

	public Long getPhone() {
		return phone;
	}

	public void setPhone(Long phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getLastModDate() {
		return lastModDate;
	}

	public void setLastModDate(Date lastModDate) {
		this.lastModDate = lastModDate;
	}
	

}
