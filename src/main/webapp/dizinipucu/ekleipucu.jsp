<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>İpucu Ekle</title>
</head>
<body>
<h3>Yeni ipucu ekle</h3>
<a href="<%=request.getContextPath()%>/anakpss.jsp">Ana Sayfa</a> 
<form action="<%=request.getContextPath()%>/ControllerIpucu?tip=ekle" method="post">  
<table>  
<tr><td>Metin:</td><td><input type="text" name="metin"/></td></tr>  
<tr><td colspan="2"><input type="submit" value="Ipucu Ekle"/></td></tr>  
</table>  
</form>  

</body>
</html>