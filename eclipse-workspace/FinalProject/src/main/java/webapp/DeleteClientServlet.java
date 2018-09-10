package webapp;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/delete_client.do")
public class DeleteClientServlet extends HttpServlet {
	
	private ClientService ClientService = new ClientService();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String wo = request.getParameter("wo");
		
		ClientService.deleteClient(wo);

		request.setAttribute("clients", ClientService.getClients());
		request.getRequestDispatcher("/WEB-INF/views/user_report.jsp").forward(request, response);
	}
}