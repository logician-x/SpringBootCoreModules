package com.ng.sbeans;



import java.util.*;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@ToString
@Component("student")
@Setter
@ConfigurationProperties(prefix="college.student")
public class Student {
	
	        private String name;
			private Integer age ;
			private Integer marks ;
			private String address ;
			private Long mobile;
			//arrays
			private String[] names;
			//List
			List<String> list;
			//Set
		//	Set<String> set;
			//map
			Map<String,Integer> map;
			//object
			private Subject subj;
}
