package entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String name;
	private String pass;
	
	private User user;
	
	private List<String> list;
	private Set<String> set;
	
	private Map<String,String> map;
	private Properties properties;
	
	//@Autowired
//	public Student(@Qualifier("user")User user){
//		this.user=user;
//	}
//	
	//获得一个值得注解
	@Value("#{const.PAGE_SIZE}")
	private int page;
	
	public Properties getProperties() {
		return properties;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public User getUser() {
		return user;
	}
	
	@Resource(name="user")
	public void setUser(User user) {
		this.user = user;
	}
	
	
	public void SayUser(){
		System.out.println(user.toString());
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Set<String> getSet() {
		return set;
	}
	public void setSet(Set<String> set) {
		this.set = set;
	}
	public Map<String,String> getMap() {
		return map;
	}
	public void setMap(Map<String,String> map) {
		this.map = map;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
}
