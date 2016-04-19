package dao;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import junit.framework.TestCase;

public class DbUtil {

	private static SqlSessionFactory sf;
	
	static{
		SqlSessionFactoryBuilder bulid=new SqlSessionFactoryBuilder();
		sf=bulid.build(TestCase.class.
				getClassLoader().getResourceAsStream("SqlConfig.xml"));
	}
	
	public static SqlSession getSession(){
	       return sf.openSession();
	}
	
	public static void main(String[] args) {
		
		System.out.println(DbUtil.getSession());
		
	}
}


