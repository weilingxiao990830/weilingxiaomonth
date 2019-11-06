<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%
	String path=request.getContextPath();
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<%=path%>/css/index_work.css"/> 
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
</head>
<body>
	<form action="getDytvList" method="post">
		影片名称:<input type="text" name="dname"><br>
		导演:<input type="text" name="person"><br>
		电影年代:<input type="text" name="dyear"><br>
		上映时间:<input type="date" name="starttime">至<input type="date" name="endtime"><br>
		价格:<input type="text" name="startmoney">-<input type="text" name="endmoney"><br>
		电影时长:<input type="text" name="start">-<input type="text" name="end"><br>
		<input type="submit" value="查询">
	</form>
</body>
</html>
