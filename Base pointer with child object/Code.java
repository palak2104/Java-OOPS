class A{
    int a,b;
    int sum(){
        //System.out.println("This is Addition"); 
        return a+b;
    }
    
}
class B extends A{
    B(int a,int b){
        this.a=a;
        this.b=b;
    }
    
    int sum(){
      //System.out.println("This is multiplication"); 
      return super.sum();
    }
}
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		B x=new B(3,4);
		//x.func();
		System.out.println(x.sum());
	}
}

