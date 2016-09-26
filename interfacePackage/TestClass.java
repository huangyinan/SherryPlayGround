/**
 * 
 */
package interfacePackage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author huangyinan
 *
 */
public class TestClass {

	private static Logger logger = LoggerFactory.getLogger(TestClass.class);
	Integer t;
	Integer oldT;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB testB = new ClassB();
		testB.FB();
		testB.FA();

		ClassC testC = new ClassC();
		testC.FC();
		testC.FA();

		logger.info("Hello World");
		logger.debug("Hello World");

	}

	public void setTemperature(Integer temperature) {
		oldT = t;
		t = temperature;

		logger.debug("Temperature set to {}. Old temperature was {}.", t, oldT);

		if (temperature.intValue() > 50) {
			logger.info("Temperature has risen above 50 degrees.");
		}
	}

}
