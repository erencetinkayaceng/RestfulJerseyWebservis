<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Güncel Bilgi Ekle</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/anakpss.jsp">Ana Sayfa</a> 
<h3>Yeni Güncel Bilgi Ekle</h3>  
<form action="<%=request.getContextPath()%>/ControllerGuncelBilgi?tip=ekle" method="post">  
<table>  
<tr><td>Metin:</td><td><input type="text" name="metin"/></td></tr>  
<tr><td>Tarih:</td><td><input type="text" name="tarih"/></td></tr> 
<tr><td colspan="2"><input type="submit" value="Güncel Bilgi Ekle"/></td></tr>  
</table>  
</form>  

</body>
</html>