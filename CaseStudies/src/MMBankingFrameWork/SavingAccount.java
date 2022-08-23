/**
 * 
 */
package MMBankingFrameWork;

/**
 * @author Rohith
 *
 */
public abstract class SavingAccount extends BankAccount {
	private boolean isSalaried;
	private float minimumBalance;

	public SavingAccount(int accountNumber, String accountName, float accountBalance, boolean isSalaried,
			float minimumBalance) {
		super(accountNumber, accountName, accountBalance);
		this.isSalaried = isSalaried;
		this.minimumBalance = minimumBalance;
	}

	@Override
	public void withDraw(float withDraw) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deposite(float deposite) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the isSalaried
	 */
	public boolean isSalaried() {
		return isSalaried;
	}

	/**
	 * @return the minimumBalance
	 */
	public float getMinimumBalance() {
		return minimumBalance;
	}

	@Override
	public String toString() {
		return "SavingAccount [isSalaried=" + isSalaried + ", minimumBalance=" + minimumBalance + ", isSalaried()="
				+ isSalaried() + ", getMinimumBalance()=" + getMinimumBalance() + ", getAccountName()="
				+ getAccountName() + ", getAccountNumber()=" + getAccountNumber() + ", getAccountBalance()="
				+ getAccountBalance() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}

}
