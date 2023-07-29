package week2da3methodoverriding;

public class SmartPhone{
	public void watchVideo() {
		System.out.println("You can use youtube to watch video");
	}
	public void Dualsim() {
		System.out.println("The phone has dual SIM");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 AndroidPhone watch = new  AndroidPhone ();
		watch.watchVideo();
		watch.phonename();
	
	}

}

