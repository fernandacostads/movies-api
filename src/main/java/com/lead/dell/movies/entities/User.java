package com.lead.dell.movies.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.lead.dell.movies.profileenum.ProfileEnum;


@Entity
@Table(name="tb_user")
public class User implements Serializable, UserDetails {
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	@Column(name = "user_id")
	private long userId;
	
	@Column(nullable=false,unique=true)
	private String cpf;
	
	private String name;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(unique=true)
	private String email;
	
	private String username;
	
	@Column(nullable=false)
	private String password;
	
	@Enumerated(EnumType.STRING)
	private ProfileEnum profile;
	
	@ManyToOne
	@JoinColumn(name = "language_id")
	private Language language;

	private boolean active = true;


	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
		//return password;
	}

	

	public void setPassword(String password) {
		this.password = password;
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	
	public ProfileEnum getProfile() {
		return profile;
	}

	public void setProfile(ProfileEnum profile) {
		this.profile = profile;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	
	
}

