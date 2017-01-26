package com.ekkod.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ekkod.web.dao.IpucuDao;
import com.ekkod.web.model.Ipucu;

/**
 * Servlet implementation class ControllerIpucu
 */
public class ControllerIpucu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerIpucu() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tip=request.getParameter("tip");
		RequestDispatcher rd=request.getRequestDispatcher("/dizinipucu/anaipucu.jsp?page=0");
		
		if(tip.equals("ekle")){
			ipucuEkle(request);		
		}
		else if(tip.equals("guncelle")){
			ipucuGuncelle(request);		
		}
		else if(tip.equals("sil")){
			ipucuSil(request);
		}
		else{
			rd=request.getRequestDispatcher("/giris.html");
		}
		  
        rd.forward(request, response);
	}

	private void ipucuSil(HttpServletRequest request) {
		String id=request.getParameter("id");

		Ipucu ip=new Ipucu();
		ip.setId(Integer.parseInt(id));
		
		IpucuDao ipdao=new IpucuDao();
		ipdao.ipucuSil(ip);
	}

	private void ipucuGuncelle(HttpServletRequest request) {
		String metin=request.getParameter("metin");  
		String id=request.getParameter("id");  
		
		Ipucu ip=new Ipucu();
		ip.setMetin(metin);
		ip.setId(Integer.parseInt(id));
		
		IpucuDao ipdao=new IpucuDao();
		ipdao.ipucuGuncelle(ip);
	}

	private void ipucuEkle(HttpServletRequest request) {
		String metin=request.getParameter("metin");  
		  
		Ipucu ip=new Ipucu();
		ip.setMetin(metin);
		
		IpucuDao ipdao=new IpucuDao();
		ipdao.ipucuEkle(ip);
	}
}
