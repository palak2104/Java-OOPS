class A{
    A(){
       System.out.println("Hello World"); 
    }
}
public class Main
{
	public static void main(String[] args) {
	A obj=new A();
	System.out.println(obj instanceof A);
	System.out.println(obj instanceof Object);
	System.out.println(obj.getClass().getName());
	}
}
