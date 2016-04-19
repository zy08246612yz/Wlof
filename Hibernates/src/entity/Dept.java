package entity;

import java.io.Serializable;

public class Dept implements Serializable {

	/**
	 * 在进行反序列化时进行判断版本的一致性，看是否可以进行反序列化，而不出现异常
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Integer deptno;
	private String dname;
	private String loc;
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	/**
	 * 输出toString的语句
	 */
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", loc=" + loc + "]";
	}
	
	
	
	
}
