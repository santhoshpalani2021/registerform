<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>

	<div>
	<fieldset>
			<h2>singup</h2>
		<form action="signupServlet" method="post">
			<table>
				<td>
					<label>email</label>
					<input type="email" name="email">
				</td>
				<td>
					<label>Password</label>
					<input type="password" name="password">
				</td>
				<td>
					<label>conformPassword</label>
					<input type="cpassword" name="cpassword">
				</td>
				
			</table>
			<button value="submit">singup</button>
		
		</form>
		
	</fieldset>
	</div>

</body>
</html>