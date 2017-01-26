<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Kategori güncelle</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/anakpss.jsp">Ana Sayfa</a> 
<form action="<%=request.getContextPath()%>/ControllerKategori?tip=guncelle" method="post">  
<table>  
<tr><td>Kategori Adı:</td><td><input type="text" name="kategoriAdi" value="<%=request.getParameter("kategoriAdi")%>"/></td></tr>  
<tr><td colspan="2"><input type="submit" value="Güncelle"/></td></tr>  
</table>  
<input type="hidden" name="id" value="<%=request.getParameter("id")%>"/>
</form> 

</body>
</html>