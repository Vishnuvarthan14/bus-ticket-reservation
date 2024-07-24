package busticketreservation.java;

public class busdetails {
	private int busno;
	private boolean ac;
	private int capacity;
	busdetails (int busno,boolean ac,int capacity){
		this.busno=busno;
		this.ac=ac;
		this.capacity=capacity;
	}
	int getcapacity()
	{
		return capacity;
	}
	void setcapacity(int cap)
	{
		capacity=cap;
	}
	boolean getac()
	{
		return ac;
	}
	void setac(boolean aci)
	{
		ac=aci;
	}
	int getbusno()
	{
		return busno;
	}
	void displaydetails()
	{
		System.out.println("bus no "+busno+"   ac "+ac+"   capacity "+capacity);
	}
}
