package com.library.servl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;

import com.library.model.Book;
import com.library.model.BookXML;

/**
 * Servlet implementation class BookConfirmServlet
 */
@WebServlet("/BookConfirmServlet")
public class BookConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookConfirmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        BookXML bookxml=new BookXML();
        ArrayList<Book> book_array=new ArrayList<Book>();
        
        try {
			book_array=bookxml.ReadBookfromXML();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        String id=request.getParameter("id");
        
        String name=String.valueOf(request.getSession().getAttribute("guuu"));
        String pass=String.valueOf(request.getSession().getAttribute("gpuu"));
        
//        this.getServletConfig().getServletContext().setAttribute("username",name);
//        this.getServletConfig().getServletContext().setAttribute("password",pass);
        
 	   request.getSession().setAttribute("usernamee", name);
 	   request.getSession().setAttribute("passwordd", pass);
        for(Book b : book_array) {
        if(id.equals(b.getIdget())) {
        	String IDD=b.getIdget();
        	String title=b.getTitleget();
        	String author=b.getAuthorget();
        	String genre=b.getGenreget();
            request.setAttribute("IDD", IDD);
            request.setAttribute("title", title);
            request.setAttribute("author", author);
            request.setAttribute("genre", genre);
            request.getRequestDispatcher("ConfirmBook.jsp").forward(request, response);
        }
        }
  }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
