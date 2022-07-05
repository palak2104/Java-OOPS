class NewObject{
   int num;
   float gpa;
   NewObject(int num){
       this.num=num;
       this.gpa=gpa;
   }
   boolean equals(NewObject obj){
       if(obj.num==num)
       return true;
       else return false;
   }
}
public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		NewObject obj1=new NewObject(12);
		NewObject obj3=new NewObject(12);
		NewObject obj2=obj1;
		if(obj1==obj2){
		  System.out.println("Reference of both is Equal");  
		}
		if(obj1.equals(obj3)){
		    System.out.println("Content of both the objects is equal");
		}
	}
}
