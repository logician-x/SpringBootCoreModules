package com.ng.sbeans;


import java.util.*;
import java.util.*;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties(prefix="courseplatform")
public class CourseHolder {
	
	private String platformName ;
	private String defaultLanguage;
	private Double subscriptionFee;
	private boolean active ;
	private List<String> supportedLanguages;
	private Map<String,Double> storageLimits;
	private Course course;
	private List<Course> clist;	
}

