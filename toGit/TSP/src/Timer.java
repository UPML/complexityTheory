/**
 * General class to time tasks
 */
public class Timer {
	long start;
	long stop;
	public final static String[] units = { "μs", "ms", "s", "ks", "Ms" };

	/**
	 * Start the timer
	 */
	public void start() {
		start = System.nanoTime();
	}

	/**
	 * Stop the timer
	 */
	public void stop() {
		stop = System.nanoTime();
	}

	/**
	 * Get the time elapsed in nanoseconds
	 *
	 * @return Time in nanoseconds
	 */
	public long getTime() {
		return stop - start;
	}
}
