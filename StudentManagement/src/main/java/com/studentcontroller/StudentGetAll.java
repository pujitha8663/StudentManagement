package com.studentcontroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Student;

import Dao.StudentImpl;

/**
 * Servlet implementation class StudentGetAll
 */
public class StudentGetAll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		StudentImpl stu= new StudentImpl();
		
		response.setContentType("text/html");
		List<Student> st=stu.getAllStudents();
		
		
		
		PrintWriter pw= response.getWriter();
		
		pw.print("<html>");
		pw.print("<table border=10px>");
		pw.print("<tr><th>id</th><th>name</th><th>fee</th><th>course</th></tr>");
		 for (Student student : st) {
			pw.print("<td>"+student.getId()+"</td>");
			pw.print("<td>"+student.getName()+"</td>");
			pw.print("<td>"+student.getFee()+"</td>");
			pw.print("<td>"+student.getCourse()+"</td>");
		}
		 
		 pw.print("</table>");
		 pw.print("<a href='index.jsp'>home</a>");
		 pw.print("</html>");
	}

}
