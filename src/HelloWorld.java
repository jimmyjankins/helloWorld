import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class HelloWorld {

	public static void main(String[] args) {
		final Logger log4j = LogManager.getLogger(HelloWorld.class 
		        .getName());
		System.out.println("Hello world!");
		log4j.trace("This is a trace message."); 
		log4j.debug("This is  a debug message."); 
		log4j.info("This is an info message."); 
		log4j.error("This is an error message");
	}

}
