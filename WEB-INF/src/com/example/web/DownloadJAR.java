package com.example.web;

import com.example.model.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class DownloadJAR extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws IOException, ServletException {

		response.setContentType("application/jar");

		ServletContext ctx = getServletContext();
		InputStream is = ctx.getResourceAsStream("/sample.jar");

		int readed = 0;
		byte[] bytes = new byte[1024];

		OutputStream os = response.getOutputStream();
		while((readed = is.read(bytes)) != -1) {
			os.write(bytes, 0, readed);
		}
		os.flush();
		os.close();
	}
	
}