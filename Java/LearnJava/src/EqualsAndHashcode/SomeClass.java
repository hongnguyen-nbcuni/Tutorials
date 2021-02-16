package EqualsAndHashcode;

public class SomeClass {

	private byte myByte;
	private short myShort;
	private int myInt;
	private long myLong;
	private float myFloat;
	private double myDouble;
	private boolean myBoolean;
	private String myString;
	private char myChar;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		// 
		if (getClass() != obj.getClass()) {
			return false;
		}
		SomeClass other = (SomeClass) obj;
		
		if (myByte != other.myByte) {
			return false;
		}
		if (myShort != other.myShort) {
			return false;
		}
		if (myInt != other.myInt) {
			return false;
		}
		if (myLong != other.myLong) {
			return false;
		}
		if (Float.floatToIntBits(myFloat) != Float.floatToIntBits(other.myFloat)) {
			return false;
		}
		if (Double.doubleToLongBits(myFloat) != Double.doubleToLongBits(other.myFloat)) {
			return false;
		}
		if (myBoolean != other.myBoolean) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int hashCode() {
		int result = 1;
		
		result = 31 * result + myByte;
		result = 31 * result + myShort;
		result = 31 * result + myInt;
		
		result = 31 * result + (int) (myLong ^ (myLong >>> 32));
		result = 31 * result + Float.floatToIntBits(myFloat);
		
		long temp = Double.doubleToLongBits(myDouble);
		result = 31 * result + (int) (temp ^ (temp >>> 32));
		
		result = 31 * result + (myBoolean ? 1231 : 1237);
		result = 31 * result + myChar;
		
		return 31 * result + myString.hashCode();		
		
		
	}
	
	
}
