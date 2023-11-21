package com.dl.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dl.Dao.HondaDao;
import com.dl.model.Honda;

public class Insert 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      HondaDao dao = (HondaDao) context.getBean("hondaDao");
      
      
      Honda h1 = new Honda();
      h1.setId(1);
      h1.setBikeName("Honda Xtreme CBZ");
      h1.setBikeColor("Red");
      h1.setCc(150);
      
      //Record 2
      Honda h2 = new Honda();
      h2.setId(2);
      h2.setBikeName("Honda Activa");
      h2.setBikeColor("Sea Green");
      h2.setCc(200);

      int insertRecord1 = dao.insertRecord(h1);
      int insertRecord2 = dao.insertRecord(h2);
      System.out.println("Record is inserted into DataBase: " +insertRecord1);
      System.out.println("Record is inserted into DataBase: " +insertRecord2);
      context.close();
    }
}
