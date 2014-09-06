package p2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class TestLogger2 {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestLogger2.class);

	public static void main(String[] args) {
		LOGGER.debug("TestLogger2 -> DEBUG log");
		LOGGER.info("TestLogger2 -> INFO log");
	}

}
