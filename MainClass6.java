class OnlineBooking
{
    int totaltickets=100;
    void buytickets(int n)
    {
      System.out.println("buying "+n+" tickets" );
       if(n<=totaltickets)
       {
        totaltickets = totaltickets-n;
        System.out.println("buying ticket sucess");
        }
        else
        {
            System.out.println("ticket is no availabel");
        }
    }
    void cancelation(int n)
    {
        System.out.println("cancelling "+n+" "tickets);
        totaltickets = totaltickets+n;

    }
    void viewAvailableTickets()
    {
        System.out.println("total tickets availabel"+totaltickets);

    }
}
class MainClass6
{
    public static void main (String[] args)
    {
        System.out.println("main started");
        OnlineBooking o1=new OnlineBooking();
        o1.viewAvailableTickets();
        o1.buytickets(n:100);
        o1.viewAvailableTickets();
        o1.canceltickets(n:5);
        o1.viewAvailableTickets();
        System.out.println("main ended");
    }
}