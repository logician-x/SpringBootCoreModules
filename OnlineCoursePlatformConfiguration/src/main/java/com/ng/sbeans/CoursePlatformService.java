package com.ng.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cplatformService")
public class CoursePlatformService {
		
		
			@Autowired
			private CourseHolder courseHolder;
			
			public void printAllProperties() {					
					System.out.println(courseHolder);					
			}
	
}
