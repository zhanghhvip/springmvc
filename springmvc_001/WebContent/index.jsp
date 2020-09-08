 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true" %> 

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="testredirect">test redirect</a><br>
	<a href="testview">test view</a>
	<form action="testxiugai" method="post">
		<input type="hidden" name="id" value="1" />
	 	username:<input type="text" name="username" value="zs"/><br>
	 	age: <input type="text" name ="age" value="13"><br>
	    <input type="submit" value="save">
	</form><br>
	<a href="testsession">test session</a><br>
	<a href="testmap">test map</a><br>
	<a href="testmodelandview">test modelandview</a><br>
	<form action="testpojo" method="post">
	 	username:<input type="text" name="username"/><br>
	 	password:<input type="password" name="password"><br>
	 	age: <input type="text" name ="age"><br>
	 	province: <input type="text" name="address.province"><br>
	    city: <input type="text" name="address.city"><br>
	    <input type="submit" value="save">
	</form>
	<a href="testcookie">test cookie</a><br>

	<a href="testrequestheader">test requestheader</a><br>
	<a href="testrequestparam?username=zs&age=12">test requestparam</a><br>

	<a href="test/id=2">test get</a>
	<br>
	<form action="test" method="post">
		<input type="submit" value="test post">
	</form>
	<br>
	<form action="test/id=3" method="post">
		<input type="hidden" name="_method" value="PUT">
		<input type="submit" value="test PUT">
	</form>
	<br>
	<form action="test/id=4" method="post">
		<input type="hidden" name="_method" value="DELETE">
		<input type="submit" value="test DELETE">
	</form>
	<br>
	<a href="hello">hello world </a><br>
	
	<a href="update/id=1">test path variable</a>

</body>
</html>