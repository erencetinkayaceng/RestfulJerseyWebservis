package com.ekkod.webservis.service;

import java.util.List;

import com.ekkod.web.dao.KategoriDao;
import com.ekkod.web.model.Kategori;

public class KategoriService {

	KategoriDao dao = new KategoriDao();

	public List<Kategori> getirNormalKategoriler(int id) {
		return dao.getirIDsonrasiKategoriler(id);
	}
}
