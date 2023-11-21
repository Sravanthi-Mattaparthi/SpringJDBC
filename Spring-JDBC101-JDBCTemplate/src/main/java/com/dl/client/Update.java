package com.dl.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.Dao.HondaDao;
import com.dl.model.Honda;

public class Update {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	      HondaDao dao = (HondaDao) context.getBean("hondaDao");
	      
	      Honda honda = new Honda();
	     
	      honda.setId(1);
	      honda.setBikeName("Honda CBZ");
	      honda.setBikeColor("Matic Black");
	      honda.setCc(250.00);
	     
	      
	      int updateRecord = dao.updateRecord(honda);
	      System.out.println("Record Updated into data base: "+updateRecord);
	      
	      context.close();
	      
	}

}
