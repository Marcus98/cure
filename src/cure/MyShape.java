package cure;

abstract class MyShape {
	
	abstract double getLen();
	abstract double getArea();
	
}

class Rect extends MyShape{
	
	double width;
	double height;
	
	Rect(){
		
	}
	
	Rect(double width,double height){
		this.width = width;
		this.height = height;
	}

	@Override
	double getLen() {
		
		return 2*(width+height);
	}

	@Override
	double getArea() {

		return width*height;
	}
	
}
