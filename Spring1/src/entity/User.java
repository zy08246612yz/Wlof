package entity;

import org.springframework.stereotype.Component;

@Component("user")
public class User {

	public User(){
		
	}
	private Integer id;
	private String name;
	private String pass;
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
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


	public User(Integer id, String name, String pass) {
		super();
		this.id = id;
		this.name = name;
		this.pass = pass;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", pass=" + pass + "]";
	}
	
}
