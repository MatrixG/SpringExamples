package it.alfasoft.alex.primaApplicationContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Triangolo t = (Triangolo) context.getBean("triangolo");

		t.stampaNome();

		t.setBase(40);

		t.stampaNome();

	}

}
