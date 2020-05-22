package model;

import java.util.LinkedList;

import processing.core.PApplet;

public class logica {

	private PApplet app;
	private LinkedList<personas> people;
	private String[] genteTXT;

	public logica(PApplet app) {

		people = new LinkedList<personas>();
		genteTXT = app.loadStrings("./texto/personas.txt");
		System.out.println("hola");
		cargarTexto();

	}

	public void cargarTexto() {

		for (int i = 0; i < genteTXT.length; i++) {
			String[] datos = genteTXT[i].split(":");
			String status = datos[0];
			int can = Integer.parseInt(datos[1]);
			if (status.equals("sanas")) {
				people.add(new sanas(can, app));
			}
			if (status.equals("infectadas")) {
				people.add(new enfermas(can, app));
			}
			if (status.equals("recuperadas")) {
				people.add(new recuperadas(can, app));
			}
		}

	}
	
	public void dibujarPersonas() {
		
		
		
	}

}
