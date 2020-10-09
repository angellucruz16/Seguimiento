import processing.core.PApplet;

public class Circle extends Shapes {

	public Circle(int X, int Y, double FD , PApplet PSketch , int Pwidth, int Pheight) {
		super(X, Y, FD, PSketch,Pwidth, Pheight);
		// TODO Auto-generated constructor stub	

	}

	public void renderShapes (int posX, int posY, int D) {



		Sketch.noFill();
		Sketch.stroke(2);
		Sketch.ellipse (posX,posY,D,D);
		
		if (D > 2) {
			
			renderShapes(posX,posY,D-20);
			 
			
		}  
		
	}//RS
	
	
}	
