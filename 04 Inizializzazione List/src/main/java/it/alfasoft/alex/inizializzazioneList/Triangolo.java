package it.alfasoft.alex.inizializzazioneList;

import java.util.List;

public class Triangolo {

	private List<Punto> punti;

	public Triangolo() {

	}

	public void stampaVertici() {

		for (Punto p : punti) {
			System.out.println("Punto: " + p.getX() + "-" + p.getY());
		}
	}

	public List<Punto> getPunti() {
		return punti;
	}

	public void setPunti(List<Punto> punti) {
		this.punti = punti;
	}
}
