package alpha;
import org.apache.logging.log4j.*;

public class Demo {
    static Logger log=LogManager.getLogger(Demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("Debugging");
		log.info("Just FYI");
		log.error("Error message");

		log.fatal("Fatal Error");
	}

}
