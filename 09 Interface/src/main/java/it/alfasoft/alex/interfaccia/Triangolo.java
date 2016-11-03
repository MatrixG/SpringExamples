package it.alfasoft.alex.interfaccia;

public class Triangolo implements Figura {

	private Punto puntoA;
	private Punto puntoB;
	private Punto puntoC;

	public Triangolo() {

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

	public void stampa() {
		System.out.println("coordinate di A:" + puntoA.getX() + "-" + puntoA.getY());
		System.out.println("coordinate di B:" + puntoB.getX() + "-" + puntoB.getY());
		System.out.println("coordinate di C:" + puntoC.getX() + "-" + puntoC.getY());
	}
}
