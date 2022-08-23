/**
 * 
 */
package ShoppingFrameWork;

/**
 * @author Rohith
 *
 */
public interface ShopFactory {
	public PrimeAccount getNewPrimeAccount(int accountNumber, String accountName, float charges, boolean isPrime);

	public NormalAccount getNewNormalAccount(int accountNumber, String accountName, float charges,
			float deliveryCharges);
}
