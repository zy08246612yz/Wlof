package web;

import java.io.Serializable;

public class UserBean implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public UserBean(){
	System.out.println("������������");
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
private int id;

}
