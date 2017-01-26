package com.ekkod.webservis.service;

import java.util.List;

import com.ekkod.web.dao.GuncelBilgiDao;
import com.ekkod.web.model.GuncelBilgi;

public class GuncelBilgiService {

	GuncelBilgiDao dao = new GuncelBilgiDao();

	public List<GuncelBilgi> getirGuncelBilgiler(int id) {
		return dao.getirIDsonrasiGuncelBilgiler(id);
	}

}
