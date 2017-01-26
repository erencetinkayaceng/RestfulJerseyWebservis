<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@page import="com.ekkod.web.dao.SoruDao,com.ekkod.web.model.*,java.util.*"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Soru</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/anakpss.jsp">Ana Sayfa</a> 


<%
int recordsPerPage =25;
int currentRecord=0;
int listsize=0;
List<Soru> list;
if(request.getParameter("page") != null){
	currentRecord = Integer.parseInt(request.getParameter("page"));
}

	list=SoruDao.getirSorular(); 
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
 
 <a href="<%=request.getContextPath()%>/dizinsoru/eklesoru.jsp">Yeni Soru Ekle</a>
 
<table border="1" width="90%" cellspacing="0">  
<tr><th>Id</th><th>Test Id</th><th>Soru metni</th><th>Seçenekler</th><th>DC</th><th>KC</th><th>Guncelle</th><th>Sil</th></tr>  
<c:forEach items="${altlist}" var="gb">  
<tr>
<td>${gb.getId()}</td><td>${gb.getTestId()}</td><td>${gb.getSorumetni()}</td>
<td>A: ${gb.getSecenekA()} </br> B: ${gb.getSecenekB()} </br> C: ${gb.getSecenekC()} </br> D: ${gb.getSecenekD()} </br> E: ${gb.getSecenekE()} </td>
<td>${gb.getDogruCevap()}</td><td>${gb.getKullaniciCevap()}</td>
<td><a href="<%=request.getContextPath()%>/dizinsoru/guncellesoru.jsp?id=${gb.getId()}&testid=${gb.getTestId()}&sorumetni=${gb.getSorumetni()}&sa=${gb.getSecenekA()}&sb=${gb.getSecenekB()}&sc=${gb.getSecenekC()}&sd=${gb.getSecenekD()}&se=${gb.getSecenekD()}&dc=${gb.getDogruCevap()}&kc=${gb.getKullaniciCevap()}">Güncelle</a></td>  
<td><a href="<%=request.getContextPath()%>/ControllerSoru?tip=sil&id=${gb.getId()}">Sil</a></td>
</tr>  
</c:forEach>  
</table>  

<%
for(int i=1; i < listsize/25;i++){
%>
	<a href="<%=request.getContextPath()%>/dizinsoru/anasoru.jsp?page=<%=i*25%>"><%=i%></a> 
<%
}
%>
 

</body>
</html>