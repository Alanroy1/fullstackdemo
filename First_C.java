 public class First_C {  

        public void myMethod()   
       {  

       System.out.println("Method");  

       }  

         

       {  

       System.out.println(" Instance Block");  

       }  

                         

                   public void First_C()  

                   {  

                  System.out.println("Constructor ");  

                   }  

                   static {  

                      System.out.println("static block");  

                   }  

                   public static void main(String[] args) {
 byte b = 6;

b+=8;
for ( int i = 99; i >= 0; i / 9 );

 System.out.println(b); 
             char var13 = 'A';

     char var12 = 'a';
     System.out.println((int)var13 + " " + (int)var12);

 int count = 1;  
      while (count <= 15) {  

       System.out.println(count % 2 == 1 ? "***" : "+++++");  

       ++count;  

           }      // end while  

       // end main   

 


 int [] index = new int[5];

 System.out.println(index instanceof Object); 
int i = 010;

int j = 07;

System.out.println(i);

System.out.println(j); 
 int g = 3;

             System.out.println(++g * 8);
  double var1 = 1 + 5;

             double var2 = var1 / 4;

             int var3 = 1 + 5;

             int var4 = var3 / 4;

             System.out.println(var2 + " " + var4);


  double r, pi, a;

              r = 9.8;

              pi = 3.14;

              a = pi * r * r;

              System.out.println(a);  

                  First_C c = new First_C();  

                   c.First_C();  

c.myMethod();                  }  

              }   