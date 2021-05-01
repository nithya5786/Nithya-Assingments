package week3.day1.assignments;

/*Class:AxisBank
 * Methods used:deposit() 
 */
public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("The deposit in the bank");
	}

	public static void main(String[] args) {
		AxisBank ref = new AxisBank();
		ref.deposit();
		ref.fixed();
		ref.saving();

	}

}
