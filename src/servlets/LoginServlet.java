/**
 * @filename: LoginServlet.java 
 * @author: dhiraj patil
 * @date: Oct 26, 2014
 * 
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import java.util.Enumeration;

import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class Login_Servlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
    	super();
        // TODO Auto-generated constructor stub
    	System.out.println("**********");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("This is the Test Servlet");
		
		Enumeration headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String headerName = (String) headerNames.nextElement();
			out.print("<br/>Header Name: <em>" + headerName);
			String headerValue = request.getHeader(headerName);
			out.print("</em>, Header Value: <em>" + headerValue);
			out.println("</em>");
		}
		//response.sendRedirect("login-confirmed.jsp"); 
//
//    	String userId = request.getParameter("j_username");
//        String password = request.getParameter("j_password");
//        
//        //String hashed = BCrypt.hashpw(password, BCrypt.gensalt(12));
//        //System.out.println(hashed);
//        
////        String searchQuery = "select * from User_Records where username='" + userId
////                + "' AND password='"+hashed+"'";
//        String searchQuery = "select * from User_Records where username='" + userId +"'";
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } 
//        catch (ClassNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login_db", "root", "");
//            Statement stmt = con.createStatement();
//            ResultSet rs = stmt.executeQuery(searchQuery);
//            boolean isEmpty = rs.next();
//            //System.out.println(rs.getString("password"));
//            if (!isEmpty || !BCrypt.checkpw(password, rs.getString("password"))) {
//                // redirect to error page
//                response.sendRedirect("login-failed.jsp");
//            } 
//            else if (isEmpty) {
//            	// fetch the session from request, create new session if session
//                // is not present in the request
//                HttpSession session = request.getSession(true); 
//                session.setAttribute("FirstName", rs.getString("first_name"));
//                session.setAttribute("LastName", rs.getString("last_name"));
//                // redirect to success page
//                response.sendRedirect("login-confirmed.jsp"); 
//            }
//        } 
//        catch (SQLException e) {
//            System.out.println("SQLException occured: " + e.getMessage());
//            e.printStackTrace();
//        }
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getSession().invalidate();
        response.sendRedirect(request.getContextPath() + "/login-confirmed.jsp");
	}

}
