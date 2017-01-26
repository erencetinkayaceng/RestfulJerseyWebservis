<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ana Sayfa</title>
</head>
<body>

<div>
	<a href="<%=request.getContextPath()%>/dizinguncelbilgi/anaguncelbilgi.jsp?page=0">Guncel Bilgi</a> 
	<a href="<%=request.getContextPath()%>/dizinipucu/anaipucu.jsp?page=0">İpucu</a> 
	<a href="<%=request.getContextPath()%>/dizinkategori/anakategori.jsp?page=0">Kategori</a>  
	<a href="<%=request.getContextPath()%>/dizintest/anatest.jsp?page=0">Test</a> 
	<a href="<%=request.getContextPath()%>/dizinsoru/anasoru.jsp?page=0">Soru</a> 
	
</div>

</body>
</html>