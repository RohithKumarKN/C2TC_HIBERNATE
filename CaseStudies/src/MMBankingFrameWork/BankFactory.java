/**
 * 
 */
package MMBankingFrameWork;

/**
 * @author Rohith
 *
 */
public interface BankFactory {
	public SavingAccount getNewSavingAccount(int accountNumber, String accountName, float accountBalance,
			boolean isSalaried);

	public CurrentAccount getNewCurrentAccount(int accountNumber, String accountName, float accountBalance,
			float creditLimit);

	public SavingAccount getNewSavingAccount(int accountNumber, String accountName, float accountBalance, boolean isSalaried,
			float minimumBalance);

}
