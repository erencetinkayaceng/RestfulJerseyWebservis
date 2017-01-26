<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Test Ekle</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/anakpss.jsp">Ana Sayfa</a> 
<h3>Yeni Test Ekle</h3>  
<form action="<%=request.getContextPath()%>/ControllerTest?tip=ekle" method="post">  
<table>  
<tr><td>Test adı: </td><td><input type="text" name="testadi"/></td></tr>  
<tr><td>Kategori Id: </td><td><input type="text" name="kategoriId"/></td></tr> 
<tr><td>Dogru sayisi: </td><td><input type="text" name="ds" value="0"/></td></tr> 
<tr><td>Yanlis sayisi: </td><td><input type="text" name="ys"value="0"/></td></tr> 
<tr><td>Bos sayisi: </td><td><input type="text" name="bs"value="0"/></td></tr> 
<tr><td>Cozuldu :</td><td><input type="text" name="cozuldu"value="0"/></td></tr> 
<tr><td colspan="6"><input type="submit" value="Test Ekle"/></td></tr>  
</table>  
</form>  

</body>
</html>