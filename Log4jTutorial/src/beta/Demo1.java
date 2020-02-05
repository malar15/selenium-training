package beta;
import org.apache.logging.log4j.*;

public class Demo1 {
    static Logger log=LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("Debugging");
		log.info("Just FYI");
		log.error("Error message");

		log.fatal("Fatal Error");
	}

}
