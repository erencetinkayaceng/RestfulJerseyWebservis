package com.ekkod.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ekkod.web.dao.SoruDao;
import com.ekkod.web.model.Soru;

/**
 * Servlet implementation class ControllerSoru
 */
public class ControllerSoru extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerSoru() {
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
		RequestDispatcher rd=request.getRequestDispatcher("/dizinsoru/anasoru.jsp?page=0");
		if(tip.equals("ekle")){
			soruEkle(request);
		}
		else if(tip.equals("guncelle")){
			soruGuncelle(request);		
		}
		else if(tip.equals("sil")){
			soruSil(request);
		}
		else{
			rd=request.getRequestDispatcher("/giris.html");
		}	
		  
        rd.forward(request, response);
	}

	private void soruSil(HttpServletRequest request) {
		String id=request.getParameter("id");

		Soru soru=new Soru();
		soru.setId(Integer.parseInt(id));
		
		SoruDao sorudao=new SoruDao();
		sorudao.soruSil(soru);
	}

	private void soruGuncelle(HttpServletRequest request) {
		String id=request.getParameter("id");  
		String testid=request.getParameter("testid");  
		String sorumetni=request.getParameter("sorumetni");  
		String sa=request.getParameter("sa");  
		String sb=request.getParameter("sb");  
		String sc=request.getParameter("sc");  
		String sd=request.getParameter("sd");  
		String se=request.getParameter("se");  
		String dc=request.getParameter("dc");  
		String kc=request.getParameter("kc"); 
		
		Soru soru=new Soru();
		soru.setId(Integer.parseInt(id));
		soru.setTestId(Integer.parseInt(testid));
		soru.setSorumetni(sorumetni);
		soru.setSecenekA(sa);
		soru.setSecenekB(sb);
		soru.setSecenekC(sc);
		soru.setSecenekD(sd);
		soru.setSecenekE(se);
		soru.setDogruCevap(dc);
		soru.setKullaniciCevap(kc);
		
		SoruDao sorudao=new SoruDao();
		sorudao.soruGuncelle(soru);
	}

	private void soruEkle(HttpServletRequest request) {
		String testid=request.getParameter("testid");  
		String sorumetni=request.getParameter("sorumetni");  
		String sa=request.getParameter("sa");  
		String sb=request.getParameter("sb");  
		String sc=request.getParameter("sc");  
		String sd=request.getParameter("sd");  
		String se=request.getParameter("se");  
		String dc=request.getParameter("dc");  
		String kc=request.getParameter("kc");  
		
		Soru soru=new Soru();
		soru.setTestId(Integer.parseInt(testid));
		soru.setSorumetni(sorumetni);
		soru.setSecenekA(sa);
		soru.setSecenekB(sb);
		soru.setSecenekC(sc);
		soru.setSecenekD(sd);
		soru.setSecenekE(se);
		soru.setDogruCevap(dc);
		soru.setKullaniciCevap(kc);
		
		SoruDao sorudao=new SoruDao();
		sorudao.soruEkle(soru);
	}
}
