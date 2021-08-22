package week3assignments;

public class AxisBank extends BankInfo {
	@Override
public void deposit() {
	System.out.println("axis bank deposit.....");
}
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
		obj.saving();
		obj.fixed();
	}
}
