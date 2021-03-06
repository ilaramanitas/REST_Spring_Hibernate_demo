package com.jesuslc.contact.form;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
 

@Entity
@Table(name="contacts")
public class Contact {
	
	 @Id
	    @Column(name="id")
	    @GeneratedValue
	    private Integer id;
	     
	    @Column(name="firstname")
	    private String firstname;
	 
	    @Column(name="lastname")
	    private String lastname;
	 
	    @Column(name="email")
	    private String email;
	     
	    @Column(name="telephone")
	    private String telephone;
	     
	     
	    public String getEmail() {
	        return email;
	    }
	    public String getTelephone() {
	        return telephone;
	    }
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    public void setTelephone(String telephone) {
	        this.telephone = telephone;
	    }
	    public String getFirstname() {
	        return firstname;
	    }
	    public String getLastname() {
	        return lastname;
	    }
	    public void setFirstname(String firstname) {
	        this.firstname = firstname;
	    }
	    public void setLastname(String lastname) {
	        this.lastname = lastname;
	    }
	    public Integer getId() {
	        return id;
	    }
	    public void setId(Integer id) {
	        this.id = id;
	    }

}
