abstract class A{
    int age;
    A(int age){
        this.age=age;
    }
    abstract void wish();
}
class B extends A{
    B(int age){
    super(age);
    }
    void wish(){
        System.out.println("Hello World I am " + age);
    }
}
public class Main
{
	public static void main(String[] args) {
		B obj=new B(21);
		obj.wish();
	}
}
