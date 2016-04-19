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
//		 System.out.println("删除成功！");
		 
		 /**
		  * 查询出单个查询的结果
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
//		 System.out.println("添加成功!");
		 
		 /**
		  * 测试Map
		  */
		 
//		 List<Map<String,Object>> map=dept.selectMap(10);
//		 
//		 for(Map m:map){
//			 System.out.println(m.get("DEPTNO")+":"+m.get("DNAME"));
//		 }
		 /**
		  * 使用Mapper的接口模式进行调用
		  * 或者直接写dao进行调用
		  * 
		  * 返回结果3中模式
		  * 1.直接返回resultType="entity.Dept"
		  * 2.返回map  resultType="java.util.HashMap"
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
