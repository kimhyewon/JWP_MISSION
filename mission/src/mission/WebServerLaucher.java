package mission;

import java.io.File;

import org.apache.catalina.startup.Tomcat;

public class WebServerLaucher {
	   public static void main(String[] args) throws Exception {

	        String webappDirLocation = "WebContent/";
	        Tomcat tomcat = new Tomcat();

	        tomcat.setPort(8001);

	        tomcat.addWebapp("/", new File(webappDirLocation).getAbsolutePath());
	        System.out.println("configuring app with basedir: " + new File("./" + webappDirLocation).getAbsolutePath());

	        tomcat.start();
	        tomcat.getServer().await();
	    }
}
