<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%-- /WebContent/WEB-INF/jsp/index.jsp --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>상품 목록 보기</title>
</head>
<body>
<h2>상품 목록</h2>
<table border="1" width="400">
	<tr><th width="50">상품ID</th>
		<th width="250">상품명</th>
		<th width="100">가격</th>
		<th width="100">사진</th>
		</tr>
	<c:forEach items="${itemList }" var="item">
	<tr><td align="center">${item.id }</td>
	<td align="center"><a href="detail.shop?id=${item.id }">${item.name }</a></td>
	<td align="center">${item.price }</td>
	<td align="center"><img width="50" src="img/${item.pictureUrl }"></td></tr>
	</c:forEach>
</table>
</body>
</html>