package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import entity.Dept;

public class DeptDao {

	public List<Dept> findAll(){
		List<Dept> list=new ArrayList<Dept>();
		SqlSession session=DbUtil.getSession();
		list=session.selectList("web.findAll");
		session.close();
		return list;
		
	}
	
	public void deleteById(int deptno){
		SqlSession session=DbUtil.getSession();
		session.delete("web.delById", deptno);
		session.commit();
		session.close();
	}
	
	
	public Dept findById(int deptno){
		SqlSession session=DbUtil.getSession();
		Dept dept=session.selectOne("web.findById",deptno);
		session.close();
		return dept;
	}
	
	public void Insert(Dept dept){
		SqlSession session=DbUtil.getSession();
		session.insert("web.insertDept", dept);
		session.commit();
		session.close();
		
	}
	
	public void Update(Dept dept){
		SqlSession session=DbUtil.getSession();
		session.update("web.updateDept", dept);
		session.commit();
		session.close();
	}
	
	public List<Map<String,Object>> selectMap(int deptno){
		SqlSession session=DbUtil.getSession();
		List<Map<String,Object>> map=session.selectList("web.selectMap",deptno);
		session.close();
		return map;
		
	}
}
