package DIClass;

public class A<T> {
   private T b;
   public A(){
	   System.out.println("调用实例化");
   }

public T getB() {
	return b;
}

public void setB(T b) {
	this.b = b;
}
  
public void Execute(){
	System.out.println("调用T");
	
}
}
