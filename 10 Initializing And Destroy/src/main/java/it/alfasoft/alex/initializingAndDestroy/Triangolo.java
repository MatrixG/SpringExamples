package it.alfasoft.alex.initializingAndDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangolo implements InitializingBean, DisposableBean {

	private Punto puntoA;
	private Punto puntoB;
	private Punto puntoC;

	public Triangolo() {

	}

	public void stampaVertici() {
		System.out.println("coordinate di A:" + puntoA.getX() + "-" + puntoA.getY());
		System.out.println("coordinate di B:" + puntoB.getX() + "-" + puntoB.getY());
		System.out.println("coordinate di C:" + puntoC.getX() + "-" + puntoC.getY());

	}

	public Punto getPuntoA() {
		return puntoA;
	}

	public void setPuntoA(Punto puntoA) {
		this.puntoA = puntoA;
	}

	public Punto getPuntoB() {
		return puntoB;
	}

	public void setPuntoB(Punto puntoB) {
		this.puntoB = puntoB;
	}

	public Punto getPuntoC() {
		return puntoC;
	}

	public void setPuntoC(Punto puntoC) {
		this.puntoC = puntoC;
	}

	public void afterPropertiesSet() throws Exception {

		System.out.println("Inizializzato !!!!");

	}

	public void destroy() throws Exception {

		System.out.println("Prima di distruggere !!!!");

	}

	public void myDestroy() {
		System.out.println("Metodo myDestroy di Triangolo");
	}

	public void myInit() {
		System.out.println("Metodo myInit di Triangolo");

	}
}
