package com.greatlearning.credentialgenerator.test;

import com.greatlearning.credentialgenerator.model.Employee;
import com.greatlearning.credentialgenerator.service.CredentialService;
import com.greatlearning.credentialgenerator.service.CredentialServiceImpl;

public class EmailAddressTest {

	public static void main(String[] args) {
		
		Employee e = new Employee("Mohammed","sahal");
		e.setDepartment("tech");
		
		CredentialService cs = new CredentialServiceImpl();
		System.out.println(cs.generateEmailAdress(e));
		System.out.println(cs.generatePassWord(2));
		cs.showCredentials(e);
		
		

	}

}
