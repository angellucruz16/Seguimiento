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
		size (600,600);
		state = 2;
		posX = width /2;
		posY = height /2;
		
	} //SETTINGS
	

	public void setup () {
		background (0);
		noStroke();
		
		
	} //SETUP
	
	
	
	public void draw () {
		
		rectMode (CENTER);
		switch (state) {
		case 0:
			
			background (255);
			Square s = new Square(posX, posY, 10, this, width/2, height/2 );
			s.renderShapes(posX, posY, width, height,1);
			break;

		case 1:
			
			Circle c = new Circle(posX, posY, 0.1, this, width /3, height /3 );
			c.renderShapes(15, width /3, height/3);
			background (255);
			break;
		}
		
rectMode (CORNER);
		
		fill(255);
		rect (20,30,150,30);
		rect (20,80,150,30);
	
		
		
		fill (0);
		text ("CUADRADO",65,51);
		text ("C�RCULO",65,100);
		
rectMode (CORNER);

		fill(255);
		rect (20,450,150,30);
		rect (20,500,150,30);
	
		
		
		fill (0);
		text ("ZOOM IN",65,470);
		text ("ZOOM OUT",65,520);
		
	}//DRAW
	public void mousePressed () {
		
		if (mouseX > 20 && mouseX < 20+150
			&& mouseY >30 && mouseY < 30 + 30)
		state=0;
		
		if (mouseX > 20 && mouseX < 20+150
			&& mouseY >80 && mouseY < 80 + 30 )	
		state = 1;
		
		// ZOOM IN - ZOOM OUT
		
		if (mouseX> 20 && mouseX < 20+150 // ZOOMIN
				&& mouseY > 450 && mouseY < 450+30);
		
		if (mouseX > 20 && mouseX < 20 +150
				&& mouseY > 500 && mouseY < 500 +30); //ZOOMOUT
		
	}	//MP
		
	public void zoomIn () {
		
		int w = width*2; 
		int h = height *2; //DIMENSIONES PARA NUEVA ESCALA
		Square s = new Square(posX, posY, 0.1, this, w/20, h/20 );
		s.renderShapes(posX, posY, w, height,1);
		
	} //ZOOMIN
	
	public void zoomOut (){
		
		int w = width/2; 
		int h = height /2; //DIMENSIONES PARA NUEVA ESCALA
		Square s = new Square(posX, posY, 0.1, this, w/20, h/20 );
		s.renderShapes(posX, posY, w, h,1);
		
	} //ZOOMOUT
	
}
