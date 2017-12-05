package me.puppy0cam.examples.timedRandomness;

public class TimedRandomizer {
	protected final static long startTime = System.currentTimeMillis();
	public TimedRandomizer() {
	}
	public static long lazyChances(int max) {
		long time = System.currentTimeMillis()-startTime;
		if(time==0) {
			return (long) 0;
		}
		
		long toast = time/max;
		int val = (int) (time-(max*Math.floor(toast)));
		return (long) (val);
	}
}
