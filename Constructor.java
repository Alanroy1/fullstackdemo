class A{
  int x;

 A(int y) {
    x = y;
  }
}
public class Constructor 
{

  public static void main(String[] args) {

    A myObj = new A(7);
    System.out.println(myObj.x);
  }
}