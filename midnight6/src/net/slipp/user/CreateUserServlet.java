package net.slipp.user;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/users/save")
public class CreateUserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/createUserForm.jsp").forward(req,  resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		User user = new User(userId, password, name, email);
		
//		Database.addUser(user); //데이터베이스가 필요 없어졌기 때문에 밑 코드로 대체 
		UserDAO userDao = new UserDAO();
		try {
			userDao.addUser(user);
		} catch (SQLException e) {
			
		}
		
		resp.sendRedirect("/");
		
//		PrintWriter out = resp.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("<h1>" + userId + "</h1>");
//		out.println("<h1>" + password+ "</h1>");
//		out.println("<h1>" + name + "</h1>");
//		out.println("<h1>" + email + "</h1>");
//		out.println("</body>");
//		out.println("</html>");
	}
}
