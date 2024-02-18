import java.util.*;
abstract class Vehicle
{
 boolean hashelmet;
 int yom;
 abstract void getData();
 abstract void putData();
 Vehicle(boolean h,int n)
 {
 hashelmet=h;
 yom=n;
 }
}
class TwoWheeler extends Vehicle
{ 
 private String Brand;
 protected int Cost;
 String EngineType;
 public String Color;
 TwoWheeler(int n)
 
 {
 super(true,n);
 }
 void getData()
 { 
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter Brand name,Cost,EngineType and Colour");
 Brand=sc.next();
 Cost=sc.nextInt();
 EngineType=sc.next();
 Color=sc.next();
 }
 void putData()
 {
 System.out.println("Brand:"+Brand+"\nCost:"+Cost+"\n EngineType:"
 +EngineType+"\nColor:"+Color+" \nYear of Manufacture:"+yom+"\nHas helmet:"+hashelmet);
 }
}
final class FourWheeler extends Vehicle
{
 FourWheeler(int n)
 {
 super(false,n);
 }
 void getData()
 {
 }
 void putData()
 {
 System.out.println("Year of Manufacture:"+yom+"\nHas helmet:"+hashelmet);
 }
}
class MyTwoWheeler extends TwoWheeler
{
 String name;
 MyTwoWheeler(String name,int n)
 {
 super(n);
 this.name=name;
 }
 void display()
 { 
 super.getData();
 putData();
 System.out.println("Name:"+name);
 }
}
public class Vehicle_Main 
{
 public static void main(String[] args)
 {
 /*Vehicle v=new Vehicle();
 Cannot Create instance of an abstract class*/
 TwoWheeler t1=new TwoWheeler(1995);
 FourWheeler f1=new FourWheeler(2006);
 t1.getData();
 t1.putData();
 f1.putData();
 }
}
