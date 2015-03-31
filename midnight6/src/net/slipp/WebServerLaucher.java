package net.slipp;

import java.io.File;

import javax.servlet.annotation.WebServlet;

import org.apache.catalina.startup.Tomcat;


public class WebServerLaucher  {
	public static void main(String[] args) throws Exception {

        String webappDirLocation = "webapp/";
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8030);

        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
        
    }
}
