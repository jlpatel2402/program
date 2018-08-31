package test;
interface J{
  void setId(int temp);  
  void setname(String temp);
int getID();
String getname();
}
class testintface implements J{
String name;
int id;
@Override
public void setId(int temp){
    id=temp;
}
@Override
public void setname(String temp){
    name=temp;
}
@Override
public int getID(){
    return id;
}
@Override
public String getname(){
    return name;
}
    }
class testintface1 implements J {
String name;
int id;
@Override
public void setId(int temp){
    id=temp;
}
@Override
public void setname(String temp){
    name=temp;
}
@Override
public int getID(){
    return id;
}
@Override
public String getname(){
    return name;
}
    } 
class run{
   void savedata(J z){
   System.out.println(z.getID());
   System.out.println(z.getname());
   }  
   public static void main(String[] args){
   J u=new testintface();
   u.getID();
   u.getname();
   u.setId(100);
   u.setname("jaimin");
   J t=new testintface1();
   t.getID();
   t.getname();
   t.setId(100);
   t.setname("jaimin"); 
   run r=new run();
   r.savedata(u);
   r.savedata(t);
}
}
