package com.demo.Le_Code_ServletEx;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class App 
{
    public static void main( String[] args ) throws LifecycleException
    {
        System.out.println( "Hello World!" );
        
        Tomcat tomcat=new Tomcat();
        tomcat.setPort(8080);// to set the port number of the server
        
        
        Context context=tomcat.addContext("", null);
        Tomcat.addServlet(context,"HelloServlet",new HelloServlet());// static method  new HelloServlet() object for the servet
        context.addServletMappingDecoded("/hello", "HelloServlet"); // (url, servlet name)
        
        tomcat.start(); // to start the tomcat server
        tomcat.getServer().await();// to start the server and keeps it running
    }
}
