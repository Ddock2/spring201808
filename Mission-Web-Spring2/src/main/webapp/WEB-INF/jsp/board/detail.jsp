<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="/Mission-Web/css/board.css">
<link rel="stylesheet" href="/Mission-Web/css/layout.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>상세페이지</title>
<script src="http://code.jquery.com/jquery-3.3.1.min.js"></script>
<script>
	$(document).ready(function() {
/* 		$("button").eq(2).click(function() {
			location.href = "list.jsp";
		});
 */		
 		$('button').click(function(){
 			switch($(this).text()){
 				case '목록' :
 					location.href = "list.jsp";
 					break;
 				case '수정' :
 					location.href = "updateForm.jsp?no=${param.no}";
 					break;
 				case '삭제' :
 					if(confirm('게시물을 삭제하시겠습니까?')){
 						location.href = "delete.jsp?no=${param.no}";
 					}
 					break;
 				case '다운로드' :
 					location.href = "download.jsp?fileSaveName="+$(this).attr('value');
 					break;
 					
 			}
 		});
	});
</script>
<style>
	hr{
		width : "80%";
	}
</style>
</head>
<body>
	<section><div align="center">
		<br>
		<hr>
		<h2>게시판 상세</h2>
		<hr>
		<br>
		<table border="1" style="width: 100%;">
			<tr>
				<th width="25%">번호</th>
				<td>${ board.no }</td>
			</tr>
			<tr>
				<th>제목</th>
				<td>${ board.title }</td>
			</tr>
			<tr>
				<th>글쓴이</th>
				<td>${ board.writer }</td>
			</tr>
			<tr>
				<th>내용</th>
				<td>${ board.content }</td>
			</tr>
			<tr>
				<th>조회수</th>
				<td>${ board.viewCnt }</td>
			</tr>
			<tr>
				<th>등록일</th>
				<td>${ board.regDate }</td>
			</tr>
		</table>
		<br><br>
			<button>수정</button>
			<button>삭제</button>
		<button>목록</button>
	</div></section>
</body>
</html>