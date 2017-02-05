<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
<title>Insert title here</title>
<style type="text/css">
body {
	background: url("${pageContext.request.contextPath}/images/background.jpg");
}
</style>
</head>
<body>
<div id='cssmenu'>
<ul>
  
</ul>
</div>
<br><br><br>
<h2 align="center">Instruction for ${sessionScope.exam} Exam: </h2>

<div style="position:absolute;left:500px;top:170px">
<ul style="list-style-type:disc">
 <li>Exam contains 100 Multiple Choice Questions</li>
 <li>Total time for the exam is 100 Minutes</li>
 <li>Read the question carefully before answering</li>
 <li>You can change your answers before submitting</li>
 <li>Good luck for the test.</li>
</ul>  
<br><br><br>
</div>

<div  style="position:absolute;left:600px;top:350px">
<button onclick="location.href='exam.jsp'">Start Exam</button>
</div>


</body>
</html>