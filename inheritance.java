package inheritance;

public class how {

	static public class Rectangle{
	  int width,height;
	  public Rectangle(int width,int height) {
		  this.width=width;
		  this.height=height;
	  }
	}
	static public class colorRectangle extends Rectangle{
	 String color;
	 public colorRectangle(int width,int height,String color) {
		 super(width,height);
		 this.color=color;
	 }
	}
	public static void main(String[] args) {
	 
		colorRectangle obj = new colorRectangle(100,100,"Blue");
		System.out.println("가로: "+obj.width);
		System.out.println("세로: "+obj.height);
		System.out.println("색상: "+obj.color);
	}

}
