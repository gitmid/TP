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
	<a href="#">로그인</a>
	</c:if>
	<c:if test="${!empty sessionScope.login }">
	${sessionScope.login }님 안녕하세요
	<a href="#">로그아웃</a>
	</c:if>
	</td></tr>
	<tr><td width="15%" align="right" valign="top"><br>
	<a href="#">회원관리</a><br>
	<a href="#">게시판</a>
	</td>
	<td colspan="2" align="center">
	<decorator:body/></td>
	</tr>
	<tr><td colspan="3" align="center">Since 2017</td></tr>
</table>
</body>
</html>