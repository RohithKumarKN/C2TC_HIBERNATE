/**
 * 
 */
package MMBankingFrameWork;

/**
 * @author Rohith
 *
 */
public abstract class BankAccount {
	private int accountNumber;
	private String accountName;
	private float accountBalance;

	public BankAccount(int accountNumber, String accountName, float accountBalance) {
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}

	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	/**
	 * @return the accountNumber
	 */
	public int getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @return the accountBalance
	 */
	public float getAccountBalance() {
		return accountBalance;
	}

	public abstract void withDraw(float withDraw);

	public abstract void deposite(float deposite);

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountName=" + accountName + ", accountBalance="
				+ accountBalance + ", getAccountName()=" + getAccountName() + ", getAccountNumber()="
				+ getAccountNumber() + ", getAccountBalance()=" + getAccountBalance() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
