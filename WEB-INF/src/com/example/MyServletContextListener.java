package com.example

import javax.servlet.*;

public class MyServletContextListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		ServletContext sc = event.getServletContext();
		sc.setAttribute("dog", (new Dog(sc.getInitParameter("breed"))));
	}

	public void contextDestroyed(ServletContextEvent event) {

	}
}