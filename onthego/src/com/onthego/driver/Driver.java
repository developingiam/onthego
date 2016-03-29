package com.onthego.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.onthego.beans.OTGUser;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring-config.xml");
		OTGUser user = (OTGUser)factory.getBean("otgUser");
		System.out.println(user.getId()+"\n"+user.getFirstName()+"\n"+user.getMiddleName()+"\n"+user.getLastName());
		
	}

}
