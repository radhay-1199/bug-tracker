<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bug Tracker</title>
</head>
<body>
<h1>Add Bugs</h1>
<form:form action="api/rest/issues" method="post">

	<label for="">Id</label>
	<form:input path="id" />
	<label for="">Summary</label>
	<form:input path="summary" />
	<label for="">Description</label>
	<form:input path="description" />
	<label for="">Project</label>
	<form:input path="project" />
	<label for="">Priority</label>
	<form:input path="priority" />
	<label for="">Severity</label>
	<form:input path="severity" />
	<label for="">AssignedTo</label>
	<form:input path="assignedTo" />
	
	<input type="submit" value="Add" />
</form:form>
</body>
</html>