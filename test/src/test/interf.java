package test;
interface A{
    void login();
    void logout();
    void transfer();
    void fd();
    void viewdetail();
    void createaccount();
}
abstract class hide implements A{
    @Override
    public void viewdetail() {
        System.out.println("viewdetail");    
    }    
}
abstract public class interf extends hide{
    @Override
    public void login() {
        System.out.println("login");
    }
    @Override
    public void logout(){
    System.out.println("logout");
    }
    @Override
    public void transfer(){
    System.out.println("transfer");
    }
    @Override
    public void fd(){
    System.out.println("fd");
    }
    @Override
    public void createaccount(){
    System.out.println("create account");
    }
    public static void main(String[] args){
    interf h=new interf() {} ;
    h.login();
    }
}
