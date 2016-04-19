package InteClass;

public class A {

	public A() {
		System.out.println("调用A的构造函数！");
	}
	
	public Cnm getCnm() {
		return cnm;
	}

	public void setCnm(Cnm cnm) {
		this.cnm = cnm;
	}

	private Cnm cnm;
	
	
	
	public void Execute(){
		cnm.f1();
	}

}
