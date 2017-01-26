package com.ekkod.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ekkod.web.dao.KategoriDao;
import com.ekkod.web.model.Kategori;

/**
 * Servlet implementation class ControllerKategori
 */
public class ControllerKategori extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerKategori() {
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
		RequestDispatcher rd=request.getRequestDispatcher("/dizinkategori/anakategori.jsp?page=0");
			
		if(tip.equals("ekle")){
			kategoriEkle(request);			
		}
		else if(tip.equals("guncelle")){
			kategoriGuncelle(request);		
		}
		else if(tip.equals("sil")){
			kategoriSil(request);
		}
		else{
			rd=request.getRequestDispatcher("/giris.html");
		}
		  
        rd.forward(request, response);
	}
	
	private void kategoriSil(HttpServletRequest request) {
		String id=request.getParameter("id");

		Kategori kategori=new Kategori();
		kategori.setId(Integer.parseInt(id));
		
		KategoriDao kategoridao=new KategoriDao();
		kategoridao.kategoriSil(kategori);
	}

	private void kategoriGuncelle(HttpServletRequest request) {
		String kategoriAdi=request.getParameter("kategoriAdi");  
		String id=request.getParameter("id");  
		
		Kategori kategori=new Kategori();
		kategori.setKategoriAdi(kategoriAdi);
		kategori.setId(Integer.parseInt(id));
		
		KategoriDao kategoridao=new KategoriDao();
		kategoridao.kategoriGuncelle(kategori);
	}

	private void kategoriEkle(HttpServletRequest request) {
		String kategoriAdi=request.getParameter("kategoriAdi");  
		  
		Kategori kategori=new Kategori();
		kategori.setKategoriAdi(kategoriAdi);
		
		KategoriDao kategoridao=new KategoriDao();
		kategoridao.kategoriEkle(kategori);
	}

}
