/**
 * 
 */
package ShoppingFrameWork;

/**
 * @author Rohith
 *
 */
/**
 * @author Rohith
 *
 */
public abstract class NormalAccount extends ShopAccount {
	private float deliveryCharges;

	public NormalAccount(int accountNumber, String accountName, float charges, float deliveryCharges) {
		super(accountNumber, accountName, charges);
		this.deliveryCharges = deliveryCharges;
	}

	@Override
	public void bookProduct(float charges) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "NormalAccount [deliveryCharges=" + deliveryCharges + ", getAccountName()=" + getAccountName()
				+ ", getAccountNumber()=" + getAccountNumber() + ", getCharges()=" + getCharges() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
