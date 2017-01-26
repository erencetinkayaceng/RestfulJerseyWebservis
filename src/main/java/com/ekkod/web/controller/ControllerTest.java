package com.ekkod.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ekkod.web.dao.TestDao;
import com.ekkod.web.model.Test;

/**
 * Servlet implementation class ControllerTest
 */
public class ControllerTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerTest() {
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
		RequestDispatcher rd=request.getRequestDispatcher("/dizintest/anatest.jsp?page=0");

		if(tip.equals("ekle")){
			testEkle(request);	
		}
		else if(tip.equals("guncelle")){
			testGuncelle(request);		
		}
		else if(tip.equals("sil")){
			testSil(request);
		}
		else{
			rd=request.getRequestDispatcher("/giris.html");
		}	
		  
        rd.forward(request, response);
	}
	
	private void testSil(HttpServletRequest request) {
		String id=request.getParameter("id");

		Test test=new Test();
		test.setId(Integer.parseInt(id));
		
		TestDao testdao=new TestDao();
		testdao.testSil(test);
	}

	private void testGuncelle(HttpServletRequest request) {
		String id=request.getParameter("id");  
		String testadi=request.getParameter("testadi");  
		String kategoriId=request.getParameter("kategoriId");  
		String ds=request.getParameter("ds");  
		String ys=request.getParameter("ys");  
		String bs=request.getParameter("bs");  
		String cozuldu=request.getParameter("cozuldu");  
		
		Test test=new Test();
		test.setId(Integer.parseInt(id));
		test.setTestAdi(testadi);
		test.setKategoriId(Integer.parseInt(kategoriId));
		test.setDogruSayisi(Integer.parseInt(ds));
		test.setYanlisSayisi(Integer.parseInt(ys));
		test.setBosSayisi(Integer.parseInt(bs));
		test.setCozuldu(Integer.parseInt(cozuldu));
		
		
		TestDao testdao=new TestDao();
		testdao.testGuncelle(test);
	}

	private void testEkle(HttpServletRequest request) {
		String testadi=request.getParameter("testadi");  
		String kategoriId=request.getParameter("kategoriId");  
		String ds=request.getParameter("ds");  
		String ys=request.getParameter("ys");  
		String bs=request.getParameter("bs");  
		String cozuldu=request.getParameter("cozuldu");  
		
		Test test=new Test();
		test.setTestAdi(testadi);
		test.setKategoriId(Integer.parseInt(kategoriId));
		test.setDogruSayisi(Integer.parseInt(ds));
		test.setYanlisSayisi(Integer.parseInt(ys));
		test.setBosSayisi(Integer.parseInt(bs));
		test.setCozuldu(Integer.parseInt(cozuldu));
		
		TestDao testdao=new TestDao();
		testdao.testEkle(test);
	}

}
