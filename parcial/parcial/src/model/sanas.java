package model;

import processing.core.PApplet;

public class sanas extends personas{
	
	PApplet app;

	public sanas( int cant, PApplet app) {
		super(cant, app);
		
	}

	public int compareTo(personas arg0) {
		return 0;
	}

	@Override
	public void pintar() {
		
		/*this.r = 0;
		this.g = 255;
		this.b = 0;*/
		app.fill(r,g,b);
		app.ellipse(posX, posY, tam, tam);
		
	}

}
