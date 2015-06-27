<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<title>PsychoAnalytic Application</title>
</head>
<body>
	<br />
	<h1 class="titleheading">PsychoAnalytic Application!!!</h1>
	<h3>Welcome, <c:out value="${username}"/> </h3>
	<br/><br/><br/>
	<div>
	    <ul>
	      <li><a href="addQuestions">Add questions to the question Bank</a></li>
	    </ul>
	</div>
	<c:url var="logoutUrl" value="j_spring_security_logout" />
	<form action="${logoutUrl}" method="post">
		<input type="submit" value="Log out" /> <input type="hidden"
			name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>


</body>
</html>