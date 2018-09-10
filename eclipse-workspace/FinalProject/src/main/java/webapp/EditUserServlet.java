package webapp;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/edit_user.do")
public class EditUserServlet extends HttpServlet {
	
	private UserService UserService = new UserService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		request.setAttribute("user",UserService.getUserByUserName(username));
		request.getRequestDispatcher("/WEB-INF/views/edit_user.jsp").forward(request, response);
		
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		
		User user = new User(id, username, password, firstname, lastname, address, phone);
		
		UserService.updateUser(user);

		request.setAttribute("users", UserService.getUsers());
		request.getRequestDispatcher("/WEB-INF/views/users.jsp").forward(request, response);
	}
}