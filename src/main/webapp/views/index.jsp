<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.1/jquery.min.js"></script>

<title>Insert title here</title>
</head>
<script type="text/javascript">
	$(document).ready(function(){
		
		$("#testlink").click(function(){
			
			$.ajax({
				url:"./testlink",
				type:"GET",
				contentType:"application/json; charset=utf-8",
				success:function(result)
				{
					alert(result);
				},
				error:function(result)
				{
					alert("Error");
				}
				
			});
			
		});
		
		$.ajax({
			url:"./persons",
			type:"GET",
			contentType:"application/json; charset=utf-8",
			success:function(result)
			{
				//alert(result);
				var text=""
				
				for(var i=0;i<result.length;i++)
				{
					//alert(result[i].name);
					text=text+"<tr><td>"+result[i].id+"</td>   <td>"+result[i].name+"</td>  <td>"+result[i].age+"</td>  <td>"+result[i].phone+"</td></tr>";
				}
				//alert(text);
				$("#tablebody").html(text);
				
			},
			errror:function()
			{
				alert("Can Not Submit REquest");
			}
		});//ajax close
		
		
		
		$("#s1").click(function(){
			//alert("Hello");
			var pid=$("#id").val();
			var pname=$("#name").val();
			var page=$("#age").val();
			var pphone=$("#phone").val();
			
			//alert(pid+" "+pname+" "+page+" "+pphone );
			
			var object={
					    name : pname,
					    age : page,
					    phone : pphone
					    };
			
			var jsonObj = JSON.stringify(object); 
			
			$.ajax({
				url:"./person",
				type:"POST",
				contentType:"application/json; charset=utf-8",
				data:jsonObj,
				success:function(result)
				{
					alert(result);
					location.reload() ;
				},
				errror:function(result)
				{
					alert(result);
				}
			});//ajax close
		});//click close
	});//document close
	
</script>

<body>
<h1>Index Page</h1>

Enter Id<input type="text" name="id" id="id"/><br><br>
Enter Name<input type="text" name="name" id="name"/><br><br>
Enter Age<input type="text" name="age" id="age"/><br><br>
Enter Phone<input type="text" name="phone" id="phone"/><br><br>
<input type="submit"  value="Submit" id="s1"/>

<div id="displayTable">
	<table>
		<thead>
		<tr>
			<th>ID</th>
			<th>NAME</th>
			<th>AGE</th>
			<th>PHONE</th>
		</tr>
		</thead>
		<tbody id="tablebody">
			
		</tbody>
		
		
	</table>
	
	
	<a href="./testlink" id="testlink">Click here</a>
</div>
</body>
</html>