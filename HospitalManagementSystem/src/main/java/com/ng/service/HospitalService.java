package com.ng.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ng.dao.HospitalDAO;
import com.ng.model.Hospital;

@Service
public class HospitalService implements IHospitalService {

	@Autowired
	private HospitalDAO dao;
	@Override
	public List<Hospital> fetchHospitalUsingLocation(String loc1,String loc2) throws Exception {
	 
				loc1 = loc1.toLowerCase();
				loc2 = loc2.toLowerCase();
				
			return 	dao.getHospitalByLoc(loc1, loc2);
		 
	}

}
