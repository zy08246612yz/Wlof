package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestClass {
public static void main(String[] args) {
	/**
	 * List<String> list=new ArrayList<String>();
	list.add("322342423");
	list.add("ads4324242");
	list.add("vasdf");
	list.add("1");
	list.add("fd");
	
	Comparator<String> com=new Comparator<String>(){

		public int compare(String str1, String str2) {
			return str1.length()-str2.length();
		}
		
	};
	Collections.sort(list,com);
	System.out.println(list);{3=sb, g=hfd, 2=m, 1=n, 7=adsa, 5=dasd, 4=s}
	 */
	
	
	Map<String,String> set=new HashMap<String,String>();
	set.put("1", "a");
	set.put("1", "n");//½øĞĞ¸²¸Ç
	set.put("2", "m");
	set.put("3", "sb");
	set.put("4", "s");
	set.put("5", "dasd");
	set.put("7", "adsa");
	set.put("g", "hfd");
	
	System.out.println(set);
	
	
	
	
	Set<Entry<String,String>> entry=set.entrySet();
	
	
	for(Entry e :entry){
		System.out.println(e.getKey()+":"+e.getValue());
	}
	
	
}
}
