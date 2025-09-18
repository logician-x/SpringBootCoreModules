package com.ng.service;
import java.util.List;

import com.ng.model.Hospital;
public interface IHospitalService {
			
		public List<Hospital> fetchHospitalUsingLocation(String loc1,String loc2) throws Exception;
	
}
