package tetianavitk;

import java.util.Arrays;

public class Lesson1 {
	public static void main(String[] args) {
		byte k = 1;
		short b = 2;
		int c = 20;
		long d = 30L;
		float t = 1.05F;
		double r = 1.5;
		boolean q = true;
		char j = 'j';

		///////////////////////////////////////
		///////////////////////////////////////

		System.out.println("max value for byte is " + Byte.MAX_VALUE);
		System.out.println("min value for byte is " + Byte.MIN_VALUE);
		System.out.println();
		System.out.println("max value for short is " + Short.MAX_VALUE);
		System.out.println("min value for short is " + Short.MIN_VALUE);
		System.out.println();
		System.out.println("max value for int is " + Integer.MAX_VALUE);
		System.out.println("min value for int is " + Integer.MIN_VALUE);
		System.out.println();
		System.out.println("max value for long is " + Long.MAX_VALUE);
		System.out.println("min value for long is " + Long.MIN_VALUE);
		System.err.println();
		System.out.println("max value for float is " + Float.MAX_VALUE);
		System.out.println("min value for float is " + Float.MIN_VALUE);
		System.out.println();
		System.out.println("max value for double is " + Double.MAX_VALUE);
		System.out.println("min value for double is " + Double.MIN_VALUE);
		System.out.println();

		//////////////////////////////////////

		int a = 10;
		int[] topArray = new int[10];
		for (int i = 0; i < topArray.length; i++) {
			topArray[i] = a++;
		}
		int max = topArray[0];
		int min = topArray[0];

		for (int i = 0; i < topArray.length; i++) {
			if (topArray[i] > max) {
				max = topArray[i];
			}
		}

		for (int i = 0; i < topArray.length; i++) {
			if (topArray[i] < min) {
				min = topArray[i];
			}
		}
		System.out.println(Arrays.toString(topArray));
		System.out.println("Max value is " + max);
		System.out.println("Min value is " + min);
	}
}