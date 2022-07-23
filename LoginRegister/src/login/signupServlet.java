package login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




/**
 * Servlet implementation class signupServlet
 */
@WebServlet("/signupServlet")
public class signupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String email = request.getParameter("email");
		String pass = request.getParameter("password");
		String cpass = request.getParameter("cpassword");
		PreparedStatement stmt;
		ResultSet rs;
		Connection con;
		RequestDispatcher rd;
	
	
			try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("driver loaded");
				con = DriverManager.getConnection("jdbc:mysql://localhost/login","root","root");
				System.out.println("connection establish");
				String sql = "insert into user(username,password) values(?,?)";
				System.out.println("query executed");
				stmt = con.prepareStatement(sql);
				stmt.setString(1, email);
				stmt.setString(2, pass);
				int row = stmt.executeUpdate();
				if(row>0)
				{
					request.setAttribute("status", "successfully singed up");
					rd = request.getRequestDispatcher("Login.jsp");
					rd.forward(request, response);
				}
				else
				{
					request.setAttribute("status", "faild");
					rd = request.getRequestDispatcher("index.jsp");
					rd.forward(request, response);
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		
	}

}
