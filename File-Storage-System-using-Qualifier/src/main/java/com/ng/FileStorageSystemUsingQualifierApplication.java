package com.ng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ng.sbeans.StorageManager;

@SpringBootApplication
public class FileStorageSystemUsingQualifierApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx = SpringApplication.run(FileStorageSystemUsingQualifierApplication.class, args);){
			
				StorageManager sm =  ctx.getBean(StorageManager.class);
				sm.save("report.pdf");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
