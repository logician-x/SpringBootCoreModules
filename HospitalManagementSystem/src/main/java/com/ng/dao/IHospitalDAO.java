package com.ng.dao;

import java.util.List;
import com.ng.model.Hospital;

public interface IHospitalDAO {
				
			public List<Hospital> getHospitalByLoc(String loc1,String loc2) throws Exception;
		
}
