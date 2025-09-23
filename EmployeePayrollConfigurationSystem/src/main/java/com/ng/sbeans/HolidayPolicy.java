package com.ng.sbeans;

import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
public class HolidayPolicy {
	
	private int maxLeaves ;
	private boolean carryForward ;
	private int paidLeaves ;
	
}
