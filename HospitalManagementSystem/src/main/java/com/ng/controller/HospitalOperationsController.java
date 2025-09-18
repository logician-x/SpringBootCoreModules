package com.ng.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.ng.model.Hospital;
import com.ng.service.HospitalService;

@Controller("hospitalController")
public class HospitalOperationsController {
	
		@Autowired
		private HospitalService hservice;
		
		public List<Hospital>  showHospitalByLoc(String loc1,String loc2)throws Exception{
				
			 return hservice.fetchHospitalUsingLocation(loc1, loc2);
			
		}
		
}
