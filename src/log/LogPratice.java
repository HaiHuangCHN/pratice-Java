package log;

import java.util.logging.*;

public class LogPratice {

	private static final Logger logger = Logger.getLogger(LogPratice.class.getName());
	
	public static void main(String[] args) {

		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			public void uncaughtException(Thread t, Throwable e) {
				logger.log(Level.SEVERE, t + " LogPratice threw an exception: ", e);
				logger.log(Level.WARNING, "One way");// Practice "Level"
				logger.warning("Another way");
			};
		});
		class adminThread implements Runnable {
			public void run() {
				throw new RuntimeException();
			}
		}
		Thread t = new Thread(new adminThread());
		t.start();
	}
}