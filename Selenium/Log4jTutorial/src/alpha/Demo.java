package alpha;

import org.apache.logging.log4j.*;


public class Demo {

	// need to write the path of this class, 
	private static Logger log = LogManager.getLogger(Demo.class.getName()); // get the entire path of Demo.class


	public static void main(String[] args) {

		// inject test cases
		log.debug("I'm debugging");	


		// default configuration will not print these
		log.debug("Clicked on button");
		log.info("Button is displayed");

		// default configuration will only print error & fatal messages
		log.error("Button is not displayed");
		log.fatal("Button is missing");


	}

}
