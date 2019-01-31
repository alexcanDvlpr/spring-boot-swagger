package com.swagger.swagger.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Usuarios {

	@Id
	@Column(name = "dni", nullable = false)
	private String strDni;

	@Column(name = "name", nullable = false)
	private String strName;

	@Column(name = "surname", nullable = false)
	private String strSurname;

	@Column(name = "email", nullable = false)
	private String strEmail;

	@Column(name = "mobile", nullable = false)
	private String strMobile;

	@Column(name = "password", nullable = false)
	private String strPass;

	public String getStrDni() {
		return strDni;
	}

	public void setStrDni(String strDni) {
		this.strDni = strDni;
	}

	public String getStrName() {
		return strName;
	}

	public void setStrName(String strName) {
		this.strName = strName;
	}

	public String getStrSurname() {
		return strSurname;
	}

	public void setStrSurname(String strSurname) {
		this.strSurname = strSurname;
	}

	public String getStrEmail() {
		return strEmail;
	}

	public void setStrEmail(String strEmail) {
		this.strEmail = strEmail;
	}

	public String getStrMobile() {
		return strMobile;
	}

	public void setStrMobile(String strMobile) {
		this.strMobile = strMobile;
	}

	public String getStrPass() {
		return strPass;
	}

	public void setStrPass(String strPass) {
		this.strPass = strPass;
	}

}
