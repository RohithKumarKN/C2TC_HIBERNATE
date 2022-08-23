/**
 * 
 */
package ShoppingClient;

import ShoppingApplication.GOShoppingFactory;
import ShoppingApplication.GSNormalAccount;
import ShoppingApplication.GSPrimeAccount;

/**
 * @author Rohith
 *
 */
public class Client {

	/**
	 * 
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GOShoppingFactory obj = new GOShoppingFactory() {
		};
//Prime Account Creation
		GSPrimeAccount rohith = (GSPrimeAccount) obj.getNewPrimeAccount(123, "Rohith", 500.0f, true);
		rohith.bookProduct(rohith.getCharges());
//Normal Account Creation
		GSNormalAccount kumar = (GSNormalAccount) obj.getNewNormalAccount(121, "Kumar", 550.0f, 050.f);
		kumar.bookProduct(kumar.getCharges());
	}

}
