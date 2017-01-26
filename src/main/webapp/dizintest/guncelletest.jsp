<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test Güncelleme</title>
</head>
<body>

<a href="<%=request.getContextPath()%>/anakpss.jsp">Ana Sayfa</a> 
<form action="<%=request.getContextPath()%>/ControllerTest?tip=guncelle" method="post">  
<table>   
<tr><td>Test adı: </td><td><input type="text" name="testadi"value="<%=request.getParameter("metin")%>"/></td></tr>  
<tr><td>Kategori Id: </td><td><input type="text" name="kategoriId"value="<%=request.getParameter("kategoriId")%>"/></td></tr> 
<tr><td>Dogru sayisi: </td><td><input type="text" name="ds"value="<%=request.getParameter("ds")%>"/></td></tr> 
<tr><td>Yanlis sayisi: </td><td><input type="text" name="ys"value="<%=request.getParameter("ys")%>"/></td></tr> 
<tr><td>Bos sayisi: </td><td><input type="text" name="bs"value="<%=request.getParameter("bs")%>"/></td></tr> 
<tr><td>Cozuldu :</td><td><input type="text" name="cozuldu"value="<%=request.getParameter("cozuldu")%>"/></td></tr> 
<tr><td colspan="6"><input type="submit" value="Test Güncelle"/></td></tr>  
</table>  
<input type="hidden" name="id" value="<%=request.getParameter("id")%>"/>
</form>  

</body>
</html>