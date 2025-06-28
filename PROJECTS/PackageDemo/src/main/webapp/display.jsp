<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:include page="CSS.jsp" />
</head>
<body>
<h2>Package Table</h2>

<input type="text" id="searchInput" placeholder="serch...">

<table>
      <tr>
         <th>ID</th>
         <th>Package Name</th>
         <th>Package Description</th>
         <th>Package Price</th>
         <th>Event Duration</th>
         <th>Members</th>
         <th>Event Type</th>
         <th>Package Type</th>
         <th>Action</th>
         
       </tr>
       <c:forEach var="service" items="${allpackages}">
         <tr>
         <td>${service.id}</td>
         <td>${service.title}</td>
         <td>${service.description}</td>
         <td>${service.price}</td>
         <td>${service.event_duration}</td>
         <td>${service.max_guests}</td>
         <td>${service.event_type}</td>
         <td>${service.package_type}</td>
         <td>
          <a href ="update.jsp?id=${service.id}&title=${service.title}&description=${service.description}&price=${service.price}&event_duration=${service.event_duration}&max_guests=${service.max_guests}&event_type=${service.event_type}&package_type=${service.package_type}">
               <button>Update</button>
          </a>
          
          <form action="Deleteservlet" method="post">
          <input type="hidden" name="id" value="${service.id}" />
           <button>Delete</button>
          </form>
          </td>
         </tr>
     </c:forEach>
</table>

<script>

function filterTable(){
	var input, filter, table, tr, td, i, txtValue;
	input = document.getElementById("searchInput");
	filter = input.value.toUpperCase();
	table = document.querySelector("table");
	tr = table.getElementsByTagName("tr");
	
	for(i=0; i < tr.length; i++){
		td = tr[i].getElementsByTagName("td");
		for (var j = 0;j < td.length; j++){
			if(td[j]){
				txtValue = td[j].textContent || td[j].innerText;
				if(txtValue.toUpperCase().indexOf(filter) > -1){
					tr[i].style.display = "";
					break;
				}else{
					tr[i].style.display = "none";
				}
			}
		}
	}
}

document.getElementById("searchInput").addEventListener("input",filterTable);
</script>

</body>
</html>