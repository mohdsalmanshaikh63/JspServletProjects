package com.luv2code.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestParamServlet
 */
@WebServlet("/TestParamServlet")
public class TestParamServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestParamServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Step 1: set the content type
		response.setContentType("text/html");
		
		// Step 2: get printWriter
		PrintWriter out = response.getWriter();
		
		// Step 3: read configuration parameters
		ServletContext servletContext = getServletContext(); // inherited from HttpServlet
		String maxCartSize = servletContext.getInitParameter("max-shopping-cart-size");
		String projectTeamName = servletContext.getInitParameter("project-team-name");
		
		// Step 4: generate HTML content
		out.println("<html><body>");
		
		out.println("Max Cart:"+maxCartSize);
		out.println("<br>");
		out.println("Team Name:"+projectTeamName);
		
		out.println("<html><body>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
