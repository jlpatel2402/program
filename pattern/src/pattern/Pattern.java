
package pattern;

public class Pattern {
    public static void main(String[] args) {
      int a,b,c;
      for(a=5;a>=1;a--)
      {
          for(b=1;b<=1;b++)
          {
              System.out.print(" *");
          }
          for(c=5;c>a;c--)
          {
              System.out.print(" ");
          }
          for(b=1;b<=a;b++)
          {
              System.out.print(" *");
          }
          System.out.print("\n");
      }
       for(a=1;a<=5;a++)
       {
           for(b=1;b<=a;b++)
           {
               System.out.print(" *");
           }
           for(c=5;c>a;c--)
           {
               System.out.print(" ");
           }
           for(b=1;b<=a;b++)
           {
               System.out.print(" *");
           }
           System.out.print("\n");
       }
      }
    
}
