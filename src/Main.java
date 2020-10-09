import processing.core.PApplet;

public class Main extends PApplet {

int state;
int posX;
int posY;
	
	public static void main(String[] args) {

		String[] processingArgs = {"Main"};
		Main mySketch = new Main();
		PApplet.runSketch(processingArgs, mySketch);

	} // MAIN

	public void settings () {
		size (800,800);
		state = 2;
		posX = width /2;
		posY = height /2;
		
	} //SETTINGS
	

	public void setup () {
		background (255);
		noStroke();
		
		
	} //SETUP
	
	
	
	public void draw () {
		rectMode (CENTER);
		switch (state) {
		case 0:
			background (255);
			Square s = new Square(posX, posY, 0.1, this, width /3, height /3 );
			s.renderShapes(posX, posY, width, height);
			break;

		case 1:
			
			Circle c = new Circle(posX, posY, 0.1, this, width /3, height /3 );
			c.renderShapes(15, width /3, height/3);
			background (255);
			break;
		}
		
rectMode (CORNER);
		
		fill(188,223,243);
		rect (20,30,150,30);
		rect (20,80,150,30);
	
		
		
		fill (0);
		text ("Cuadrados",65,51);
		text ("Círculos",65,100);
		
	}//DRAW
	public void mousePressed () {
		
		if (mouseX > 20 && mouseX < 20+150
			&& mouseY >30 && mouseY < 30 + 30)
		state=0;
		
		if (mouseX > 20 && mouseX < 20+150
			&& mouseY >80 && mouseY < 80 + 30 )	
		state = 1;
		
	}	//MP
		
	
}
