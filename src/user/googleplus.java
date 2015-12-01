package user;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.scribe.builder.ServiceBuilder;
import org.scribe.oauth.OAuthService;

/**
 * Servlet implementation class googleplus
 */
@WebServlet("/googleplus")
//@WebServlet("/googleplus") 
public class googleplus extends HttpServlet {
   private static final String CLIENT_ID = "693459471481-8oojdsr922v46gbl1sjll733nv1skeut.apps.googleusercontent.com"; 
   private static final String CLIENT_SECRET = "Rpu01w0j5ZJ_4degLoMkUhH3";
   @Override 
   protected void doGet(HttpServletRequest req, HttpServletResponse res) 
      throws IOException, ServletException {
      //Configure 
      ServiceBuilder builder= new ServiceBuilder(); 
      OAuthService service = builder.provider(Google2Api.class) 
         .apiKey(CLIENT_ID) 
         .apiSecret(CLIENT_SECRET) 
         .callback("http://localhost:8080/AP_Project/doc") 
         .scope("openid profile email " + 
               "https://www.googleapis.com/auth/plus.login " + 
               "https://www.googleapis.com/auth/plus.me")  
         .debug() 
         .build(); //Now build the call
      HttpSession sess = req.getSession(); 
      sess.setAttribute("oauth2Service", service);
      res.sendRedirect(service.getAuthorizationUrl(null)); 
   } 
} 
