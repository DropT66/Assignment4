import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Timer;

public class Driver <T>
{
	Car aCar;
	static String startTime = null;
	static String endTime = null;
	String date = null;
	static SimpleDateFormat dateF = new SimpleDateFormat("HH:mm:ss");

	

	
	public static void main(String[] args) 
	{
		Queue <Car> northLane = new Queue <Car> (); 
		Queue <Car> southLane = new Queue <Car> (); 
		Queue <Car> eastLane = new Queue <Car> ();  
		Queue <Car> westLane = new Queue <Car> ();
		Car nCar = null;
		Car sCar = null;
		Car eCar = null;
		Car wCar = null;
		Random rand = new Random();
		startTime = dateF.format(Calendar.getInstance().getTime());
		System.out.println(startTime);
		Runnable r1 = new threadClass<Object>(northLane, rand.nextInt(10)+1);
		Thread t1 = new Thread(r1);
		Runnable r2 = new threadClass<Object>(southLane, rand.nextInt(10)+1);
		Thread t2 = new Thread(r2);
		Runnable r3 = new threadClass<Object>(eastLane, rand.nextInt(10)+1);
		Thread t3 = new Thread(r3);
		Runnable r4 = new threadClass<Object>(westLane, rand.nextInt(10)+1);
		Thread t4 = new Thread(r4);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
//		try {
//			northLane.dequeue();
//		} catch (QueueUnderFlowException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		try {
//			southLane.dequeue();
//		} catch (QueueUnderFlowException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		try {
//			eastLane.dequeue();
//		} catch (QueueUnderFlowException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		
//		try {
//			westLane.dequeue();
//		} catch (QueueUnderFlowException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		System.out.println("North Lane");
		northLane.display();
		System.out.println("South Lane");
		southLane.display();
		System.out.println("East Lane");
		eastLane.display();
		System.out.println("West Lane");
		westLane.display();
		System.out.println("---------------------------");
		
		nCar = northLane.getHead();
		String n =nCar.getArrivalTime();
		sCar = southLane.getHead();
		String s = sCar.getArrivalTime();
		eCar = eastLane.getHead();
		String e = eCar.getArrivalTime();
		wCar = westLane.getHead();
		String w =wCar.getArrivalTime();
		
		System.out.println(n);
		System.out.println(s);
		System.out.println(e);
		System.out.println(w);


		
	}
	
//	public static void perform()
//	{
//
//	}
//	
//	int counter = 0;
//	public void carArrival()
//	{
//		Random laneSelect = new Random();	
//		int lane = laneSelect.nextInt(4)+1;
//		
//		date = dateF.format(Calendar.getInstance().getTime());
//		
//		counter++;
//		aCar = new Car(counter, date);
//		
//		switch(lane)
//		{
//			case 1:
//			{
//				northLane.enqueue(aCar);
//				break;
//			}
//			case 2:
//			{
//				eastLane.enqueue(aCar);
//				break;
//			}
//			case 3:
//			{
//				southLane.enqueue(aCar);
//				break;
//			}
//			case 4:
//			{
//				westLane.enqueue(aCar);
//				break;
//			}
//		}
//		display();	
////		if(counter == 10)
////		{
////			display();
////		}
//	}
//	
//	public void display()
//	{	
//		System.out.println("North Lane");
//		northLane.display();
//		System.out.println("South Lane");
//		southLane.display();
//		System.out.println("East Lane");
//		eastLane.display();
//		System.out.println("West Lane");
//		westLane.display();
//		System.out.println("---------------------------");
//	}
//	
//	long diffIncrease = 0;
//	public void compare()
//	{
//			Date start = null;
//			try {
//				start = dateF.parse(startTime);
//			} catch (ParseException e1) {
//				e1.printStackTrace();
//			}
//			Date northTime = null;
//			Date southTime = null;
//			Date eastTime = null;
//			Date westTime = null;
//			String defaultTime = "00:00:00";
//
//			if(!northLane.isEmpty())
//			{
//				nCar = northLane.getHead();
//				System.out.println(nCar.getArrivalTime());
//				try {
//					northTime = dateF.parse(nCar.getArrivalTime());
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//			}
//			else
//			{
//				try {
//					northTime = dateF.parse(defaultTime);
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			if(!southLane.isEmpty())
//			{
//				sCar = southLane.getHead();
//				System.out.println(sCar.getArrivalTime());
//				try {
//					southTime = dateF.parse(sCar.getArrivalTime());
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//			}
//			else
//			{
//				try {
//					southTime = dateF.parse(defaultTime);
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			if(!eastLane.isEmpty())
//			{
//				eCar = eastLane.getHead();
//				System.out.println(eCar.getArrivalTime());
//				try {
//					eastTime = dateF.parse(eCar.getArrivalTime());
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//			}
//			else
//			{
//				try {
//					eastTime = dateF.parse(defaultTime);
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//			}
//			
//			if(!westLane.isEmpty())
//			{
//				wCar = westLane.getHead();
//				System.out.println(wCar.getArrivalTime());
//				try {
//					westTime = dateF.parse(wCar.getArrivalTime());
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//			}
//			else
//			{
//				try {
//					westTime = dateF.parse(defaultTime);
//				} catch (ParseException e) {
//					e.printStackTrace();
//				}
//			}
//
//			long northDiff = northTime.getTime() - start.getTime();
//			long southDiff = southTime.getTime() - start.getTime();
//			long eastDiff = eastTime.getTime() - start.getTime();
//			long westDiff = westTime.getTime() - start.getTime();
//			
//			diffIncrease += 1000;
//			
//			String currentTime = dateF.format(Calendar.getInstance().getTime());
//		
//			if(northDiff == diffIncrease)
//			{
//				System.out.println("nTest");
//				try {
//					nCar.setWaitTime(currentTime);
//					System.out.println(nCar);
//					northLane.dequeue();
//				} catch (QueueUnderFlowException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(southDiff == diffIncrease)
//			{
//				System.out.println("sTest");
//				try {
//					sCar.setWaitTime(currentTime);
//					System.out.println(sCar);
//					southLane.dequeue();
//				} catch (QueueUnderFlowException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(eastDiff == diffIncrease)
//			{
//				System.out.println("eTest");
//				try {
//					eCar.setWaitTime(currentTime);
//					System.out.println(eCar);
//					eastLane.dequeue();
//				} catch (QueueUnderFlowException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(westDiff == diffIncrease)
//			{
//				System.out.println("wTest");
//				try {
//					wCar.setWaitTime(currentTime);
//					System.out.println(wCar);
//					westLane.dequeue();
//				} catch (QueueUnderFlowException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//				
//
//		
//		display();

//	}
}
