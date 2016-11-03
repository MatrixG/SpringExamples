package it.alfasoft.alex.ereditarietaDelleDefinizioniDelBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Esempio {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		// Se il padre è abstract non può essere istanziato.
		// Inoltre se non inizializzo gli attributi del padre e lo rendo non
		// abstrract prendo un NullpointerExc.

		Triangolo t1 = (Triangolo) context.getBean("triangoloFiglio");
		// Triangolo t2 = (Triangolo) context.getBean("triangoloPadre");

		t1.stampaVertici();
		// t2.stampaVertici();

	}

}
