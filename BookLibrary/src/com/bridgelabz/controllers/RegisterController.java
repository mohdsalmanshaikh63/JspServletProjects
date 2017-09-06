package com.bridgelabz.controllers;

import java.io.IOException;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import com.bridgelabz.dao.LibraryUserDaoImpl;
import com.bridgelabz.entity.LibraryUser;
import com.bridgelabz.utilities.MyUtilitiy;

/**
 * This controller handles user registration
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Our DAO reference
	LibraryUserDaoImpl libraryUserDbUtil;

	// database resource using annotation
	@Resource(name = "jdbc/book_library")
	DataSource dataSource;

	/*
	 * We initialize the necessary objects i.e. UserDbUtil when the servlet is
	 * initialized by the container
	 */
	@Override
	public void init() throws ServletException {

		// create our student db_util ... and pass in the connection pool/datasource
		libraryUserDbUtil = new LibraryUserDaoImpl(dataSource);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// get all the fields from the registration page
		String fullName = request.getParameter("fullname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String password = request.getParameter("password");
		String confirmPassword = request.getParameter("confirmPassword");
		String gender = request.getParameter("gender");

		System.out.println("LibraryUser [fullName=" + fullName + ", email=" + email + ", mobile=" + mobile + ", gender="
				+ gender + ", password=" + password + ", confirmPassword=" + confirmPassword + "]");

		// pass them to the register method to handle registration
		String error = "";
		try {
			error = libraryUserDbUtil.register(fullName, email, mobile, password, confirmPassword, gender);
		} catch (SQLException e) {

			// add
			e.printStackTrace();
		}

		// if no errors are found then forward to homepage
		if (MyUtilitiy.isNullOrBlank(error)) {

			System.out.println("No errors were found. Yay!");

			// add the user to the database
			try {
				libraryUserDbUtil.addUser(fullName, email, mobile, password, gender);

				// get user by email id and set the user for session
				LibraryUser user = libraryUserDbUtil.getUserByEmail(email);
				HttpSession httpSession = request.getSession(true);
				httpSession.setAttribute("user", user);

				response.sendRedirect(request.getContextPath() + "/homepage.jsp?user=NEW");

			} catch (SQLException e) {
				e.printStackTrace();
			}

		} else {

			// redirect to register page
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("error", error);
			response.sendRedirect(request.getContextPath() + "/register.jsp?msg=ERROR");

		}

	}

}