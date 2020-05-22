package controller;

import model.logica;
import processing.core.PApplet;
import view.Main;

public class controller {

	PApplet app;
	logica logic;
	
	public controller(PApplet app) {
		
		logic = new logica(app);
		
	}

	public void cargarPersonas() {
		logic.dibujarPersonas();
	}
	
}
