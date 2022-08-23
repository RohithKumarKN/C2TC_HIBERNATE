/**
 * 
 */
package MMBankingFrameWork;

/**
 * @author Rohith
 *
 */
public abstract class CurrentAccount extends BankAccount {
	private float creditLimit;

	public CurrentAccount(int accountNumber, String accountName, float accountBalance, float creditLimit) {
		super(accountNumber, accountName, accountBalance);
		this.creditLimit = creditLimit;
	}

	/**
	 * @return the creditLimit
	 */
	public float getCreditLimit() {
		return creditLimit;
	}

	@Override
	public void withDraw(float withDraw) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposite(float deposite) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "CurrentAccount [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit()
				+ ", getAccountName()=" + getAccountName() + ", getAccountNumber()=" + getAccountNumber()
				+ ", getAccountBalance()=" + getAccountBalance() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
