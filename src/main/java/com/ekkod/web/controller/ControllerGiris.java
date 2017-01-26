package com.ekkod.web.controller;

import java.io.IOException;
import java.security.MessageDigest;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ekkod.web.model.Kullanici;
import com.ekkod.web.dao.KullaniciDao;

/**
 * Servlet implementation class ControllerGiris
 */
public class ControllerGiris extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerGiris() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		String ad = request.getParameter("kullaniciAd");
		String parola = request.getParameter("kullaniciParola");

		boolean status = kullaniciKontrolEt(ad, parola);

		if (status) {
			HttpSession session = request.getSession(true);
			session.setAttribute("Kullanici", ad);
			session.setMaxInactiveInterval(30 * 60);
			Cookie userName = new Cookie("Kullanici", ad);
			userName.setMaxAge(30 * 60);
			response.addCookie(userName);
			RequestDispatcher rd = request.getRequestDispatcher("anakpss.jsp");
			rd.forward(request, response);
		} else {
			RequestDispatcher rd = request.getRequestDispatcher("login-error.jsp");
			rd.forward(request, response);
		}

	}

	private boolean kullaniciKontrolEt(String _kullaniciAdi, String _parola) {

		KullaniciDao kdao = new KullaniciDao();
		Kullanici kullanici = kdao.getirKullanici(_kullaniciAdi);
		if (kullanici != null && kullanici.getParola().equals(shaParola(_parola))) {
			return true;
		}
		return false;
	}

	private String shaParola(String _parola) {
		try {
			MessageDigest mDigest = MessageDigest.getInstance("SHA1");
			byte[] result = mDigest.digest(_parola.getBytes());
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < result.length; i++) {
				sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
			}
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

}
