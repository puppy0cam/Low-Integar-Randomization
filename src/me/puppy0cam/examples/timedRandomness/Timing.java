package me.puppy0cam.examples.timedRandomness;
import java.util.Timer;
import java.util.TimerTask;
public class Timing {
	public static Timer timer;
	public static Saver saver;
	public static void main(String[] args) {
		saver = new Saver("log.puppy.txt");
	    TimerTask task = new TimerTask() {
	      @Override
	      public void run() {
	        saver.add(TimedRandomizer.lazyChances((int) Math.floor((int) ((Math.random()*10000)+1))));
	      }
	    };
	    timer = new Timer();
	    long delay = 1;
	    long intevalPeriod = 1; 
	    // schedules the task to be run in an interval 
	    timer.scheduleAtFixedRate(task, delay,intevalPeriod);
	  } // end of main
	public static void onDisable() {
		timer.cancel();
		saver.onDisable();
	}
}
