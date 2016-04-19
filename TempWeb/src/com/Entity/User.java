package com.Entity;
import java.io.Serializable;

public class User implements Serializable{
	private Integer id;
    private String username;
    private String password;
    private String email;
    private double account;
    
    public User(){
 	   
    }
    
    public User( String username, String password, String email, double account) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.account = account;
	}
    
	public User(Integer id, String username, String password, String email, double account) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.account = account;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
