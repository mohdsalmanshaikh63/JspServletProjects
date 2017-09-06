/**
 * 
 */
package com.bridgelabz.dao;

import java.sql.SQLException;

import com.bridgelabz.entity.LibraryUser;

/**
 * @author Salman Shaikh This is our DAO interface for Library Users
 *
 */
public interface LibraryUserDAO {

	/**
	 * @param email
	 * @param password
	 * @return true or false
	 * @throws SQLException
	 *             This method tells us whether the user with given email and
	 *             password is a valid user or not.
	 */
	public boolean authenticate(String email, String password) throws SQLException;

	/**
	 * @param fullName
	 * @param email
	 * @param mobile
	 * @param password
	 * @param confirmPassword
	 * @param gender
	 * @return This method tries to register a new user with the given parameters
	 * @throws SQLException
	 */
	public String register(String fullName, String email, String mobile, String password, String confirmPassword,
			String gender) throws SQLException;

	/**
	 * @return true or false. This method checks whether the given username already
	 *         exists or not
	 */
	public boolean checkUserExists(String email) throws SQLException;

	/**
	 * @param fullName
	 * @param email
	 * @param mobile
	 * @param password
	 * @param confirmPassword
	 * @param gender
	 *            Adds new user to the database
	 * @throws SQLException
	 */
	public void addUser(String fullName, String email, String mobile, String password, String gender)
			throws SQLException;

	public LibraryUser getUserByEmail(String email) throws SQLException;

}
