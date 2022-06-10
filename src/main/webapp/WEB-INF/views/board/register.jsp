<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layout/header.jspf" %>
<div class="container">
<h1>글 추가 작성</h1>
<form action="register" method="post">
	제목 : <input type="text" name="title"><br>
	내용 :
	<textarea rows="20" cols="50" name="content"></textarea><br>
	작성자 : <input type="text" name="writer"> <br>
	<button>추가</button>
</form>
</div>
<%@ include file="/WEB-INF/views/layout/footer.jspf" %>
