/**
 * 
 */
package ShoppingFrameWork;

/**
 * @author Rohith
 *
 */
public class PrimeAccount extends ShopAccount {
	private boolean isPrime;
	private static final float deliveryCharges = 0;

	public boolean isPrime() {
		return isPrime;
	}

	public static float getDeliveryCharges() {
		return deliveryCharges;
	}

	public PrimeAccount(int accountNumber, String accountName, float charges, boolean isPrime) {
		super(accountNumber, accountName, charges);
		this.isPrime = isPrime;

	}

	@Override
	public void bookProduct(float charges) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "PrimeAccount [isPrime=" + isPrime + ", deliveryCharges=" + deliveryCharges + ", isPrime()=" + isPrime()
				+ ", getDeliveryCharges()=" + getDeliveryCharges() + ", getAccountName()=" + getAccountName()
				+ ", getAccountNumber()=" + getAccountNumber() + ", getCharges()=" + getCharges() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
