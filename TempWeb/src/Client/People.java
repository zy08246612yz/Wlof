package Client;

public class People {
private int id;
private String name;
private String sex;
private int age;
private String other;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getOther() {
	return other;
}
public void setOther(String other) {
	this.other = other;
}
@Override
public String toString() {
	return "id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", other=" + other ;
}

}
