package it.alfasoft.alex.interfaccia;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Figura f = (Figura) context.getBean("triangolo");

		f.stampa();

	}

}
