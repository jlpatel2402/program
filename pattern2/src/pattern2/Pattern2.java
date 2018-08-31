
package pattern2;

public class Pattern2 {

    public static void main(String[] args) {
      int a,b,c;
      for(a=1;a<=5;a++)
      {
          for(c=5;c>=a;c--)
          {
              System.out.println("*");
              
          }
          for(b=1;b<=a;b++)
          {
              System.out.print("*");
          }
      }
    }
    
}
