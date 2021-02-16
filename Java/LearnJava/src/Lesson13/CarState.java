package Lesson13;

public enum CarState {

	DRIVING, WAITING, PARKING;
	
	public static CarState from(String state) throws Exception {
		
		switch(state) {
		case "DRIVING":
			return DRIVING;
		case "WAITING":
			return WAITING;
		case "PARKING":
			return PARKING;
		default: 
			throw new Exception();
			
				
		}
	}
	
	public static int test(int a, int b) {
		System.out.println(a + b);
		return a+b;
		
		
	}
}
