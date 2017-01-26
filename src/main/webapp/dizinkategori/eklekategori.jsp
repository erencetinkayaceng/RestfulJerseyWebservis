<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Kategori ekle</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/anakpss.jsp">Ana Sayfa</a> 
<form action="<%=request.getContextPath()%>/ControllerKategori?tip=ekle" method="post">  
<table>  
<tr><td>Kategori Adı:</td><td><input type="text" name="kategoriAdi"/></td></tr>  
<tr><td colspan="2"><input type="submit" value="Kategori Ekle"/></td></tr>  
</table>  
</form>  

</body>
</html>