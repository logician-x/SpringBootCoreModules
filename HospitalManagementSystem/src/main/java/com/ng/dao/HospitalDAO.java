package com.ng.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ng.model.Hospital;

@Repository
public class HospitalDAO implements IHospitalDAO {
	
	private static final String SELECT = "SELECT hospitalno,hname,loc from Hospital WHERE loc IN(?,?)";
	
	@Autowired
	private DataSource ds;
	
	
	@Override
	public List<Hospital> getHospitalByLoc(String loc1, String loc2) throws Exception{
				
			List<Hospital> list = null;
			try(Connection con = ds.getConnection();
					PreparedStatement psmt = con.prepareStatement(SELECT);){
					
				 psmt.setString(1, loc1);
				 psmt.setString(2, loc2);
				 try(ResultSet rs =psmt.executeQuery()){
					 list = new ArrayList<>();
					 while(rs.next()) {
						 Hospital hospital = new Hospital();
						 hospital.setHospitalno(rs.getLong(1));
						 hospital.setHname(rs.getString(2));
						 hospital.setLoc(rs.getString(3));
						 list.add(hospital);
					 }
					 return list;
				 }
			}catch(SQLException se) {
				throw se;
			}catch(Exception e) {
				throw e;
			}		
	}
		
			
	
}
