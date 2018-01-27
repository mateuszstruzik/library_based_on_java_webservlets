package com.library.servl;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;

import com.library.model.Account;
import com.library.model.Book;
import com.library.model.BookList;
import com.library.model.BookXML;

/**
 * Servlet implementation class UpdateXML
 */
@WebServlet("/UpdateXML")
public class UpdateXML extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateXML() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		BookXML bookxml=new BookXML();
		
     
   	  	String ID=request.getParameter("id");
        
   	  	try {
			bookxml.UpdateBookStatus(ID);
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	  	
        
		String name=String.valueOf(request.getSession().getAttribute("guuu"));
        String pass=String.valueOf(request.getSession().getAttribute("gpuu"));
        
//        this.getServletConfig().getServletContext().setAttribute("username",name);
//        this.getServletConfig().getServletContext().setAttribute("password",pass);
        
 	   request.getSession().setAttribute("usernamee", name);
 	   request.getSession().setAttribute("passwordd", pass);
 	   

 	  request.getRequestDispatcher("/AfterRentBookConfirmation.jsp").forward(request, response);
 	   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
