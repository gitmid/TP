<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- /WebContent/decorator/decorator.jsp --%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title><decorator:title/></title>
<decorator:head />
</head>
<body>
<table width="960" border="1" align="center">
	<tr><td colspan="3" align="right">
	<c:if test="${empty sessionScope.login }">
	<a href="#">�α���</a>
	</c:if>
	<c:if test="${!empty sessionScope.login }">
	${sessionScope.login }�� �ȳ��ϼ���
	<a href="#">�α׾ƿ�</a>
	</c:if>
	</td></tr>
	<tr><td width="15%" align="right" valign="top"><br>
	<a href="#">ȸ������</a><br>
	<a href="#">�Խ���</a>
	</td>
	<td colspan="2" align="center">
	<decorator:body/></td>
	</tr>
	<tr><td colspan="3" align="center">Since 2017</td></tr>
</table>
</body>
</html>