package Test;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;
import entity.User;

public class test {
	
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		@SuppressWarnings("resource")
		ApplicationContext ap=new 
				ClassPathXmlApplicationContext("applicationContext.xml");
		
		//User user=ap.getBean("user",User.class);
		
		//user.setId(1);
		//user.setName("aaa");
		//user.setPass("111");
		//System.out.println(user.toString());
		
		//Student student=ap.getBean("student",Student.class);
		//System.out.println(student.getUser());
		
		/**
		 * 通过Spring获得日期
		 */
		//Calendar cal=ap.getBean("user",Calendar.class);
//     	User us=ap.getBean("user",User.class);
//     	User us1=ap.getBean("user",User.class);
//     	//用来获取
//     	String len=User.class.toString();
//     	
//     	Class cls=Class.forName(len.substring(6,len.length()));
//     	Object obj=cls.newInstance();
//     	User u=(User)obj;
//     	System.out.println(u.toString());
//     	
//     	System.out.println(User.class);
//     	System.out.println(us1==us);
     	
     	KJzy kj=new KJzy();
     	Object obj=kj.newInstance("user", User.class);
     	User user=(User)obj;
     	user.setId(1);
     	user.setName("zhangyi");
     	Object obj1=kj.newInstance("user", User.class);
     	User user1=(User)obj1;
     	System.out.println(user1.toString());
     	
//		
//		User uss=ap.getBean("student",User.class);
		//Student student=ap.getBean("students",Student.class);
//		student.SayUser();
		//System.out.println(student.getPage());
		//System.out.println(us.toString());
		//System.out.println(uss.toString());
		
		
		
	}

}
