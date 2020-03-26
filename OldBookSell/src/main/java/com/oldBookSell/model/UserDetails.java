package com.oldBookSell.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {

	@Id
	@GeneratedValue
	private int	user_id;
	
	  @Column(name="first_name") 
	  private String first_name;
	  
	  @Column(name="last_name") 
	  private String last_name;
	  
	  @Column(name="mobile_number") 
	  private String mobile_number;
	  
	  @Column(name="email",unique=true)
	  private String email;
	  
	  @Column(name="password") 
	  private String password;
	  
	  @Column(name="role")
	  private String role;
	  
	 	
	public UserDetails() {
		super();
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
	  public String getFirst_name() { return first_name; }
	  
	  public void setFirst_name(String first_name) { this.first_name = first_name;
	  } public String getLast_name() { return last_name; }
	  
	  public void setLast_name(String last_name) { this.last_name = last_name; }
	  
	  public String getMobile_number() { return mobile_number; }
	  
	  public void setMobile_number(String mobile_number) { this.mobile_number =
	  mobile_number; }
	  
	  public String getEmail() { return email; }
	  
	  public void setEmail(String email) { this.email = email; }
	  
	  public String getPassword() { return password; }
	  
	  public void setPassword(String password) { this.password = password; }
	  
	
	  
	  public String getRole() { return role; }
	  
	  public void setRole(String role) { this.role = role; }
	  
	
	@OneToOne(cascade = CascadeType.ALL)
    public Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public UserDetails(int user_id, String first_name, String last_name, String mobile_number,
			String email, String password, String role,Address address) {
		super();
		this.user_id = user_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_number = mobile_number;
		this.email = email;
		this.password = password;
		this.role = role;
		this.address = address;
	}
	
}
