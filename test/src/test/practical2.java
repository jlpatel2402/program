package test;
import java.util.Scanner;
public class practical2 {
 public static void main(String[] args){
     double rwidth,rlength,twidth,tlength;
     
     System.out.println("Enter the Area of Room :");
     System.out.println("Room Width:");
     Scanner rw = new Scanner(System.in);
     rwidth = rw.nextDouble();
     System.out.println("Room length:");
     Scanner rl = new Scanner(System.in);
     rlength= rl.nextDouble();
     double rtotal = rwidth*rlength;
     System.out.println("Total Area of room is :"+rtotal);
     System.out.println("Enter the Size of one Tile :");
     System.out.println("Tile Width:");
     Scanner tw = new Scanner(System.in);
     twidth = tw.nextDouble();
     System.out.println("Tile length:");
     Scanner tl = new Scanner(System.in);
     tlength= tl.nextDouble();
     double ttotal = twidth*tlength;
     System.out.println("Total Size of Tile is :"+ttotal);
     double ans = rtotal/ttotal;
     System.out.print("Total no of Tiles Requierd for the Room is:"+ans);
     
 }   
}
