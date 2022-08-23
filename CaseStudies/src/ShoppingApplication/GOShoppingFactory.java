/**
 * 
 */
package ShoppingApplication;

import ShoppingFrameWork.NormalAccount;
import ShoppingFrameWork.PrimeAccount;
import ShoppingFrameWork.ShopFactory;

/**
 * @author Rohith
 *
 */
public abstract class GOShoppingFactory implements ShopFactory {

	@Override
	public PrimeAccount getNewPrimeAccount(int accountNumber, String accountName, float charges, boolean isPrime) {
		// TODO Auto-generated method stub
		PrimeAccount primeAccount=new GSPrimeAccount(accountNumber, accountName, charges, isPrime, charges) {}
		;
		return primeAccount;
	}

	@Override
	public NormalAccount getNewNormalAccount(int accountNumber, String accountName, float charges,
			float deliveryCharges) {
		// TODO Auto-generated method stub
		NormalAccount normalAccount=new GSNormalAccount(accountNumber,accountName,charges,deliveryCharges);
		return normalAccount;
	}

	@Override
	public String toString() {
		return "GOShoppingFactory [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	

}
