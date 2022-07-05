class Shape{
    int n=5;
    void Area(){
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
