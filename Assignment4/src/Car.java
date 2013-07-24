import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Car 
{
	private int carID;
	private String arrivalTime;
	private String waitTime;
	static SimpleDateFormat dateF = new SimpleDateFormat("HH:mm:ss");
	
	public Car(int carID, String arrivalTime) 
	{
		this.carID = carID;
		this.arrivalTime = arrivalTime;
	}
	
	public int getCarID() 
	{
		return carID;
	}
	
	public void setCarID(int carID) 
	{
		this.carID = carID;
	}
	
	public String getArrivalTime() 
	{
		return arrivalTime;
	}
	
	public void setArrivalTime(String arrivalTime) 
	{
		this.arrivalTime = arrivalTime;
	}
	
	public String getWaitTime() 
	{
		return waitTime;
	}
	
	public void setWaitTime(String currentTime) 
	{
//		Date current = null;
//		Date arrival = null;
//		try 
//		{
//			current = dateF.parse(currentTime);
//			arrival = dateF.parse(this.arrivalTime);
//		} 
//		catch (ParseException e) 
//		{
//			e.printStackTrace();
//		}
//		
//		this.waitTime = current.getTime() - arrival.getTime();
		this.waitTime = currentTime;
	}
	
	@Override
	public String toString() 
	{
	return "Car [carID = " + carID + ", Arrival Time = " + arrivalTime
	+ ", Wait Time = " + waitTime + "]";
	}
}
