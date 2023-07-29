package week2da3methodoverriding;

public class BankInfo extends AxisBank{
	public void deposite() {
		System.out.println("deposite");
	}
	public void savings() {
		System.out.println("savings");
	}
	public void fixed() {
		System.out.println("fixed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AxisBank bank = new AxisBank();
		 bank.deposite();
	}

}
