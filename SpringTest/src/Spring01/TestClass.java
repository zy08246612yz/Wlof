package Spring01;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestClass {
    @Test
	public void test(){
		AbstractApplicationContext abst=new 
		ClassPathXmlApplicationContext("applicationContext.xml");
		StudentBean student=abst.getBean("student",StudentBean.class);
		student.Send();
		abst.close();
	}
}
