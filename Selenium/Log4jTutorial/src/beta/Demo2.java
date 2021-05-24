package beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo2 {

	
	// need to write the path of this class, 
	private static Logger log = LogManager.getLogger(Demo2.class.getName()); // get the entire path of Demo.class


	public static void main(String[] args) {

		log.debug("I'm debugging");	


		// default configuration will not print these
		log.debug("debug: object is present");
		log.info("info: object is present");

		// default configuration will only print error & fatal messages
		log.error("error: object is not present");
		log.fatal("fatal: this is fatal");


	}


}
