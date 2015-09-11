package com.gcit.lms.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gcit.lms.dao.AuthorDAO;
import com.gcit.lms.domain.Author;

/**
 * Servlet implementation class AdminServlet
 */
@WebServlet({"/addAuthor", "/editAuthor"})
public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AdminServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reqUrl = request.getRequestURI().substring(request.getContextPath().length(),
				request.getRequestURI().length());
		
		String forwardPath = "admin.html";
		switch (reqUrl) {
		case "/editAuthor":
			//TODO Call Edit on JDBC
			break;
		case "/deleteAuthor":
			//TODO Call Delete on jDBC
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String reqUrl = request.getRequestURI().substring(request.getContextPath().length(),
				request.getRequestURI().length());
		
		String forwardPath = "admin.html";
		switch (reqUrl) {
		case "/addAuthor":
			try {
				addAuthor(request);
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("addAuthorMessage", "Author Added Sucessfully");
			forwardPath = "/author.jsp";
			break;
		case "/editAuthor":
			System.out.println(request.getParameter("authorId"));
			break;

		default:
			break;
		}

		RequestDispatcher rd = request.getServletContext().getRequestDispatcher(forwardPath);
		rd.forward(request, response);
	}

	private void addAuthor(HttpServletRequest request) throws ClassNotFoundException, SQLException {
		String authorName = request.getParameter("authorName");
		Author author = new Author();
		author.setAuthorName(authorName);
		
		AuthorDAO aDAO = new AuthorDAO();
		aDAO.createAuthor(author);
	}

}
