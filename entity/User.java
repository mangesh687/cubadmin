package com.cub.cubadmin.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="user_detail")
public class User {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="username", length = 80)
	private String userName;
	
	@Column(name="firstname", length = 80)
	private String firstName;
	
	
	@Column(name="lastname", length = 80)
	private String lastName;
	
	@Column(name="emailaddress", length = 80)
	private String emailAddress;
	
	@Column(name="isadmin")
	private Boolean isAdmin;

	@ManyToMany(cascade= CascadeType.ALL,fetch= FetchType.EAGER)
	@JoinTable(name="user_role" , joinColumns =@JoinColumn(name="user_detail_id"),
	inverseJoinColumns = @JoinColumn(name="app_role_id"))
	private Set<Role> roles = new HashSet<>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String userName, String firstName, String lastName, String emailAddress, Boolean isAdmin,
			Set<Role> roles) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.isAdmin = isAdmin;
		this.roles = roles;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
	
}
