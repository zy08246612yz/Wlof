package Test;

public class KJzy {
	private static String name="";
	private static Object obj=null;

	public Object newInstance(String name,Class cls) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		if(this.name.equals(name)){
			//System.out.println("same");
			return this.obj;
		}
		String str=cls.toString();
		str=str.substring(6, str.length());
		Class clss=Class.forName(str);
		obj=clss.newInstance();
		this.name=name;
		return this.obj;
		
	}
}
