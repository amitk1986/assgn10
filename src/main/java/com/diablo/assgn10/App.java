package com.diablo.assgn10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
        HelloworldApp he = (HelloworldApp)ac.getBean("hello");
        he.getMessage();
        ApplicationContextProvider appContext = new ApplicationContextProvider();
        HelloworldApp tb = appContext.getApplicationContext().getBean("hello", HelloworldApp.class);
        tb.getMessage();
    }
}
