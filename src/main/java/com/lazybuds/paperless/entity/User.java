package com.lazybuds.paperless.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	public Long id;

	public String userName;

	public String password;
}
