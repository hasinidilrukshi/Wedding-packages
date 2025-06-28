package service_package;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/insertservlet")
public class insertservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title          = request.getParameter("title");
		String description    = request.getParameter("description");
		String price          = request.getParameter("price");
		String event_duration = request.getParameter("event_duration");
		String max_guests     = request.getParameter("max_guests");
		String event_type     = request.getParameter("event_type");
		String package_type   = request.getParameter("package_type");
		
		boolean isTrue;
		
		isTrue = package_control.insertdata( title,description,price,event_duration,max_guests,event_type,package_type);
		
		if(isTrue == true) {
			String alertMessage = "Data Insert Successful";
			response.getWriter().println("<script> alert('"+alertMessage+"'); window.location.href='pgetall'</script>");
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
			dis2.forward(request, response);
		}
	}
}
