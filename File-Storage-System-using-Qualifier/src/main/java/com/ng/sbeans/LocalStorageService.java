package com.ng.sbeans;

import org.springframework.stereotype.Component;

@Component("localStorage")
public class LocalStorageService implements StorageService {

	@Override
	public String storeFile(String fileName) {
		return "Storing file "+fileName+"in Local Storage";
	}

}
