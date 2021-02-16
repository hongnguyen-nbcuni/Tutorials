package classesandobjects;

public class AccountHolder {
	String firstName;
	String lastName;
	int age;
	float accountBalance;
	Boolean eligibilityForCreditCard;
	
	public void testEligibilityForCreditCard() {
		if (age > 25 && accountBalance >= 20000) {
			eligibilityForCreditCard = true;
		} else {
			eligibilityForCreditCard = false;
		}
	}

}
