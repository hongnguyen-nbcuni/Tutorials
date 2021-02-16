package Lesson10;

public enum LoggingLevel {

	/*
	PENDING,
	PROCESSING, 
	PROCESSED;
	*/
	// or
	
	PENDING(1),          // this will call a constructor below
	PROCESSING(2),
	PROCESSED(3);
	
	private int i;
	
	private LoggingLevel(int i) {
		this.i = i;
	}
	
	public int code() {
		return i;
	}
	
}

