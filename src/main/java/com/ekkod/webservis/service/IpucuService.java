package com.ekkod.webservis.service;

import java.util.List;

import com.ekkod.web.dao.IpucuDao;
import com.ekkod.web.model.Ipucu;

public class IpucuService {

	IpucuDao dao = new IpucuDao();

	public List<Ipucu> getirIpuclari(int id) {
		return dao.getirIDsonrasiIpuclari(id);
	}
}
