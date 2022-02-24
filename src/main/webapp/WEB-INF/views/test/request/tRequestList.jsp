<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>tRequest List</title>
</head>
<body>
<h1>여러 요청에 대한 실습</h1>

<a href="/test/request/regist?boardId=20210817001&boardContent=Good day&boardWriter=bjh">전송</a>
<a href="/test/request/regist?boardId=${boardId}&boardContent=${boardContent}&boardWriter=${boardWriter}">전송</a>
</body>
</html>