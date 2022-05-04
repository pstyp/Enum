package com.qa.qacommunity;

public enum Directions {
	NORTH("N", "Forward"), EAST("E", "Right"), SOUTH("S", "Backward"), WEST("W", "Left");

	private final String abrev, motion;

	private Directions(String abrev, String motion) {
		this.abrev = abrev;
		this.motion = motion;
	}

	public String getAbrev() {
		return abrev;
	}

	public String getMotion() {
		return this.motion;
	}

	public void printInfo() {
		System.out.println(this.abrev + " is the same as moving " + this.motion);
	}

// THIS SHOULD BE IN YOUR RUNNER 
	public static void main(String[] args) {

		Directions[] array = Directions.values();

		for (Directions handle : array) {
			System.out.println(handle);
			System.out.println(handle.getMotion());
			handle.printInfo();
		}

	}
}