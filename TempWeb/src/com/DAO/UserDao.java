package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.Entity.User;
import com.Util.DBUtil;


public class UserDao {
     /**
      * 保存用户
      */
	public boolean save(User user){
		Connection conn=null;
		try {
			conn=DBUtil.Connect();
			String sql="insert into Table_users values(user_id.NEXTVAL,?,?,?,?)";
			PreparedStatement state=conn.prepareStatement(sql);
			state.setString(1, user.getUsername());
			state.setString(2, user.getPassword());
			state.setString(3, user.getEmail());
			state.setDouble(4, user.getAccount());
			int i= state.executeUpdate();
			if(i>0){
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			DBUtil.Close(conn);
		}
		return false;
	}
	
	/**
	 * 修改用户
	 */
	public boolean update(User user){
		Connection conn=null;
		try {
			conn=DBUtil.Connect();
			String sql="update Table_users set password=?,email=?,account=? where id=?";
			PreparedStatement state=conn.prepareStatement(sql);
			state.setString(1, user.getPassword());
			state.setString(2, user.getPassword());
			state.setDouble(3, user.getAccount());
			state.setInt(4, user.getId());
			int i=state.executeUpdate();
			if(i>0){
				return true;
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.Close(conn);
		}
		return false;
	}
	
	/**
	 * 删除用户
	 */
	public boolean delete(Integer id){
		Connection conn=null;
		try {
			conn=DBUtil.Connect();
			String sql="deletc from Table_users where id=?";
			PreparedStatement state=conn.prepareStatement(sql);
			state.setInt(1, id);
			int i=state.executeUpdate();
			if(i>0){
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * 根据账号查询用户的信息
	 */
	public User findByUsername(String username){
		User user=null;
		Connection conn=null;
		try {
			conn=DBUtil.Connect();
			String sql="select * from Table_users where username=?";
			PreparedStatement prestate=conn.prepareStatement(sql);
			prestate.setString(1, username);
			ResultSet set=prestate.executeQuery();
			if(set.next()){
				user=new User(set.getInt("id"),
						set.getString("username"),
						set.getString("password"),
						set.getString("email"),
						set.getInt("account")
						);
			}
			set.close();
			prestate.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			DBUtil.Close(conn);
		}
		return user;
	}

    /**
     * 
     */

}
