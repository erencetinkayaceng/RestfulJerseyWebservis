package com.ekkod.webservis.service;

import java.util.List;

import com.ekkod.web.dao.SoruDao;
import com.ekkod.web.model.Soru;

public class SoruService {

	SoruDao dao = new SoruDao();

	public List<Soru> getirSorular(int id) {
		return dao.getirIDsonrasiSorular(id);
	}
}
