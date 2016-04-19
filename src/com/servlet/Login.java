package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String url;
	private String user;
	private String pass;

	public void init() throws ServletException {
		ServletContext context=getServletContext();
		
		//ServletConfig config=getServletConfig();
		
	    this.url=context.getInitParameter("manage");
	    this.user=context.getInitParameter("user");
	    this.pass=context.getInitParameter("pass");
		System.out.println(url+":"+user+":"+pass);
		String driver=context.getInitParameter("driver");
		try {
			Class.forName(driver);
		} catch (Exception e) {
			throw new ServletException("加载数据库失败!");
		}
	}

	

    public Login() {
        super();
       
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String username=request.getParameter("username");
		//System.out.println(username);
		
		response.setContentType("text/html;charset='utf-8'");
		response.setCharacterEncoding("utf-8");
		init();
		Connection conn=null;
		String u1=null,u2=null;
		try {
		    conn=DriverManager.getConnection(url,user,pass);
			String sql;
			sql="select * from table_stuuser where STU_ID=?";
			PreparedStatement statement=conn.prepareStatement(sql);
			statement.setString(1, username);
			ResultSet set=statement.executeQuery();
			set.next();
			u1=set.getString("stu_name");
			u2=set.getString("stu_pass");
			set.close();
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(u2.equals("1111")){
			response.sendRedirect("2.html");
			
		}
//		PrintWriter writer=response.getWriter();
//		writer.println("<html><head><title>");
//		writer.println("Hello");
//		writer.println("</title></head><body>");
//		writer.println("<p>");
//		writer.println("用户名:"+u1+"   "+"密码:"+u2);
//		writer.println("</p></body></html>");
//		writer.close();
		
		
//		PrintWriter writer=response.getWriter();
//		writer.write("<div><b>");
//		writer.write(path);
//		writer.write("</b></div>");
		
		/**
		request.getProtocol();//协议类型
		request.getMethod();//请求方式
		request.getServletPath();//servlet路径
		*/
		
		//消息头(存放多组键值对)
		
//		Enumeration e=request.getHeaderNames();
//		while(e.hasMoreElements()){
//			Object key=e.nextElement();
//			String value=request.getHeader(key.toString());
//		}
//		writer.println("<html><head><title>");
//		writer.println("Hello");
//		writer.println("</title></head><body>");
//		writer.println("<p>1213321</p>");
//		writer.println(request.getContentLength()+":"+request.getContextPath());
//		writer.println(request.getLocalName());
//		writer.println("</body></html>");
//		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
