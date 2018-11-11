<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset='utf-8'">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/student/preSave.do">添加学生</a>
<table>
	<tr>
		<th>编号</th>
		<th>姓名</th>
		<th>年龄</th>
		<th>操作</th>
	</tr>
	<c:forEach var="student" items="${studentList }">
		<tr>
			<td>${student.id }</td>
			<td>${student.name }</td>
			<td>${student.age }</td>
			<td>
				<a href="${pageContext.request.contextPath }/student/preSave.do?id=${student.id}">修改</a>
				<a href="${pageContext.request.contextPath }/student/delete.do?id=${student.id}">删除</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>