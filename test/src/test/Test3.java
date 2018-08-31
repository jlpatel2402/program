package test;
class parent{
    
}
class sub extends parent{
    
}
public class Test3{
    void cal(parent name){
        System.out.println("string-args");
    }
    void cal(sub o){
        System.out.println("object0args");
    }
    public static void main(String[] args)
    {
        parent p=new parent();
        Test3 t=new Test3();
        t.cal(p);
    }
}
