class Shape{
    int n=5;
    final void Area(){
      System.out.println("This is Shape Area");  
    }
}
class Circle extends Shape{
    int n=10;
    void Area(){
      System.out.println("This is Cicle Area");  
    }
}
public class Main
{
	public static void main(String[] args) {
		Shape obj=new Circle();
		System.out.println(obj.n);
		obj.Area();
	}
}
/*Output
Main.java:16: error: Area() in Circle cannot override Area() in Shape
    void Area(){
         ^
  overridden method is final
1 error
/
