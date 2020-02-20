package calculator;

public class Calculator {
	public int add(int... args) {
		int sum = 0;
		for (int x: args) {
			sum += x;
		}
		return sum;
	}

}
