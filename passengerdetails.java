package busticketreservation.java;
import java.util.*;
import java.text.*;
public class passengerdetails {
String passenger_name;
int busno;
Date date;
Scanner sc=new Scanner(System.in);
passengerdetails(){
	System.out.print("Please enter your name:");
	passenger_name=sc.next();
	System.out.print("enter the bus number:");
	busno=sc.nextInt();
	System.out.print("enter the date (DD-MM-YYYY):");
	String indate=sc.next();
	SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyy");
	try {
		date=dateformat.parse(indate);
	} catch (ParseException e) 
	{
		e.printStackTrace();
	}
}
	public boolean isavailable(ArrayList<passengerdetails> booking,ArrayList<busdetails> busses) {
	int capacity=0;
		for(busdetails bus:busses)
	{
		if(bus.getbusno()==busno)
		{
			capacity=bus.getcapacity();
		}
	}
		int booked=0;
		for(passengerdetails book:booking)
		{
			if(book.busno==busno&&book.date.equals(date))
				booked++;
		}
		return booked<capacity?true:false;
	}

}
