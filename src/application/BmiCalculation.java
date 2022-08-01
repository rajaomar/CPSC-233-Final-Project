package application;

public class BmiCalculation {
	private int bmiValue;

	public BmiCalculation(int userWeight, int userHeight) {
		bmiValue =  (userWeight / Math.pow(userHeight, 2));
	}

	public String toString() {
		return bmiValue+"";
	}

}
