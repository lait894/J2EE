package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class BeerSelect extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException {

		// response.setContentType("text/html");
		// PrintWriter out = response.getWriter();
		// out.println("Beer Selection Advice<br>");
		// Iterator it = (new BeerExpert()).getBrands(request.getParameter("color")).iterator();
		// while(it.hasNext()) {
		// 	out.print("<br>try: " + it.next());
		// }
			
		request.setAttribute("styles", (new BeerExpert()).getBrands(request.getParameter("color")));
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
	}
	
}  