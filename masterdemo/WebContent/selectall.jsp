<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">库存信息如下</h1>
	<hr/>
	<table width="800" align="center">
		<tr>
			<th>货物编号</th>
			<th>货物名称</th>
			<th>生产日期</th>
			<th>入库日期</th>
			<th>所在仓库</th>
			<th>库存数量</th>
		</tr>
		<c:forEach items="${ tbStorages }" var="tbStorage" varStatus="status">
			<tr>
				<td>${ tbStorage.goodsId }</td>
				<td>${ tbStorage.goodsName }</td>
				<td>${ tbStorage.goodsInDate }</td>
				<td>${ tbStorage.goodsProductDate }</td>
				<td>${ tbStorage.storageName }</td>
				<td>${ tbStorage.goodsCount == 0?'库存不足': tbStorage.goodsCount}</td>
		</tr>
		</c:forEach>
		<tr>
		</tr>
	</table>
	<br>
	<p align="center">
	<a  style="color: purple;" href=" ${ pageContext.request.contextPath }/AllGoodsNameServlet" >返回出库页面</a>
	</p>
</body>
</html>