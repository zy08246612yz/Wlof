package OraConnect;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;

import Client.People;

public class ORUnit {
	private static Connection conn=null;
	private static BasicDataSource data=null;
	
	/**
	 * ���ݿ����Ӳ���
	 * @return
	 */
	public static boolean Connect(){

		data=new BasicDataSource();
		ReadXML.Reader("");
		data.setDriverClassName(ReadXML.Config.get("ClassName"));
		data.setUrl(ReadXML.Config.get("ConnectString"));
		data.setUsername(ReadXML.Config.get("UserName"));
		data.setPassword(ReadXML.Config.get("PassWord"));
		data.setMaxActive(Integer.parseInt(ReadXML.Config.get("MaxActive")));
		try {
			conn=data.getConnection();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	/**
	 * ʹ�þ�̬��ѯ�����õ�һ�ű�����ݽ��
	 * @return
	 */
	public static List<People> Query(){
		String sql="select * from Table_user";
		List<People> list=new ArrayList<People>();
		try {
			Statement state=conn.createStatement();
			ResultSet set=state.executeQuery(sql);
			while(set.next()){
				People p=new People();
				p.setId(set.getInt(1));
				p.setName(set.getString(2));
				p.setSex(set.getString(3));
				p.setAge(set.getInt(4));
				p.setOther(set.getString(5));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;

	}
	
	/**
	 * ʹ���ֶβ�ѯһ�����ݽ��
	 */
	public static People QueryPeople(int id){
		String sql="select * from Table_user where id=?";
		People p=new People();
		try {
			PreparedStatement	prestate=conn.prepareStatement(sql);
			prestate.setInt(1, id);
			ResultSet set=prestate.executeQuery();
			while(set.next()){
				p.setId(set.getInt(1));
				p.setName(set.getString(2));
				p.setSex(set.getString(3));
				p.setAge(set.getInt(4));
				p.setOther(set.getString(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	/**
	 * �����ݿ������һ������
	 */
	public static int AddPeople(People p){
		String sql="insert into Table_user values(?,?,?,?,?)";
		try {
			PreparedStatement	prestate=conn.prepareStatement(sql);
			prestate.setInt(1, p.getId());
			prestate.setString(2, p.getName());
			prestate.setString(3, p.getSex());
			prestate.setInt(4, p.getAge());
			prestate.setString(5, p.getOther());
			return prestate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * �������ʱ����һ������ֵ
	 */
	public  static int AddQueryId(People p){
		int id=0;
		String sql="insert into Table_user values(?,?,?,?,?)";
		try {
			PreparedStatement	prestate=conn.prepareStatement(sql,new String[]{"ID"});
			prestate.setInt(1, p.getId());
			prestate.setString(2, p.getName());
			prestate.setString(3, p.getSex());
			prestate.setInt(4, p.getAge());
			prestate.setString(5, p.getOther());
			prestate.executeUpdate();
			ResultSet set=prestate.getGeneratedKeys();
			set.next();
			id=set.getInt(1);
			return id;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return id;
	}
	
	
	/**
	 * �����ݿ���Ӷ�������:������������
	 */
	public static int AddPeopleMore(List<People> people){
		String sql="insert into Table_user values(?,?,?,?,?)";
		try {
			PreparedStatement	prestate=conn.prepareStatement(sql);
			for(int n=0;n<people.size();n++){
				prestate.setInt(1, people.get(n).getId());
				prestate.setString(2, people.get(n).getName());
				prestate.setString(3, people.get(n).getSex());
				prestate.setInt(4, people.get(n).getAge());
				prestate.setString(5, people.get(n).getOther());
				prestate.addBatch();
			}
			prestate.executeBatch();
			prestate.clearBatch();
			return 1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	/**
	 * �޸�һ�����ݵ����ݿ�
	 */
	public static int ChangePeople(People p){
		String sql="update  Table_user set name=?,sex=?,age=?,other=? where id=?";
		try {
			PreparedStatement	prestate=conn.prepareStatement(sql);
			prestate.setInt(5, p.getId());
			prestate.setString(1, p.getName());
			prestate.setString(2, p.getSex());
			prestate.setInt(3, p.getAge());
			prestate.setString(4, p.getOther());
			return prestate.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * ɾ��һ�����ݲ���
	 */
	public static boolean Delete(int id){
		String sql="delete from Table_user  where id=?";
		try {
			PreparedStatement	prestate=conn.prepareStatement(sql);
			prestate.setInt(1, id);
			return prestate.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	/**
     * ɾ����������
	 */
	public static boolean DeleteMore(List<Integer> listNum){
		try {
			String sql="delete from Table_user where id=?";
		     PreparedStatement  statement=conn.prepareStatement(sql);
			for(int n=0;n<listNum.size();n++){
				statement.setInt(1, listNum.get(n));
				statement.addBatch();
			}
			statement.executeBatch();
			statement.clearBatch();
			return false;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	
	
	/**
	 * ��ҳ��ѯ������� page:�ڼ�ҳ,pageNum:ÿһҳ������
	 */
	public  static List<People> PageQuery(int page,int pageNum){
		List<People> list=new ArrayList<People>();
		String sql="select * from (select rownum rn,t.* from "
				+ " (select * from Table_user order by ID) t)  where rn between ? and ?";
		try {
			PreparedStatement	prestate=conn.prepareStatement(sql);
			prestate.setInt(1, (page-1)*pageNum+1);
			prestate.setInt(2, page*pageNum);
			ResultSet set=prestate.executeQuery();
			while(set.next()){
				People p=new People();
				p.setId(set.getInt(2));
				p.setName(set.getString(3));
				p.setSex(set.getString(4));
				p.setAge(set.getInt(5));
				p.setOther(set.getString(6));
				list.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	/**
	 * ��ȡһ�ű��ж���ҳ
	 */
	public static int PageNum(int pageN){
		int num=0;
		num=SumPage();
		if(num%pageN==0){
			return num/pageN;
		}else{
			return (num/pageN)+1;
		}
		
	}
	
	/**
	 * �����ж���������
	 */
	
	public static int SumPage(){
		String sql="select count(*) from Table_user";
		try {
			PreparedStatement	prestate=conn.prepareStatement(sql);
			ResultSet set=prestate.executeQuery();
			set.next();
			return  set.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	/**
	 * ���ݿ�رղ���
	 */
	public static void Close(){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
