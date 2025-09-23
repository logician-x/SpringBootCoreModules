package com.ng.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartHomeService {
	
			
			@Autowired
			private SmartHomePropertiesHolder pholder;
			
			public void printSmartHomeDetails() {
					
					System.out.println("System name:"+pholder.getSystemName());
					System.out.println("Version:"+pholder.getVersion());
					System.out.println("EnergySavingMode:"+pholder.isEnergySavingMode());
					System.out.println("MaxDevices:"+pholder.getSupportedDevices());
					System.out.println("Supported devices:");
					pholder.getSupportedDevices().forEach(System.out::println);
					System.out.println("Room Defaults:");
					pholder.roomDefaults.forEach((k,v)->System.out.println(k+":"+v));
					System.out.println("SecuritySettings:"+pholder.getSecuritySettings());
					pholder.getDevice().forEach(System.out::println);
			}
			
		
}
