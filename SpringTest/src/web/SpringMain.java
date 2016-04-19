package web;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
	@Test
    public void test(){
    	ApplicationContext ap=new 
    			ClassPathXmlApplicationContext("applicationContext.xml");
    	UserBean user=ap.getBean("user",UserBean.class);
    	System.out.println(user);
    }
}
