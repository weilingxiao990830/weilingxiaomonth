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



	<input type="button" value="查询影片" onclick="chaxun()"><br>
	<table>
		<tr>
			<td>请选择</td>
			<td>编号</td>
			<td>影片名称</td>
			<td>导演名称</td>
			<td>价格</td>
			<td>
				<a href="getDytvList?uptime=1">上映</a><a href="getDytvList?dowtime=0">时间</a>
			</td>
			<td>
				<a href="getDytvList?cuptime=1">时</a><a href="getDytvList?cdowtime=0">长</a>
			</td>
			<td>类型</td>
			<td>
			<a href="getDytvList?duptime=1">年</a><a href="getDytvList?ddowtime=0">代</a>
			</td>
			<td>区域</td>
			<td>状态</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="l">
			<tr>
				<td>
					<input type="checkbox" class="cks" value="${l.did}">
				</td>
				<td>${l.did}</td>
				<td>${l.dname}</td>
				<td>${l.person}</td>
				<td>${l.price}</td>
				<td>${l.startdate}</td>
				<td>${l.ctime}</td>
				<td>${l.tname}</td>
				<td>${l.dyear}</td>
				<td>${l.des}</td>
				<td>${l.dcode==0?"正在热映":"已经下架"}</td>
				<td>
					<input type="button" value="详情" onclick="update()">
					<input type="button" value="编辑" onclick="compie()">
					<c:if test="${l.dcode==0}">
					<input type="button" value="下架" onclick="dowjia(${l.did},1)">
					</c:if>
					<c:if test="${l.dcode==1}">
					<input type="button" value="上架" onclick="upjia(${l.did},0)">
					</c:if>
					
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="16">
				<input type="button" value="首页" onclick="fenye(1)">
				<input type="button" value="上一页" onclick="fenye(${page.pageNum}==1?${page.pageNum}:${page.pageNum}-1)">
				<input type="button" value="下一页" onclick="fenye(${page.pageNum}==${page.pages}?${page.pages}:${page.pageNum}+1)">
				<input type="button" value="尾页" onclick="fenye(${page.pages})">
			</td>
		</tr>
		<tr>
			<td colspan="16">
				<input type="button" value="全选" onclick="qx()">
				<input type="button" value="全不选" onclick="qbx()">
				<input type="button" value="反选" onclick="fx()">
				<input type="button" value="删除影片" onclick="delall()">
			</td>
		</tr>
	</table>
</body>
<script type="text/javascript">
	function dowjia(did,dcode){
		alert(did)
		alert(dcode)
		$.post(
			"updatedcode",
			{did:did,dcode:dcode},
			function(obj){
				if(obj>0){
					alert("修改成功")
				}else{
					alert("修改失败")
				}
				location="getDytvList"
			},
			"json"
		)
	}
	
	function upjia(did,dcode){
		alert(did)
		alert(dcode)
		$.post(
			"updatedcodea",
			{did:did,dcode:dcode},
			function(obj){
				if(obj>0){
					alert("修改成功")
				}else{
					alert("修改失败")
				}
				location="getDytvList"
			},
			"json"
		)
	}



	function delall(){
		var ids="";
		$(".cks:checked").each(function(){
			ids+=","+$(this).val()
		})
		ids=ids.substring(1)
		//alert(ids)
		$.post(
			"delallDytv",
			{ids:ids},
			function(obj){
				if(obj>0){
					alert("删除成功")
				}else{
					alert("删除失败")
				}
				location="getDytvList"
			},
			"json"
		)
	}
	function qx(){
		$(".cks").attr("checked",true);
	}
	function qbx(){
		$(".cks").attr("checked",false);
	}
	function fx(){
		$(".cks").each(function(){
			this.checked=!this.checked
		})
	}


	function fenye(pagenum){
		location="getDytvList?pagenum="+pagenum
	}

	function chaxun(){
		location="check.jsp"
	}

</script>
</html>
