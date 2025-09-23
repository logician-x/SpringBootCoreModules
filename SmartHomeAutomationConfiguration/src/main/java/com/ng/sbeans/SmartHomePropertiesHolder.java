package com.ng.sbeans;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
@ConfigurationProperties(prefix="smarthome")
public class SmartHomePropertiesHolder {
	
		private String systemName;
		private String version;
		private boolean energySavingMode;
		private int maxDevices;
		
		List<String> supportedDevices;
		
		Map<String,Integer> roomDefaults;
		SecuritySettings securitySettings;
		
		List<Device> device;

}
