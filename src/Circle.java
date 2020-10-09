import processing.core.PApplet;

public class Circle extends Shapes {

	public Circle(int X, int Y, double FD , PApplet PSketch , int Pwidth, int Pheight) {
		super(X, Y, FD, PSketch,Pwidth, Pheight);
		// TODO Auto-generated constructor stub	

	}

	public void renderShapes (int Dist, int w, int h) {



		Sketch.noFill();
		Sketch.stroke(0);
		Sketch.ellipse (posX, posY, (int) (w - Dist), (int) (h - Dist));
		
		if (width - Dist > 2) {
			
			renderShapes(Dist,w-Dist, h-Dist);
			
			
		}  
		
	}//RS
}	
