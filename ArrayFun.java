
public class ArrayFun {
	public Square [] myArray;
	public int Index;
	public Square s;

	
	public ArrayFun() {
		myArray = new Square[6];
		for(int i = 0; i<6; i++) {
			myArray[i] = new Square(i);
	}
	
	}
		
	public void setArrayItem(int index, Square s) {
		myArray[index]= s;
	}
	public Square getArrayItem(int index) {
		return s;
	}
	public void forward() {
		for(int i =0; i<6;i++)
		{
			myArray[i].getArea();
			System.out.println(myArray[i].getArea());
		}
		
		
	}
	public void backward() {
		for(int i=0; i<6;i++) {
			myArray[i].getArea();
			System.out.println(myArray[i].getArea());
		}
	}
	public void sum() {
		int accum=0;
		for(int i=0;i<6;i++) {
			accum = accum + myArray[i].getArea();
					
		}
		System.out.println(accum);
	}
	}

