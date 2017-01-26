<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@page import="com.ekkod.web.dao.IpucuDao,com.ekkod.web.model.*,java.util.*"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ipucu</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/anakpss.jsp">Ana Sayfa</a> 
<%
int recordsPerPage =25;
int currentRecord=0;
int listsize=0;
List<Ipucu> list;
if(request.getParameter("page") != null){
	currentRecord = Integer.parseInt(request.getParameter("page"));
}

	list=IpucuDao.getirIpuclari(); 
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
 
 <a href="<%=request.getContextPath()%>/dizinipucu/ekleipucu.jsp">Yeni İpucu Ekle</a>
 
<table border="1" width="90%" cellspacing="0">  
<tr><th>Id</th><th>Metin</th><th>Guncelle</th><th>Sil</th></tr>  
<c:forEach items="${altlist}" var="gb">  
<tr>
<td>${gb.getId()}</td><td>${gb.getMetin()}</td>
<td><a href="<%=request.getContextPath()%>/dizinipucu/guncelleipucu.jsp?id=${gb.getId()}&metin=${gb.getMetin()}">Güncelle</a></td>  
<td><a href="<%=request.getContextPath()%>/ControllerIpucu?tip=sil&id=${gb.getId()}">Sil</a></td>
</tr>  
</c:forEach>  
</table>  

<%
for(int i=1; i < listsize/25;i++){
%>
	<a href="<%=request.getContextPath()%>/dizinipucu/anaipucu.jsp?page=<%=i*25%>"><%=i%></a> 
<%
}
%>
 

</body>
</html>