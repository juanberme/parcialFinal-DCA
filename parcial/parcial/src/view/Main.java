package view;

import controller.controller;
import model.enfermas;
import processing.core.PApplet;

public class Main extends PApplet {

	public static void main(String[] args) {
		
		PApplet.main("view.Main");
		
	}
	
	controller cont;
	enfermas enf;
	
	public void settings() {
		
		size(500,500);
		
	}
	
	public void setup() {
		
		cont = new controller(this);
		enf = new enfermas(10, this);
		
	}
	
	public void draw() {
		
		//cont.cargarPersonas();
		enf.pintar();
		enf.mover();
		
	}
	
	public void keyPressed() {
		
	}

}
