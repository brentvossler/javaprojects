package urs.registration;

public class IDGenerator {

	private int nextVal = 1;

	public int getNextVal() {
		return nextVal++;
	}

}
