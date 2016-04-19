package dao;

import java.util.List;

import annotation.MyBatis;
import entity.Dept;

@MyBatis
public interface DeptMapper {

	public List<Dept> findAll();
}
