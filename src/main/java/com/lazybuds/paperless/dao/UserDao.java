package com.lazybuds.paperless.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDao {

	@Autowired
	private SessionFactory sessionFactory;

}
