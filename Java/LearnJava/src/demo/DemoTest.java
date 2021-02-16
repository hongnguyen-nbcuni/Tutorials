package demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class DemoTest {

	private byte myByte;
	private short myShort;
	private int myInt;
	private long myLong;
	private float myFloat;
	private double myDouble;
	private Object myObject = null;
	
	private boolean myBoolean = false;
	private char myChar;
	
	@Test
	public void shouldDemonstrateStaticImport() {
		assertTrue(true);
		
	}
	
	@Test
	public void shouldDemonstrateDataTypeDefaultValues() {
		System.out.println("byte default value: " + myByte);				// 0
		System.out.println("short default value: " + myShort);				// 0
		System.out.println("int default value: " + myInt);					// 0
		System.out.println("long default value: " + myLong);				// 0
		System.out.println("float default value: " + myFloat);				// 0.0
		System.out.println("double default value: " + myDouble);			// 0.0
		System.out.println("Object default value: " + myObject);			// null
		System.out.println("boolean default value: " + myBoolean);  		// false
		System.out.println("char default value: " + myChar);                // blank
		System.out.println("char default value as int: " + (int) myChar);	// 0
		
	}
	
	@Test
	public void shoulDemonstrateNumberObjects() {
		float myFloat = 43.31F;
		short myShort = 43;
		long myLong = 43;
		
		Byte b = Byte.valueOf(myByte);               // 0
		System.out.println(b);
		
		Boolean b2 = Boolean.TRUE;
		Boolean b3 = Boolean.FALSE.booleanValue();    // internally compiler does this for you	
		
	}
	
	@Test
	public void shouldDemonstrateRanges() {
		System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);		// -128 to 127
		System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);		// -32768 to 32767
		System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);	// -2147483648 to 2147483647
		System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);		// -9223372036854775808 to 9223372036854775807
		System.out.println("float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);		// 1.4E-45 to 3.4028235E38
		System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);	// 4.9E-324 to 1.7976931348623157E308
		System.out.println("char: " + (int) Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE); // 0 to 65535	
		
	}
	

}
