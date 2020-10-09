import processing.core.PApplet;

public class Square extends Shapes {

	public Square(int X, int Y, double FD , PApplet PSketch , int Pwidth, int Pheight) {
		super(X, Y, FD, PSketch, Pwidth, Pheight);
		
	}//CONSTRUCTOR
	
	public void renderShapes (int posX, int PosY, int width, int height, int numSquare ) {
		

		Sketch.noFill();
		Sketch.stroke(0);
		Sketch.rect (posX, posY, width , height );
		
		rotateSquare (numSquare);
		
		if (width - 2 > 2) {
			
			renderShapes(posX-1, posY-1, width-2, height-2, numSquare +1);
			 
		
		}  
		
	}//RS
	
	@Override 
	public void rotateSquare ( int numSquare) {
		
		if (numSquare %2 == 0) {
			
			
			
		} //ROTATEPAR
		
		else if (numSquare %2 ==1)
			
			
		} //ROTATE IMPAR
	
	} // ROTATESQUARE
	
}
