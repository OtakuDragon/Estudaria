package p1;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestLogger1 {
	
	private static final Logger LOGGER = LoggerFactory.getLogger("p1.TestLogger1");

	public static void main(String[] args) {
		LOGGER.debug("TestLogger1 -> DEBUG log");
		LOGGER.info("TestLogger1 -> INFO log");
	}
}
