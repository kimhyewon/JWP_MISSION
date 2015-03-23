package net.slipp.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.slipp.db.Database2;

@WebServlet("/users/update")
public class UpdateUserServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		Object userId = req.getSession().getAttribute("userId");
		if(userId != null) {
			req.getRequestDispatcher("/WEB-INF/updateForm.jsp").forward(req,  resp);
		} else {
			req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req,  resp);
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		User user = new User(userId, password, name, email);
//		Database.updateUser(user); //데이터베이스가 필요 없어졌기 때문에 밑 코드로 대체 
		UserDAO userDao = new UserDAO();
		try {
			userDao.updateUser(user);
		} catch (SQLException e) {
			
		}
		
		resp.sendRedirect("/");
	}
}
