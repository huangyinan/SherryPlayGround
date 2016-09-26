package pair1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestContainer {

	private static Logger logger = LoggerFactory.getLogger(TestContainer.class);

	static Collection<String> testList = new ArrayList<>(Arrays.asList("i love you".split(" ")));
	static Map<Integer, String> testMap = new HashMap<Integer, String>();

	public static void main(String[] args) {
		testMap.put(1, "I");
		testMap.put(2, "love");
		testMap.put(3, "you");

		logger.debug(testMap.toString());
		logger.info(testList.toString());

		logger.debug("Using Iterable Interface");
		for (String str : testList) {
			logger.debug(str);
		}

		logger.debug("Geting the values collection of a Map");
		Collection<String> mapValues = testMap.values();
		for (String str : mapValues) {
			logger.debug(str);
		}

		logger.debug("Geting the Iterator of a collection");
		Iterator<String> i = mapValues.iterator();
		while (i.hasNext()) {
			logger.debug(i.next());
		}
	}
}
