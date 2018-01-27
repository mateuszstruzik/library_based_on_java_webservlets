package com.library.servl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBException;

import com.library.model.*;;

/**
 * Servlet implementation class BookListServlet
 */
@WebServlet("/BookListServlet")
public class BookListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        AccountXml accountxml=new AccountXml();
        BookXML bookxml=new BookXML();
        ArrayList<Account> array=new ArrayList<Account>();
        ArrayList<Book> book_array=new ArrayList<Book>();
        
        try {
			array=accountxml.ReadAccountFromxml();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        try {
			book_array=bookxml.ReadBookfromXML();
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
              
        
        String u = "user";
        String p = "pass";
        
       String ggu=request.getParameter("username");
       String ggp=request.getParameter("password");
       String gp;
       String gu;
       
       if(ggu!=null && ggp!=null) {
    	   gp=ggp;
    	   gu=ggu;
    	   
//    	   this.getServletConfig().getServletContext().setAttribute("guuu",gu);
//           this.getServletConfig().getServletContext().setAttribute("gpuu",gp);
    	   
    	   request.getSession().setAttribute("guuu", gu);
    	   request.getSession().setAttribute("gpuu", gp);
       }else {
    	   String cgu=""+request.getSession().getAttribute("usernamee");
    	   String cgp=""+request.getSession().getAttribute("passwordd");
    	   
    	   gp=cgp;
    	   gu=cgu;
//    	   request.getSession().setAttribute("guuu", gu);
//    	   request.getSession().setAttribute("gpuu", gp);
       }
       
        
        
      
       
        boolean check=false;
        for(Account a:array) {
        	String ab=a.getUsernameget();
        	String bb=a.getPasswordget();
        	
        	if(gu.equalsIgnoreCase(ab)||gp.equalsIgnoreCase(bb)) {
        		check=true;
        		break;
        	}else {
        		check=false;
        	}
        }
        
        if(check) {
        	String messages="Book List";
        	
//        	String a=book_array.get(i).getTitleget();
//        	String b= book_array.get(i).getAuthorget();
        	//Integer c=book_array.get(i).getPriceget();
        	request.setAttribute("messages", messages);
//        	request.setAttribute("title",a );
//        	request.setAttribute("author",b);
        	request.setAttribute("status", book_array);
        	request.getRequestDispatcher("/BookList.jsp").forward(request, response);
        	
        }else {
        	request.getRequestDispatcher("/proba.jsp").forward(request, response);
      }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
