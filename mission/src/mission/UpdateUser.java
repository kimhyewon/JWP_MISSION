package mission;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.model.Database;
import net.model.User;

@WebServlet("/UpdateUser")
public class UpdateUser extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String userId = req.getParameter("userId");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		User user = new User(userId, password, name, email);
		Database.updateUser(user);
		
//		resp.sendRedirect("/");
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>" + userId + "</h1>");
		out.println("<h1>" + password+ "</h1>");
		out.println("<h1>" + name + "</h1>");
		out.println("<h1>" + email + "</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
