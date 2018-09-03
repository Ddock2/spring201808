<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<section>
		<div align="center">
			<br>
			<hr>
			<h2>게시판 목록</h2>
			<hr>
			<br>
			<table border="1" style="width:100%;" id="list">
				<tr>
					<th class="number">번호</th>
					<th class="title">제목</th>
					<th class="writer">글쓴이</th>
					<th class="reg_date">등록일</th>
				</tr>
				
				<c:forEach var="board" items="${boardList}">
					<tr>
						<td>${ board.no }</td>
						<td>
							<%-- <a href="#" onclick="doAction(${board.no})"> --%>
							<a href="${pageContext.request.contextPath}/board/${board.no}/detail.do">
								<c:out value="${ board.title }" />
							</a>
						</td>
						<td>${ board.writer }</td>
						<td>${ board.regDate }</td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<br>
			<c:if test="${not empty userVO}">
				<button onclick="gotoWriteFrom()">새글등록</button>
			</c:if>
			<button onclick="gotoSignUp()">회원가입</button>
			<c:if test="${userVO.type == 'S'}">
				<button onclick="goViewAllMember()">전체회원목록</button>
			</c:if>
		</div>
	</section>
</body>
</html>