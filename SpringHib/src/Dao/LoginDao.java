package Dao;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import Entity.Dept;

@Repository("loginDao")
public class LoginDao implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Resource     
	 private SqlSessionTemplate template; 
	 
	 public List<Dept> findAll(){
		 return template.selectList("Dao.Login.findAll");
	 }
}
