import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class threadClass<T> implements Runnable 
{
	Driver <T> main = new Driver <T> ();
	Random time = new Random();
	Queue <Car> aQueue;
	int amount;
	Car aCar;
	SimpleDateFormat dateF = new SimpleDateFormat("HH:mm:ss");
	
	public threadClass(Queue <Car> aQueue, int amount)
	{
		this.aQueue = aQueue;
		this.amount = amount;
	}
	
	public void run()
	{
		try {
			Thread.sleep(time.nextInt(10000)+1000);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		for(int i = 0; i < amount; i++)
		{
			aCar = new Car(i, dateF.format(Calendar.getInstance().getTime()));
			try {
				Thread.sleep(time.nextInt(10000)+1000);
			} catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
			}
			this.aQueue.enqueue(aCar);
		}
	}
}
