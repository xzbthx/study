<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/student/save.do" method="post">
	<table>
		<tr>
			<th colspan="2">学生添加</th>
		</tr>
		<tr>
			<td>姓名</td>
			<td><input type="text" name="name"></td><br/>
			<td>年龄</td>
			<td><input type="text" name="age"></td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="提交">
			</td>
		</tr>
	</table>
</form>
</body>
</html>