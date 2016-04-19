package TestZy;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import dao.DbUtil;
import dao.DeptDao;
import dao.DeptDaoInter;
import entity.Dept;

public class TestClass {

	public static void main(String args[]){
		 DeptDao dept=new DeptDao();
//		 List<Dept> list=dept.findAll();
//		 for(Dept d:list){
//			 System.out.println(d);
//		 }
		 
		 
//		 dept.deleteById(10);
//		 System.out.println("ɾ���ɹ���");
		 
		 /**
		  * ��ѯ��������ѯ�Ľ��
		  */
//		 Dept d=dept.findById(30);
//		 System.out.println(d);
//		 Dept d=new Dept();
//		 
//		 d.setDeptno(30);
//		 d.setDname("jingjing");
//		 d.setLoc("nnnn");
		 
//		 dept.Insert(d);
//		 dept.Update(d);
//		 System.out.println("��ӳɹ�!");
		 
		 /**
		  * ����Map
		  */
		 
//		 List<Map<String,Object>> map=dept.selectMap(10);
//		 
//		 for(Map m:map){
//			 System.out.println(m.get("DEPTNO")+":"+m.get("DNAME"));
//		 }
		 /**
		  * ʹ��Mapper�Ľӿ�ģʽ���е���
		  * ����ֱ��дdao���е���
		  * 
		  * ���ؽ��3��ģʽ
		  * 1.ֱ�ӷ���resultType="entity.Dept"
		  * 2.����map  resultType="java.util.HashMap"
		  * 3.ResuleMap
		  * <resultMap type="entity.Dept" id="deptMap">
            <result property="deptno" column="deptno"/>
   			<result property="dname" column="dname"/>
   			<result property="loc" column="loc"/>
   			</resultMap>
		  */
		 
		 SqlSession session=DbUtil.getSession();
		 
		 DeptDaoInter mapper=session.getMapper(DeptDaoInter.class);
		 List<Dept> list=mapper.findAll();
		 
		 for(Dept d:list){
			 System.out.println(d);
		 }
		 
	}
}
