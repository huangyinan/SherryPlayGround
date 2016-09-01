/**
 * 
 */
package interfacePackage;

/**
 * @author SSI
 *
 */
public class ClassB extends AbstractA implements IB {

	/*
	 * (non-Javadoc)
	 * 
	 * @see interfacePackage.IB#FB()
	 */

	private static String name = "ClassB";

	@Override
	public void FB() {
		// TODO Auto-generated method stub
		System.out.println(name);

	}

}
