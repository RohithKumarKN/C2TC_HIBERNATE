/**
 * 
 */
package ShoppingApplication;

import ShoppingFrameWork.PrimeAccount;

/**
 * @author Rohith
 *
 */
public abstract class GSPrimeAccount extends PrimeAccount {
	@Override
	public void bookProduct(float charges) {
		// TODO Auto-generated method stub
		System.out.println("Dear Prime User, Your Product Charges are; " + getCharges());

	}

	public GSPrimeAccount(int accountNumber, String accountName, float charges, boolean isPrime,
			float deliveryCharges) {
		super(accountNumber, accountName, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSPrimeAccount [isPrime()=" + isPrime() + ", getDeliveryCharges()=" + getDeliveryCharges()
				+ ", toString()=" + super.toString() + ", getAccountName()=" + getAccountName()
				+ ", getAccountNumber()=" + getAccountNumber() + ", getCharges()=" + getCharges() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
