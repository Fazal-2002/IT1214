public class Rectangle{
	private int length;
	private int breadth;
	
	public Rectangle(){
		this.length=2;
		this.breadth=3;
	}
	
	public Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	public int area(){
		return length*breadth;
	}
	public static void main(String[] args){
		Rectangle rec1=new Rectangle();
		Rectangle rec2=new Rectangle(5,10);
		System.out.println("Area of rect2:"+rec2.area());
	}
}