package com.hello.varibles;

public class Variables {
// Int, long, short,byte 
	public static void main(String[] args) {
		System.out.println("Hellow");
		int myFirstNumber = 0;
		int mySecondNumber = 2_147_483_647;
		// Integer is the datatype -2.47b <-> 2.47b
		System.out.println(myFirstNumber);

		byte myByteValue = 10;

		// byte datatype -128 -> 127

		short myshortType = 32767;
		// short is -32768 to 32767

		// long has a with of 2^64
		long mylongValue = 100l;

		System.out.println(mySecondNumber);
		
		byte mybite = 10;
		short myShort = 20;
		int myInt = 50;
		long myLong = 50000 +10*(mybite+myShort+myInt);
		// magic here is mybite and myShort and myInt are automatcally converted to Long '
		System.out.println("Calculated value " +myLong);

	}
}
