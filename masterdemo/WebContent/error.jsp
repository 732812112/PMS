<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center" style="color: red">出错啦:货物库存数据不足！</h1>
	<table align="center">
		<tr>
			<th colspan="2" align="center">
				编号为${ tbStorage.goodsId }货物存储信息
			</th>
		</tr>
		<tr >
			<td >货物名称：</td>
			<td >${ tbStorage.goodsName }</td>
		</tr>
		<tr >
			<td >生产日期：</td>
			<td >${ tbStorage.goodsInDate }</td>
		</tr>
		<tr >
			<td >入库日期：</td>
			<td >${ tbStorage.goodsProductDate }</td>
		</tr>
		<tr >
			<td >所在仓库：</td>
			<td >${ tbStorage.storageName }</td>
		</tr>
		<tr >
			<td >存储数量：</td>
			<td >${ tbStorage.goodsCount }</td>
		</tr>
		<tr height="50" >
			<td colspan="2" align="center">
				点击<a  style="color: purple"  href="${ pageContext.request.contextPath }/SelectServlet">返回</a>查看商品库存信息
			</td>
		</tr>
		
	</table>
		
</body>
</html>