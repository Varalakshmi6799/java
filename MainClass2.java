class Demo2
{
 int y=20;
 void dis()
{
System.out.println("running test() method");
}
}
class MainClass2
{
public static void main(String[] args)
{
System.out.println("main method started");
System.out.println("y value is "+new Demo2().y);
new Demo2().dis();
System.out.println("main method ended"); 
}
}