package Spring01;

public class StudentBean {

	public StudentBean(){
		System.out.println("实例化操作");
	}
	
	public void init(){
		System.out.println("初始化操作");
		
	}
	
	public void Send(){
		System.out.println("发送操作");
	}
	
	public void Destory(){
		System.out.println("销毁方法");
	}
	
}
