package busticketreservation.java;
import java.util.Scanner;
import java.util.ArrayList;
public class main {
	public static void main(String[] args)
	{
		ArrayList<busdetails> busses=new ArrayList<busdetails>();
		ArrayList<passengerdetails> booking=new ArrayList<passengerdetails>();
		busses.add(new busdetails(1,true,4));
		busses.add(new busdetails(2,false,3));
		busses.add(new busdetails(3,true,4));
		for(busdetails b:busses) {
			b.displaydetails();
		}
		Scanner sc=new Scanner(System.in);
		int choise=1;
		while(choise==1)
		{
			System.out.print("enter 1 to book /n enter 2 to exit");
			choise=sc.nextInt();
			if(choise==1)
			{
				passengerdetails Booking=new passengerdetails();
				if(Booking.isavailable(booking,busses))
				{
					booking.add(Booking);
					System.out.println("your booking is confirmed.");
				}
				else
				{
					System.out.println("sorry not available");
				}
			}
		}
		
	}
}
