package slideDeckChallenges;

public class CallMe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		callMe(-1);

	}
	
	public static void callMe(int callNumber) {
		
		if (callNumber == 100) {
			System.out.println("finished");
		} else {
			callMe(++callNumber);
			System.out.println("Call me please " + callNumber);
		}
		
		
	}

}
