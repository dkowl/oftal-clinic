package oftalClinic;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;
 
public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        
        out.println("Hello World");
        
        Connection c = null;
        try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager
		            .getConnection("jdbc:postgresql://localhost:5432/testdb",
		            "postgres", "123");
		} catch (Exception e) {
			e.printStackTrace();
		}
        
        
        String password = request.getParameter("password");
        if(password != null){
        	out.println(password);
        	String hashed = BCrypt.hashpw(password, BCrypt.gensalt());
            out.println(hashed);
        }
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
    	PrintWriter out = response.getWriter();
    	
    	out.println("o ty chuju");
    }
}