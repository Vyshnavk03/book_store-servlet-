package com.js.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import com.js.dto.Books;


public class BooksCRUD {

	private final static String PATH = "com.mysql.cj.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3306/jdbc_book";
	private final static String USER = "root";
	private final static String PWD = "Vyshnav16#";

	public int insertProduct(Books b) {

		String query = "insert into book values (?,?,?,?,?)";
		Connection con = null;

		try {
			Class.forName(PATH);
			con = DriverManager.getConnection(URL, USER, PWD);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, b.getBookId());
			ps.setString(2, b.getBookName());
			ps.setString(3, b.getAuthorName());
			ps.setDouble(4, b.getPrice());
			ps.setInt(5, b.getNoofpages());
			return ps.executeUpdate();
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;

	}

	public int deleteBookById(int Id) {
		Connection con = null;// local variable for method
		String query = "delete from book where bookId = ?";

		try {
			Class.forName(PATH);
			con = DriverManager.getConnection(URL, USER, PWD);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, Id);
			return ps.executeUpdate();// if you forget this step data get delete and we get wrong output
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

	public int updatebookById(int id, Books b) {
		Connection con = null;
		String query = "update book set BookName=?,AuthorName =?,Price=?,Noofpages=? where bookId=?";
		try {
			Class.forName(PATH);
			con = DriverManager.getConnection(URL, USER, PWD);
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, b.getBookName());
			ps.setString(2, b.getAuthorName());
			ps.setDouble(3, b.getPrice());
			ps.setInt(4, b.getNoofpages());
			ps.setInt(5, id);
			return ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return 0;
	}

}
