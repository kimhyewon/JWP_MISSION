package mission;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import net.model.Database;
import net.model.User;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	
	protected void doPost(javax.servlet.http.HttpServletRequest req,
			javax.servlet.http.HttpServletResponse resp)
					throws javax.servlet.ServletException ,java.io.IOException {

		String userId = req.getParameter("userId");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		User user = new User(userId, password, name, email);
		Database.addUser(user);
		
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
	};
}
