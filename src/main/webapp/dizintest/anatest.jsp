<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@page import="com.ekkod.web.dao.TestDao,com.ekkod.web.model.*,java.util.*"%>  

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test</title>
</head>
<body>

<%
int recordsPerPage =25;
int currentRecord=0;
int listsize=0;
List<Test> list;
if(request.getParameter("page") != null){
	currentRecord = Integer.parseInt(request.getParameter("page"));
}

	list=TestDao.getirTestler(); 
	listsize=list.size();
	if(listsize<recordsPerPage){
		recordsPerPage=listsize;
		}
	else if(currentRecord+recordsPerPage < listsize){
		recordsPerPage =currentRecord+(listsize-currentRecord);
	}
	else{
		recordsPerPage =currentRecord+recordsPerPage;
	}
	request.setAttribute("altlist",list.subList(currentRecord, recordsPerPage));
	

%>

 <a href="<%=request.getContextPath()%>/anakpss.jsp">Ana Sayfa</a> 
 <a href="<%=request.getContextPath()%>/dizintest/ekletest.jsp">Yeni Test Ekle</a>
 
<table border="1" width="90%" cellspacing="0">  
<tr><th>Id</th><th>Test adı</th><th>Kategori id</th><th>DS</th><th>YS</th><th>BS</th><th>C</th><th>Guncelle</th><th>Sil</th></tr>  
<c:forEach items="${altlist}" var="gb">  
<tr>
<td>${gb.getId()}</td><td>${gb.getTestAdi()}</td><td>${gb.getKategoriId()}</td>
<td>${gb.getDogruSayisi()}</td><td>${gb.getYanlisSayisi()}</td><td>${gb.getBosSayisi()}</td><td>${gb.getCozuldu()}</td>
<td><a href="<%=request.getContextPath()%>/dizintest/guncelletest.jsp?id=${gb.getId()}&testadi=${gb.getTestAdi()}&kategoriId=${gb.getKategoriId()}&ds=${gb.getDogruSayisi()}&ys=${gb.getYanlisSayisi()}&bs=${gb.getBosSayisi()}&cozuldu=${gb.getCozuldu()}">Güncelle</a></td>  
<td><a href="<%=request.getContextPath()%>/ControllerTest?tip=sil&id=${gb.getId()}">Sil</a></td>
</tr>  
</c:forEach>  
</table>  

<%
for(int i=1; i < listsize/25;i++){
%>
	<a href="<%=request.getContextPath()%>/dizintest/anatest.jsp?page=<%=i*25%>"><%=i%></a> 
<%
}
%>
 

</body>
</html>