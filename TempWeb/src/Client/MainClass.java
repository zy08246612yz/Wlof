package Client;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import OraConnect.ORUnit;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				//System.out.println(set.size());
//				if(PStringNot(str)){
//					System.out.println(i+":"+str);
//				}
		

//		if(ORUnit.Connect()){
//			List<People> p=new ArrayList<People>();
//			p=ORUnit.Query();
//			for(People ple:p){
//				System.out.println(ple);
//			}
//			People p=ORUnit.QueryPeople(1);
//			System.out.println(p);
			
//			People p=new People();
//			p.setId(4);
//			p.setAge(12);
//			p.setName("lisi");
//			p.setSex("wo");
//			p.setOther("这是一个说明信息！");
//			if(ORUnit.AddPeople(p)>0){
//				System.out.println("添加成功！");
//			}
		   ORUnit.Connect();
//			if(!ORUnit.Delete(1)){
//				System.out.println("删除成功！");
//			}
			
//			People p=new People();
//			p.setId(5);
//			p.setAge(21);
//			p.setName("zhi");
//			p.setSex("mn");
//			p.setOther("这是一个说明信息！");
			
//			People p1=new People();
//			p1.setId(3);
//			p1.setAge(20);
//			p1.setName("zhagyi");
//			p1.setSex("mn");
//			p1.setOther("这是一个说明信息！");
//			
//			People p2=new People();
//			p2.setId(4);
//			p2.setAge(26);
//			p2.setName("zngyi");
//			p2.setSex("mn");
//			p2.setOther("这是一个说明信息！");
//			
//			List<People> people=new ArrayList<People>();
//			people.add(p);
//			people.add(p1);
//			people.add(p2);
//			
			
//			if(ORUnit.AddPeopleMore(people)>0){
//				System.out.println("批量添加成功！");
//			}		
//			
//			int i;
//			if((i=ORUnit.AddQueryId(p))>0){
//				System.out.println(i);
//			}
//			
			
			
//			List<Integer> list=new ArrayList<Integer>();
//			list.add(2);
//			list.add(5);
//			if(!ORUnit.DeleteMore(list)){
//				System.out.println("批删除成功！");
//			}
			
			
			/**
			 * 获得分页数据
			 */
			List<People> p=ORUnit.PageQuery(2, 3);
			for(People p1:p){
				System.out.println(p1);
			}
			/**
			 * 获得数据有多少
			 */
			//System.out.println(ORUnit.PageNum(6));
			
		//}
		ORUnit.Close();
	}
}
