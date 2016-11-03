package it.alfasoft.alex.beanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Triangolo t = (Triangolo) context.getBean("triangolo");

		t.stampaVertici();
		
		t.setPuntoA(new Punto(7,8));
		
		Triangolo t2 = (Triangolo) context.getBean("triangolo");
		t2.stampaVertici();
	}

}
