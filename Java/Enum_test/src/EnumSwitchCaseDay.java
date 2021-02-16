
public class EnumSwitchCaseDay {

	  public static void main(String[] args)
	  {
	    // loop through the enum values, calling the
	    // print method once for each value
		  
	    for (Day d: Day.values())
	    {
	      System.out.println(d.toString());
	      printTodaysThought(d);
	    }
	  }

	  // a method that prints a String corresponding to the day value
	  // that is passed in.
	  public static void printTodaysThought(Day theDay)
	  {
	    switch (theDay)
	    {
	      case MONDAY:
	      case TUESDAY:
	      case WEDNESDAY:
	      case THURSDAY:  
	    	  System.out.println("Working day :)");
	          break;

	      case FRIDAY:    
	    	  System.out.println("TGIF ");
	          break;

	      case SATURDAY:
	      case SUNDAY:    
	    	  System.out.println("Ahh, the weekend ...");
	          break;

	      default:        
	    	  System.out.println("What day is it?");;
	    }
	  }
	}

	enum Day
	{
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
	}
	

