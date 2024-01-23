package simpleTimer;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		boolean x = true;
		long displayMinutes=0;
		long startTime = System.currentTimeMillis();
		System.out.println("Timer: ");
		
		while(x) {
			TimeUnit.SECONDS.sleep(1);
			 long timePassed = System.currentTimeMillis() - startTime;
			 long secondsPassed = timePassed/1000;
			 if(secondsPassed == 60) {
				 secondsPassed = 0;
				 startTime = System.currentTimeMillis();
			 }
			 if((secondsPassed % 60) == 0) {
				 displayMinutes++;
			 }
		System.out.println(displayMinutes + ": : " + secondsPassed);
		}
		
		
		
	}

}
