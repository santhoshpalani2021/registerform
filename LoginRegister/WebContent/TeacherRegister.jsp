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


<h1>Parent Register</h1>
<%
String status = (String)request.getAttribute("status");
if(status!=null)
{
	out.println(status);
}
%>

<form action="TeacherRegister" method="post">
<div class="col-md-6 mx-5 container-fluid">
<div class="mb-3" >
    <label for="" class="form-label">Id</label>
    <input type="number" class="form-control" id="id" name="id">
  </div>
  <div class="mb-3">
    <label for="" class="form-label">Name</label>
    <input type="text" class="form-control" id="name" name="name" >
  </div>
  <div class="mb-3">
    <label for="" class="form-label">mobile Number</label>
    <input type="number" class="form-control" id="number" name="number" >
  </div>
  
  <div class="mb-3">
    <label for="" class="form-label">Subject</label>
    <input type="text" class="form-control" id="number" name="subject" >
  </div>
 
  
  <button type="submit" class="btn btn-primary text-center" >Submit</button>
   
   <a type="button" class="btn btn-primary text-center display="inline"" href="TeacherView.jsp" >View</a>
 </div>
</form>

</body>
</html>