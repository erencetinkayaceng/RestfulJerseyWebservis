<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Soru Güncelle</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/anakpss.jsp">Ana Sayfa</a> 
<form action="<%=request.getContextPath()%>/ControllerSoru?tip=guncelle" method="post">  
<table>  
<tr><td>Test id: </td><td><input type="text" name="testid" value="<%=request.getParameter("testid")%>"/></td></tr>  
<tr><td>Soru metni: </td><td><input type="text" name="sorumetni" value="<%=request.getParameter("sorumetni")%>"/></td></tr> 
<tr><td>Secenek A: </td><td><input type="text" name="sa" value="<%=request.getParameter("sa")%>"/></td></tr> 
<tr><td>Secenek B: </td><td><input type="text" name="sb" value="<%=request.getParameter("sb")%>"/></td></tr> 
<tr><td>Secenek C:</td><td><input type="text" name="sc" value="<%=request.getParameter("sc")%>"/></td></tr> 
<tr><td>Secenek D:</td><td><input type="text" name="sd" value="<%=request.getParameter("sd")%>"/></td></tr> 
<tr><td>Secenek E:</td><td><input type="text" name="se" value="<%=request.getParameter("se")%>"/></td></tr> 
<tr><td>Dogru Cevap:</td><td><input type="text" name="dc" value="<%=request.getParameter("dc")%>"/></td></tr> 
<tr><td>Kullanici Cevap: </td><td><input type="text" name="kc" value="<%=request.getParameter("kc")%>"/></td></tr> 
<tr><td colspan="9"><input type="submit" value="Soru Güncelle"/></td></tr>  
</table>  
<input type="hidden" name="id" value="<%=request.getParameter("id")%>"/>
</form>  

</body>
</html>