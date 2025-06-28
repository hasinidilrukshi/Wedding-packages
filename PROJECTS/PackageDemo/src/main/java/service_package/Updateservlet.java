package service_package;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Updateservlet")
public class Updateservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id             =request.getParameter("id");
		String title          = request.getParameter("title");
		String description    = request.getParameter("description");
		String price          = request.getParameter("price");
		String event_duration = request.getParameter("event_duration");
		String max_guests     = request.getParameter("max_guests");
		String event_type     = request.getParameter("event_type");
		String package_type   = request.getParameter("package_type");
		
		
		boolean isTrue;
		isTrue = package_control.updatedata(id, title, description, price, event_duration, max_guests, event_type, package_type);
		
		if(isTrue ==true) {
			List <pakageModel> servicedetails = package_control.getById(id);
			request.setAttribute("servicedetails", servicedetails);
			
			String alertMessage = "Data update Successful";
			response.getWriter().println("<script> alert('"+alertMessage+"'); window.location.href='pgetall'</script>");
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
			dis2.forward(request, response);
		}
	}

}
