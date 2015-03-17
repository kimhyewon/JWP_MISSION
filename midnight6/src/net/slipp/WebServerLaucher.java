package net.slipp;

import java.io.File;

import javax.servlet.annotation.WebServlet;

import org.apache.catalina.startup.Tomcat;


public class WebServerLaucher  {
	public static void main(String[] args) throws Exception {

        String webappDirLocation = "WebContent/";
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8030);

        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
        
    }
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
//			throws ServletException, IOException {
//		req.getRequestDispatcher("/index.jsp").forward(req,  resp);
//	}
}
