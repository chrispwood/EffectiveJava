
public class Autoboxing {

	public static void main(String args[]) {
		long startTime = System.currentTimeMillis();

		Long sum = 0L;
		for(long i=0; i<=Integer.MAX_VALUE; i++) {
			sum += i;
		}
		System.out.println(sum);
		long endTime = System.currentTimeMillis();
		long timeDiff = endTime - startTime;
		float seconds = timeDiff / 1000F;
		System.out.println("Autoboxing Time Diff in seconds: " + seconds);

		startTime = System.currentTimeMillis();
		long primitiveSum = 0L;
		for(long i=0; i<=Integer.MAX_VALUE; i++) {
			primitiveSum += i;
		}
		endTime = System.currentTimeMillis();
		timeDiff = endTime - startTime;
		seconds = timeDiff / 1000F;
		System.out.println("Primitive Time Diff in seconds: " + seconds);

	}
}