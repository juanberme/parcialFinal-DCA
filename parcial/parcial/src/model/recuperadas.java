package model;

import processing.core.PApplet;

public class recuperadas extends personas{
	
	PApplet app;

	public recuperadas(int cant, PApplet app) {
		super(cant, app);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(personas o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void pintar() {
		
		/*this.r = 0;
		this.g = 0;
		this.b = 255;*/
		app.fill(r,g,b);
		app.ellipse(posX, posY, tam, tam);
		
	}

}
