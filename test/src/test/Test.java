
package test;
import java.util.Scanner;
public class Test {
    
    public static void main(String[] args)
    {
        int [] no=new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value:");
        
        for(int i=0;i<10;i++)
        {
            no[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++)
        {
            for(int j=i;j<10;j++)
            {
                if(no[i]>no[j])
                {
                    int temp;
                    temp=no[i];
                    no[i]=no[j];
                    no[j]=temp;
                }
            }
            
        }
      /*   for(int j=0;j<10;j++)
         {
          System.out.println("ans is"+no[j]);
         }*/
         System.out.println("enter value to find");
         Scanner s =new Scanner(System.in);
         int a = sc.nextInt();
         for(int k=0;k<10;k++)
         {
             if(no[k]==a)
             {
                 System.out.println("your no is available");
             }
                 
             
         }    
    }
    }

