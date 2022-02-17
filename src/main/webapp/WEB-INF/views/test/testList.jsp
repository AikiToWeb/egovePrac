<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>테스트 목록</title>
</head>
<body>

<form method="get" action="/test/list">  
	<input type="submit" value="list(GET)" />
</form>

<form method="get" action="/test/detail">  
	<input type="submit" value="detail(GET)" />
</form>

<form method="post" action="/test/insert">  
	<input type="submit" value="list(POST)" />
</form>

<form method="post" action="/test/update">  
	<input type="submit" value="list(POST)" />
</form>

<form method="post" action="/test/delete">  
	<input type="submit" value="detail(POST)" />
</form>

</body>
</html>