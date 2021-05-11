<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Location</title>
	<style>
	table {
	    font-family: arial, sans-serif;
	    border-collapse: collapse;
	    width: 100%;
	}
	td, th {
	    border: 1px solid #dddddd;
	    text-align: left;
	    padding: 8px;
	}
	tr:nth-child(even) {
	    background-color: #dddddd;
	}
	</style>
</head>
<body>


<form action="saveLoc" method="post">
<pre>
Id <input type="text"  name="id"/>
Code <input type="text"  name="code"/>
Name <input type="text"  name="name"/>
Type:Urban <input type="radio" name="type" value="URBAN"/>
     Rural <input type="radio" name="type" value="RURAL"/>
     
 <input type="submit" value="save"/>

</pre>

</form>

${msg}

<a href="displayLocations">View All</a>

</body>
</html>