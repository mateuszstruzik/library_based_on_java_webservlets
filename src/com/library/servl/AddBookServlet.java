package com.library.servl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.library.model.Book;
import com.library.model.BookList;

/**
 * Servlet implementation class AddBookServlet
 */
@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
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
		ServletContext servletContext = request.getServletContext(); 
		
		String title = (String) servletContext.getAttribute("title");
		String author = (String) servletContext.getAttribute("author");
		String genre = (String) servletContext.getAttribute("genre");
		Integer status = (Integer) servletContext.getAttribute("genre");
		String description = (String) servletContext.getAttribute("description");
		
	
		
		/*
		 Moze servletContext byc nullem , wtedy warto w moze zrobic cos takiego dla kazdego atrybutu:
		 	
		 	if(servletContext.getAttribute("title") == null){
			List <String> titles = new ArrayList<>();
			titles.add(request.getParameter("title));
			servletContext.setAttribute("title", titles );
		}
		else{
			List <String> titles=  (List<String>) servletContext.getAttribute("title");
			titles.add(request.getParameter("title"));
			
		}
		 */
				
		Book book = new Book();
		book.setTitle(title);
		book.setAuthor(author);
		book.setDescription(description);
		book.setGenre(genre);
		book.setStatus(status);
		
		BookList booklist = new BookList();
		booklist.catalog.add(book);
		
	}

}
