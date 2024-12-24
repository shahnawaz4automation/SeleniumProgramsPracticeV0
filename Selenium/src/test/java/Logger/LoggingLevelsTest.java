package Logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.Practice.Selenium112024.TestExample;

public class LoggingLevelsTest {
	private static final Logger logger = LogManager.getLogger(TestExample.class);

	public static void main(String[] args) {
		logger.trace("trace");
		logger.debug("debug");
		logger.info("info");
		logger.warn("warn");
		logger.error("error");
		logger.fatal("fatal");
		System.out.println("Exit the program");
	}
}
