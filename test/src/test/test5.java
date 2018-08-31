package test;
import java.util.Scanner;
public class test5{
    static String holdername,id,password,accountno,lid,lpassword,logout;
    static int amount,choice,a,money,FDamount;
   static boolean x = false;
    public static void main(String[] args){
        do{
    System.out.println("press 1 to create new account ");
    System.out.println("press 2 for login");
    System.out.println("press 3 to view account detail");
    System.out.println("press 4 to transfer fund");
    System.out.println("press 5 for FD");
    System.out.println("press 6 to logout");
    System.out.println("press 7 to exit application");
    Scanner sc = new Scanner(System.in);
    choice = sc.nextInt();
    switch(choice)
    {
        case 1:
            System.out.println("Enter your name");
            Scanner n = new Scanner(System.in);
            holdername = n.nextLine();
            System.out.println("Enter your id");
            Scanner i = new Scanner(System.in);
            id = i.nextLine();
            System.out.println("Enter your password");
            Scanner p = new Scanner(System.in);
            password = p.nextLine(); 
            System.out.println("Enter your amount");
            Scanner m = new Scanner(System.in);
            amount = m.nextInt();
            accountno="976546848484";
            System.out.println("your account no is = "+accountno);
           break;
        case 2:
            System.out.println("Enter your id");
            Scanner s = new Scanner(System.in);
            lid = s.nextLine();
            System.out.println("Enter your password");
            Scanner d = new Scanner(System.in);
            lpassword = d.nextLine();
            if( lid.equals(id) && lpassword.equals(password))
            {
                System.out.println("login successfull");
            }
             else
            {
                System.out.println("please enter valid username and password");
            }   
            break;
        case 3:
            if(holdername==(null)&&id==(null)&&accountno==(null)&&amount==(0))
            {
            System.out.println("please login first");
            }
            else{
            System.out.println("Account holder Name:"+holdername);
            System.out.println("User id:"+id);
            System.out.println("Account no:"+accountno);
            System.out.println("Bank balance:"+amount);
                    }
            break;
        case 4:
            System.out.println("Enter receiver's account holder name ");
            Scanner o = new Scanner(System.in);
            o.nextLine();
            System.out.println("Enter receiver's account no");
            Scanner r = new Scanner(System.in);
            r.nextInt();
            System.out.println("Enter the money to transfer");
            Scanner j = new Scanner(System.in);
            money = j.nextInt();
            if(money<=amount)    
            {
               int total = amount - money;
               System.out.println("transfer successfull");
               System.out.println("your debited amount is :"+total);               
            } 
            else
            {
                System.out.println("transfer unsuccessfull");
            }
        break;
        case 5:
            System.out.println("Please Enter amount to create FD");
            Scanner fd = new Scanner(System.in);
            FDamount = fd.nextInt();
            if(FDamount<=amount)
            {
                int deposite = amount-FDamount;
                System.out.println("Your FD was successfull");
                System.out.println("your FD amount is :"+FDamount);
            }
            else
            {       
                System.out.println("Your FD was unsuccessfull");
            }
            break;
        case 6:
            System.out.println("Are you sure you want to logout??y/n");
            Scanner y = new Scanner(System.in);
            logout = y.nextLine();
            if(logout.equals("y"))
            {
            holdername="";
            id="";
            accountno="";
            amount=0;
            System.out.println("Logged out successfully!!");
                 }
            break;
        case 7:
            if(choice == 7)
            {
                java.lang.System.exit(test5.a);   
            }
            default:          
    }  
        }
        while(choice != 7);
}
}
