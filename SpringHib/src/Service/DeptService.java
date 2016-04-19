package Service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import Dao.Login;
import Dao.LoginDao;
import Entity.Dept;

@Service("deptService")
public class DeptService {
	@Resource(name="loginDao")
	private LoginDao login;
	
	public boolean check(String name,String pass){
		
		boolean pan=false;
		
		List<Dept> dept=login.findAll();
		
		for(Dept d:dept){
			if(d.getDname().equals(name)&&d.getLoc().equals(pass)){
				pan=true;
				break;
			}
		}

		return pan;
	}

}
