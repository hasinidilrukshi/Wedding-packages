<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<div id="navbar"></div>
	<script>
    fetch('navbar.jsp')
        .then(response => response.text())
        .then(data => {
            document.getElementById('navbar').innerHTML = data;
        });
	</script>
<jsp:include page="CSS.jsp" />
</head>
<body>
<%
  String id             = request.getParameter("id");
  String title          = request.getParameter("title");
  String description    = request.getParameter("description");
  String price          = request.getParameter("price");
  String event_duration = request.getParameter("event_duration");
  String max_guests     = request.getParameter("max_guests");
  String event_type     = request.getParameter("event_type");
  String package_type   = request.getParameter("package_type");
  
%>
<div class="main">

            
            <form action="Updateservlet" method="post" onsubmit="return validateForm();">
            <h2>Package Details</h2>
			
			 <label for="id"
					>ID:</label>
					<input
					type="text"
					id="id"
					name="id"
					value="<%=id%>"
					placeholder="Enter Package Name" readonly>
   
			
			<label for="title"
					>Package Name:</label>
				<input
					type="text"
					id="title"
					name="title"
					value="<%=title%>"
					placeholder="Enter Package Name" required>
   

				<label for="description"
					>Package Description:</label>
				<input
					type="text"
					id="description"
					name="description"
					value="<%=description%>"
                    placeholder="Enter Description" required>
                    
				
                <label for="price">Package Price:</label>
				<input
					type="text"
					id="price"
					name="price"
					value="<%=price%>"
					placeholder="Enter Package Price " required>
    

                <label for="event_duration">Event Duration:</label>
				<input
					type="text"
					id="event_duration"
					name="event_duration"
					value="<%=event_duration%>"
					placeholder="Enter Event Duration" required>
      

                <label for="max_guests">Members of Participation:</label>
				<input
					type="text"
					id="max_guests"
					name="max_guests"
					value="<%=max_guests%>"
                    placeholder="Enter Maximum Particion" required>

        
        
				<label for="event_type"> Select Event Type:</label>
                                  <select id="event_type" name="event_type" value="<%=event_type%>" required>
                                    <option value="" disabled selected>Select an event type</option>
                                    <option value="wedding">Wedding</option>
                                    <option value="birthday">Birthday</option>
				                    <option value="conference">Conference</option>
                                    <option value="corporate">Corporate</option>
                                   </select>
				

                                <label for="package_type"> Select Package Type:</label>
                                  <select id="package_type" name="package_type" value="<%=package_type%>" required>
                                    <option value="" disabled selected>Select an package type</option>
                                    <option value="Basic">Basic</option>
                                    <option value="Premium">Premium</option>
				                    <option value="VIP">VIP</option>
                                  </select>
		
				<button type="submit">
					Update
				</button>
			</form>
			</div>
			<br>
      <br>
      <br>
      
      <div id="footer"></div>

    <script>
        // Load the footer HTML content
        fetch('footer.jsp')
            .then(response => response.text())
            .then(data => {
                document.getElementById('footer').innerHTML = data;
            })
            .catch(error => console.error('Error loading footer:', error));
     
        
        // JavaScript Validation
        
        function validateForm() {
    var price = document.getElementById('price').value;
    var maxGuests = document.getElementById('max_guests').value;

    // Validate price
    if (isNaN(price) || price <= 0) {
        alert('Please enter a valid positive price.');
        return false; // Prevent form submission
    }

    // Validate max guests
    if (isNaN(maxGuests) || maxGuests <= 0) {
        alert('Please enter a valid number for Maximum Participation.');
        return false; // Prevent form submission
    }

    return true; // Allow form submission if validations pass
}

    </script>
</body>
</html>