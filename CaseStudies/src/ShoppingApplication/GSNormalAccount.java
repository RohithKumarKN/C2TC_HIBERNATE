/**
 * 
 */
package ShoppingApplication;

import ShoppingFrameWork.NormalAccount;

/**
 * @author Rohith
 *
 */
public class GSNormalAccount extends NormalAccount {

	public GSNormalAccount(int accountNumber, String accountName, float charges, float deliveryCharges) {
		super(accountNumber, accountName, charges, deliveryCharges);
		// TODO Auto-generated constructor stub
	}


	public void bookProduct(float charges) {
		// TODO Auto-generated method stub
		System.out.println("Dear User, Your Product Charges are; " + getCharges());
		System.out.println("Delivery Charges "+getdeliveryCharges());
	}

	private float getdeliveryCharges() {
		// TODO Auto-generated method stub
		return 50f;
	}


	@Override
	public String toString() {
		return "GSNormalAccount [toString()=" + super.toString() + ", getAccountName()=" + getAccountName()
				+ ", getAccountNumber()=" + getAccountNumber() + ", getCharges()=" + getCharges() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
