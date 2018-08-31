
package test;

 class papa {
 void getdata(int a,double b)
 {
     System.out.println("int");
 } 
}
 class child extends test4{
  
    public void getdata(int a,double b){
     System.out.print("var-args");
    }
}
public class test4{
      public static void main(String[] a){
          child t=new child();
          t.getdata(10,10);
      }
  
}
