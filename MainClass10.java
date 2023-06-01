Class Demo3
{
int y=20;
    static void test();
    {
    System.out.println("running test() method");

    }
    void disp()
    {
    System.out.println("running  disp() method");
    }
}
CLass MainClass10
{
public static void main(String[] args)
    {
    System.out.println("main method started")
    System.out.println("y value is :"+new Demo().y);
    Demo3.test();
    new Demo3().disp();
    System.out.println("main method ended"); 
    }   
}