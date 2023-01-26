
public class Square {
	int side;
	public Square() {
		side = 0;
		
	}
	public Square(int side) {
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(int newSide) {
		this.side = newSide;
	}
	public int getArea() {
		return side*side;
				
	}
}
