<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Soru Ekle</title>
</head>
<body>
<a href="<%=request.getContextPath()%>/anakpss.jsp">Ana Sayfa</a> 
<h3>Yeni Soru Ekle</h3>  
<form action="<%=request.getContextPath()%>/ControllerSoru?tip=ekle" method="post">  
<table>  
<tr><td>Test id: </td><td><input type="text" name="testid"/></td></tr>  
<tr><td>Soru metni: </td><td><input type="text" name="sorumetni"/></td></tr> 
<tr><td>Secenek A: </td><td><input type="text" name="sa"/></td></tr> 
<tr><td>Secenek B: </td><td><input type="text" name="sb"/></td></tr> 
<tr><td>Secenek C:</td><td><input type="text" name="sc"/></td></tr> 
<tr><td>Secenek D:</td><td><input type="text" name="sd"/></td></tr> 
<tr><td>Secenek E:</td><td><input type="text" name="se"/></td></tr> 
<tr><td>Dogru Cevap:</td><td><input type="text" name="dc" /></td></tr> 
<tr><td>Kullanici Cevap: </td><td><input type="text" name="kc" value="N"/></td></tr> 
<tr><td colspan="9"><input type="submit" value="Soru Ekle"/></td></tr>  
</table>  
</form>  

</body>
</html>