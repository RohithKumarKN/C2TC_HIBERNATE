/**
 * 
 */
package ShoppingFrameWork;

/**
 * @author Rohith
 *
 */
public abstract class ShopAccount {
	private int accountNumber;
	private String accountName;
	private float charges;

	public ShopAccount(int accountNumber, String accountName, float charges) {

		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.charges = charges;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public float getCharges() {
		return charges;
	}

	public abstract void bookProduct(float charges);

	@Override
	public String toString() {
		return "ShopAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", charges=" + charges
				+ ", getAccountName()=" + getAccountName() + ", getAccountNumber()=" + getAccountNumber()
				+ ", getCharges()=" + getCharges() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
