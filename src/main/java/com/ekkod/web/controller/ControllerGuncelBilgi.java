package com.ekkod.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ekkod.web.dao.GuncelBilgiDao;
import com.ekkod.web.model.GuncelBilgi;

/**
 * Servlet implementation class ControllerGuncelBilgi
 */
public class ControllerGuncelBilgi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerGuncelBilgi() {
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
		RequestDispatcher rd=request.getRequestDispatcher("/dizinguncelbilgi/anaguncelbilgi.jsp?page=0");
	
		if(tip.equals("ekle")){
			guncelBilgiEkle(request);		
		}
		else if(tip.equals("guncelle")){
			guncelBilgiGuncelle(request);		
		}
		else if(tip.equals("sil")){
			guncelBilgiSil(request);
		}
		else{
			rd=request.getRequestDispatcher("/giris.html");
		}
		  
        rd.forward(request, response);
		
	}

	private void guncelBilgiSil(HttpServletRequest request) {
		String id=request.getParameter("id");

		GuncelBilgi gb=new GuncelBilgi();
		gb.setId(Integer.parseInt(id));
		
		GuncelBilgiDao gbdao=new GuncelBilgiDao();
		gbdao.guncelBilgiSil(gb);
	}

	private void guncelBilgiGuncelle(HttpServletRequest request) {
		String metin=request.getParameter("metin");  
		String tarih=request.getParameter("tarih");  
		String id=request.getParameter("id");  
		
		GuncelBilgi gb=new GuncelBilgi();
		gb.setMetin(metin);
		gb.setTarih(tarih);
		gb.setId(Integer.parseInt(id));
		
		GuncelBilgiDao gbdao=new GuncelBilgiDao();
		gbdao.guncelBilgiGuncelle(gb);
	}

	private void guncelBilgiEkle(HttpServletRequest request) {
		String metin=request.getParameter("metin");  
		String tarih=request.getParameter("tarih");  
		  
		GuncelBilgi gb=new GuncelBilgi();
		gb.setMetin(metin);
		gb.setTarih(tarih);
		
		GuncelBilgiDao gbdao=new GuncelBilgiDao();
		gbdao.guncelBilgiEkle(gb);
	}

}
