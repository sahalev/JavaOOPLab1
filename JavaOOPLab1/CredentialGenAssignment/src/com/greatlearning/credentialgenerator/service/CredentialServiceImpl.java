package com.greatlearning.credentialgenerator.service;

import java.security.SecureRandom;
import java.util.Random;

import com.greatlearning.credentialgenerator.model.Employee;

public class CredentialServiceImpl implements  CredentialService{

	@Override
	public String generateEmailAdress(Employee e) {
		StringBuilder sb = new StringBuilder();
		sb.append(e.getFirstName().toLowerCase());
		sb.append(e.getLastName().toLowerCase());
		sb.append("@");
		sb.append(e.getDepartment());
		sb.append(".abc.com");
		return sb.toString();
	}

	@Override
	public String generatePassWord(int len) {
		
		final String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		final String small = "abcdefghijklmnopqrstuvwxyz";
		final String numbers = "0123456789";
		final String specialchar = "!@#$%&";
		 
       Random random = new Random();
        StringBuilder sb = new StringBuilder();
 
 
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(caps.length());
            sb.append(caps.charAt(randomIndex));
        }
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(small.length());
            sb.append(small.charAt(randomIndex));
        }
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(numbers.length());
            sb.append(numbers.charAt(randomIndex));
        }
        for (int i = 0; i < len; i++)
        {
            int randomIndex = random.nextInt(specialchar.length());
            sb.append(specialchar.charAt(randomIndex));
        }
      
        return sb.toString();
	}

	@Override
	public void showCredentials(Employee e) {
		
		System.out.println("Dear "+e.getLastName()+" your generated credentials are as follows");
		System.out.println("Email  -------> "+generateEmailAdress(e));
		System.out.println("Password  -------> "+generatePassWord(2));
	}

}
