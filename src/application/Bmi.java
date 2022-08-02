package application;

public class Bmi {
	private double bmiValue;

	public Bmi(int height, int weight) {
		double denom =  ((height+0.0) * (height+0.0)) / 10000.0;
		double numer = weight + 0.0;
		setBmiValue(numer / denom);
		
		
	}

	/**
	 * @return the bmiValue
	 */
	public double getBmiValue() {
		return bmiValue;
	}

	/**
	 * @param bmiValue the bmiValue to set
	 */
	public void setBmiValue(double bmiValue) {
		this.bmiValue = bmiValue;
	}

	String obesityLabelText(double bmiVal) {
		String obesityLevel = "";
		if (bmiVal < 18.5) {

			obesityLevel = "Underweight";

		} else if (bmiVal > 18.5 && bmiVal < 24.9) {

			obesityLevel = "Healthy weight";
		} else if (bmiVal > 25.0 && bmiVal < 29.9) {

			obesityLevel = "Overweight";

		} else if (bmiVal > 30.0) {

			obesityLevel = "Obese";

		}
		return obesityLevel;
	}
}
