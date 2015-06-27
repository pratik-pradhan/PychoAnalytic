<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html lang="en">
<head>
<link href="<c:url value="/resources/css/bootstrap-theme.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap-theme.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
<script src="<c:url value="/resources/js/jquery.1.10.2.min.js" />"></script>
<script src="<c:url value="/resources/js/jquery-ui.js" />"></script>
<script src="<c:url value="/resources/js/main.js" />"></script>
</head>
<body>
	<h1 class="titleheading">PsychoAnalytic Application!!!</h1>
	<div id="accordion">
		<h3 id="section1" >Add Questions</h3>
		<div class="accordianBox">
				<form:form method="post" action="addQuestions" commandName="question" class="form-horizontal">
				     <fieldset>
				        <legend><spring:message code="label.category"/></legend>
				        <div class="form-group">
				            <div class="col-sm-11">
				                <form:input path="category" placeholder="Category" cssClass="form-control"/>
				            </div>
				            <form:errors path="category" cssClass="error"/>
				        </div>
					 </fieldset>
				    <fieldset >
				        <legend><spring:message code="label.quest"/></legend>
				        <div class="form-group">
				            <div class="col-sm-11">
				                <form:input path="quest" placeholder="Question" cssClass="form-control"/>
				            </div>
				            <form:errors path="quest" cssClass="error"/>
				        </div>
					 </fieldset>
					 <fieldset>  
				        <legend><spring:message code="label.option"/></legend>
				        <div class="form-group">			      
				            <div class="col-md-3">
				                <form:input path="option1" placeholder="option1" cssClass="form-control"/>
				            </div>
				            <form:errors path="option1" cssClass="error"/>
				        </div>
				         <div class="form-group">
				            <div class="col-md-3">
				                <form:input path="option2" placeholder="option2" cssClass="form-control"/>
				            </div>
				            <form:errors path="option2" cssClass="error"/>
				          </div>
				           <div class="form-group">
				            <div class="col-md-3">
				                <form:input path="option3" placeholder="option3" cssClass="form-control"/>
				            </div>
				            <form:errors path="option3" cssClass="error"/>
				            </div>
				             <div class="form-group">
				            <div class="col-md-3">
				                <form:input path="option4" placeholder="option4" cssClass="form-control"/>
				            </div>
				            <form:errors path="option4" cssClass="error"/>
				        </div>
				    </fieldset>
				    <br/>
				    <div class="form-group">
				        <div class="col-lg-offset-0 col-lg-10">
				            <button type="submit" class="btn btn-primary"><spring:message code="label.addQuestion"/></button>
				        </div>
				    </div>
				</form:form>
		</div>
		<h3 id="section2">Upload Questions</h3>
		<div>
			<p>Sed non urna. Donec et ante. Phasellus eu ligula. Vestibulum
				sit amet purus. Vivamus hendrerit, dolor at aliquet laoreet, mauris
				turpis porttitor velit, faucibus interdum tellus libero ac justo.
				Vivamus non quam. In suscipit faucibus urna.</p>
		</div>
	</div>


</body>
</html>