package InteClass;

public class A {

	public A() {
		System.out.println("����A�Ĺ��캯����");
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
