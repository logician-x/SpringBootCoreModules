package com.ng.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SeasonFinder {

				@Autowired
				private LocalDate date;
				
				public String findSeason() {
					
						int month = date.getMonthValue();
						if(month>=3 && month<=60) {
							return "summer";
						}else if(month>=7 && month<=10) {
							return "rainy";
						}else {
							return "winter";
						}
				}
				
}
