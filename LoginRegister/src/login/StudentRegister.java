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
 * Servlet implementation class StudentRegister
 */
@WebServlet("/StudentRegister")
public class StudentRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentRegister() {
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
	
		
		
		
	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	int phone = Integer.parseInt(request.getParameter("number"));
	String address = request.getParameter("address");
	
	PreparedStatement stmt;
	ResultSet rs;
	Connection con;
	RequestDispatcher rd;
	
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost/login","root","root");
		System.out.println("connection");
		String sql = "insert into studentregister(id,name,phone,address) values(?,?,?,?)";
		System.out.println("query");
		stmt = con.prepareStatement(sql);
		stmt.setInt(1, id);
		stmt.setString(2, name);
		stmt.setInt(3, phone);
		stmt.setString(4, address);
		int row = stmt.executeUpdate();
		if(row>0)
		{
			request.setAttribute("status", "successfully added");
			rd = request.getRequestDispatcher("StudentRegister.jsp");
			rd.forward(request, response);
		}
		else
		{
			request.setAttribute("status", "faild");
			rd = request.getRequestDispatcher("StudentRegister.jsp");
			rd.forward(request, response);
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	
	}

}
