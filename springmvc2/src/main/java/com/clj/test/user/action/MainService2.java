package com.clj.test.user.action;

import java.io.File;
import java.net.URL;

import org.eclipse.jetty.server.Connector;  
import org.eclipse.jetty.server.Handler;  
import org.eclipse.jetty.server.Server;  
import org.eclipse.jetty.server.handler.ContextHandler;  
import org.eclipse.jetty.server.handler.ContextHandlerCollection;  
import org.eclipse.jetty.server.handler.DefaultHandler;  
import org.eclipse.jetty.server.handler.HandlerCollection;  
import org.eclipse.jetty.server.nio.SelectChannelConnector;  
import org.eclipse.jetty.util.thread.QueuedThreadPool;  
import org.eclipse.jetty.webapp.WebAppContext;  
  
public class MainService2 {  
  
    public static void main(String[] args) {  
        /*String filePath =  System.getProperty("user.dir")  
                + "/src/main/resources";  */
        System.out.println(System.getProperty("user.dir"));  
        URL url = MainService2.class.getClassLoader().getResource("index.jsp");
        System.out.println(url);
        String filePath = url.getPath().substring(0,url.getPath().lastIndexOf("index.jsp"));
        System.out.println(filePath);
        try {  
            Server server = new Server(8080);  
  
            WebAppContext context = new WebAppContext();  
            context.setContextPath("/");  
            System.out.println(context.getContextPath()); 
            context.setDescriptor("web.xml"); // 指定web.xml配置文件  
            System.out.println(filePath + "/conf/web.xml"); 
            context.setResourceBase("/");// 指定webapp目录  
            System.out.println(filePath + "/conf/"); 
            context.setParentLoaderPriority(true);  
            System.out.println("true"); 
            server.setHandler(context);  
            System.out.println("start"); 
            server.start();  
            server.join();  
            System.out.println("-----");  
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
  
}  