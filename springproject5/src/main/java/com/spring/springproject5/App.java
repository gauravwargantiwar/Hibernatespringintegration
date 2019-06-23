package com.spring.springproject5;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App{
    public static void main(String[] args)
    {
    	//ClassPathXmlApplicationContext cc=new ClassPathXmlApplicationContext("app.xml");
    	//BeanFactory beanfactory = new XmlBeanFactory(new FileSystemResource("E:\\workspace\\springproject5\\src\\main\\java\\app.xml"));
     // BeanFactory bf = new ClassPathXmlApplicationContext("app.xml");
       ApplicationContext bf = new ClassPathXmlApplicationContext("app.xml");
         //  Product p1= (Product) beanfactory.getBean("pid");
         //  Product p2= (Product) acontecxt.getBean("pid");
        Product p1= (Product) bf.getBean("pid");
       Product p2= (Product) bf.getBean("pid");
           
         // System.out.println(p1.getProductname());
         // System.out.println(p1.getVendor().getVendtype());
           System.out.println(p1);
           System.out.println(p2);
           System.out.println(p1==p2);
          System.out.println(p1.equals(p2));
           
           SessionFactory sf = (SessionFactory) bf.getBean("hbmSessioNFactory");
   		Session s = sf.openSession();
   		Transaction tr = s.beginTransaction();
   		s.save(p1);
   		s.flush();
   	    tr.commit();
        
        
    }
}
