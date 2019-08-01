<%@page import="com.neu.entity.TbStorage"%>
<%@page import="java.util.List"%>
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
	 <form action="${ pageContext.request.contextPath }/SelectCountServlet" method="post">
	 	<h1 align="center">商品出库</h1>
	 	<table cellpadding="20" align="center">
	 		<tr>
	 			<td>请输入您要出库的商品：</td>
	 			<td>
	 				<select name="goodsName">
	 					<option>请选择</option>
						<c:forEach items="${ tbStorages }" var="tbStorage" varStatus="status">
							<option value="${ tbStorage.goodsName }">${ tbStorage.goodsName }</option>
						</c:forEach>
					</select>
	 			</td>
	 		</tr>
	 		<tr>
	 			<td>请输入要输出的数量：</td>
	 			<td>
					<input type="text" name="goodsCount">
	 			</td>
	 		</tr>
	 		<tr align="center">
	 			<td colspan="2">
					<input type="submit" value="确定">
					<input type="reset" value="重置">
	 			</td>
	 		</tr>
	 		<tr align="center">
	 			
	 			<td colspan="2">
					<a href="${ pageContext.request.contextPath }/SelectServlet">查看库存信息表</a>
	 			</td>
	 		</tr>
	 	</table>
	</form>
</body>
</html>