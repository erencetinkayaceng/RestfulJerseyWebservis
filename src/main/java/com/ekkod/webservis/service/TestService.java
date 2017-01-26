package com.ekkod.webservis.service;

import java.util.List;

import com.ekkod.web.dao.TestDao;
import com.ekkod.web.model.Test;

public class TestService {

	TestDao dao = new TestDao();

	public List<Test> getirTestler(int id) {
		return dao.getirIDsonrasiTestler(id);
	}
}
