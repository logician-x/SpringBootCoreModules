package com.ng.dao;

import javax.sql.DataSource;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository; 
import com.ng.sbeans.Employee;

@Repository
public class DAO {

	private static final String SELECT =  "select empno,ename,job,sal from employee where job IN(?,?,?)";
	private static final String INSERT  =  "insert into employee(empno,ename,job,sal) values(empsequence.NEXTVAL,?,?,?)";
		
		 @Autowired
		 private DataSource ds;		 
		 
		 public List<Employee> retrieveAllEmployee(String desg1,String desg2,String desg3) throws SQLException{
			 	
			
			 List<Employee> list  = null;
			  System.out.println(ds.getClass().getName());
			 	try(Connection con = ds.getConnection();
				 	 PreparedStatement psmt = con.prepareStatement(SELECT);){	
			 		System.out.println("DAO.retrieveAllEmployee()");
			 		psmt.setString(1, desg1);
			 		psmt.setString(2,desg2);
			 		psmt.setString(3, desg3);
			 		try(ResultSet rs  = psmt.executeQuery()) {
			 			list = new ArrayList<>();
				 		while(rs.next()) {
				 			Employee emp = new Employee();
				 			emp.setId(rs.getLong(1));         
				 			emp.setName(rs.getString(2));  
				 			emp.setJob(rs.getString(3)) ;
				 			emp.setSalary(rs.getDouble(4));   			 	        
				 	        list.add(emp);
				 		}			 		
			 		}
			 		return list;
			 			
			 	}catch(SQLException e) {
			 		throw e;
			 	}	 
		 }
		 
		 
		 public int insert(Employee emp) throws Exception{
			 try(Connection con = ds.getConnection();
					 PreparedStatement psmt = con.prepareStatement(INSERT)){
			 
				 psmt.setString(1, emp.getName());
				 psmt.setString(2, emp.getJob());
				 psmt.setDouble(3, emp.getSalary());
				int count = psmt.executeUpdate();
				return count;
			 }catch(SQLException e) {
				 throw e;
			 }catch(Exception e) {
				 throw e;
			 }
		 }
}
