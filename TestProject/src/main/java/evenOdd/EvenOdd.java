package evenOdd;

public class EvenOdd {

	public String odd_or_even(int... args) {
		int counter = 0;
		for (int num: args ) {
		counter += num;
		}
		if (counter % 2 == 0) {
			return "even";
		}
		else if (counter % 2 != 0){
			return "odd";
		}
		else {
		 return "odd";
		}
	}

}
