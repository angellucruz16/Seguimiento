import processing.core.PApplet;

public class Square extends Shapes {

	public Square(int X, int Y, double FD , PApplet PSketch , int Pwidth, int Pheight) {
		super(X, Y, FD, PSketch, Pwidth, Pheight);
		
	}//CONSTRUCTOR
	
	public void renderShapes () {
		

		Sketch.noFill();
		Sketch.stroke(0);
		Sketch.rect (posX, posY, width , height );
	
		
		
	}//RS
	
}
