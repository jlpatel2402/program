
package test;

public class NewClass {
   static void getdata(char...ch)
   {
        
       for(int i=0;i<4;i++)
        {
            for(int j=i;j<4;j++)
            {
                if(ch[i]>ch[j])
                {
                    int temp;
                    temp=ch[i];
                    ch[i]=ch[j];
                    ch[j]=(char)temp;
                }
            }
            
        }
         for(int j=0;j<4;j++)
         {
          System.out.println("ans is"+ch[j]);
         }
                 
 }
    public static void main(String[] args)
    {
        getdata('z','a','b','c');
    }
}

    

