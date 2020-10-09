import processing.core.PApplet;

public class Square extends Shapes {

	public Square(int X, int Y, double FD , PApplet PSketch , int Pwidth, int Pheight) {
		super(X, Y, FD, PSketch, Pwidth, Pheight);
		
	}//CONSTRUCTOR
	
	public void renderShapes (int posX, int PosY, int width, int height, int numSquare ) {
		

		Sketch.noFill();
		Sketch.stroke(0);
		Sketch.rect (posX, posY, width , height );
		
		
		if (width - 2 > 2) {
			
			renderShapes(posX-1, posY-1, width/2, height/2, numSquare+1);
			 
		
		}  
		
	}//RS
	
	
	//ROTAR LOS CUADRADOS PARES = IZQUIERDA
	  //IMPARES= DERECHA
	 
	public void rotateSquare (int numSquare) {
		
		if (numSquare %2 == 0) {
			
		Sketch.translate (width/2, height/2);
		Sketch.rotate((float) ((15/180)*3.1415));
		
		} //ROTATE PAR
		
		else if (numSquare %2 ==1) {
			Sketch.translate (width/2, height/2);
			Sketch.rotate((float) ((345/180)*3.1415));
			
		} //ROTATE IMPAR
	
	} // ROTATESQUARE
	
}
