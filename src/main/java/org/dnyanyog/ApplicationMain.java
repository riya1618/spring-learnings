package org.dnyanyog;

import org.dnyanyog.component.Student;
import org.dnyanyog.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {
	public static void main(String[] args) {
		// Spring run 
				ApplicationContext spring = new AnnotationConfigApplicationContext(ApplicationConfig.class);
				
				Student app = spring.getBean(Student.class);
				
				app.setFirstName("Riya");
				app.setLastName("Salvi");
				app.setAge(21);
				app.setBranchName("Computer ");
				app.setMobile("98989898");
				//Set Address
				app.getAddress().setCity("Pune");
				
				System.out.println("First Name:"+app.getFirstName());
				System.out.println("Last Name:"+app.getLastName());
				System.out.println("Mobile No:"+app.getMobile());
				System.out.println("Age:"+app.getAge());
				System.out.println("Address:"+app.getAddress().getCity());
		
	}

}
