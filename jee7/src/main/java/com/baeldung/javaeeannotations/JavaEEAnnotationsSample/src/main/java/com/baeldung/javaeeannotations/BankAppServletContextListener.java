package com.nklkarthi.javaeeannotations.JavaEEAnnotationsSample.src.main.java.com.nklkarthi.javaeeannotations;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class BankAppServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) { 
        sce.getServletContext().setAttribute("ATTR_DEFAULT_LANGUAGE", "english"); 
    } 
    
    public void contextDestroyed(ServletContextEvent sce) { 
        System.out.println("CONTEXT DESTROYED"); 
    } 
}
