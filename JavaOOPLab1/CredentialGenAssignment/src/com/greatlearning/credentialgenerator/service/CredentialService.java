package com.greatlearning.credentialgenerator.service;

import com.greatlearning.credentialgenerator.model.Employee;

public interface CredentialService {

	public String generateEmailAdress (Employee e);
	public String generatePassWord(int len);
	public void showCredentials(Employee e);
	
	
}
