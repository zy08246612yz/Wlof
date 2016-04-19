package TestClass;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.DeptMapper;
import dao.DeptMappers;
import entity.Dept;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ap=new  
				ClassPathXmlApplicationContext("Spring.xml");
		DeptMapper mapper=ap.getBean("deptMapper",DeptMapper.class);
		
		DeptMappers map=ap.getBean("deptMappers",DeptMappers.class);
		
		/**
		* org.springframework.beans.factory.NoSuchBeanDefinitionException: 
		* No bean named 'deptMappers' is defined
		*/
		List<Dept> list=mapper.findAll();
		for(Dept t:list){
			System.out.println(t);
		}
		for(Dept t:map.findAll()){
			System.out.println(t);
		}
		
		
	}
}
