package InteClass;

import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestClass {
   
	@Test
	public void test(){
		AbstractApplicationContext abst=new 
				ClassPathXmlApplicationContext("applicationContext.xml");
				A a=abst.getBean("a",A.class);
				a.Execute();
	}
}
