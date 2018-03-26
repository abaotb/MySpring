package com.clj.test.user.action;

import java.io.File;  

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
  
public class MainService {  
  
    public static void main(String[] args) {  
        String filePath = System.getProperty("user.dir")  
                + "/src/main/resources";  
        System.out.println(System.getProperty("user.dir"));  
  
        try {  
            Server server = new Server(8080);  
  
            WebAppContext context = new WebAppContext();  
            context.setContextPath("/");  
            context.setDescriptor(filePath + "/conf/web.xml"); // 指定web.xml配置文件  
            context.setResourceBase(filePath + "/conf/");// 指定webapp目录  
            context.setParentLoaderPriority(true);  
  
            server.setHandler(context);  
            server.start();  
            server.join();  
  
        } catch (Exception e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }  
    }  
  
}  