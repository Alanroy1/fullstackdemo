class P  {
        
  public void h() {                    
    System.out.println("p");
  }
}
class T
{
static public void h() {                    
    System.out.println("p");
  }
}
class H extends P
{
 public void h() {                    
    System.out.println("T");
  }

}
class Inheritance extends P {
     
  public static void main(String[] args) {
	H l=new H();
	l.h();
	T.h();
	

 
  }
}
 
