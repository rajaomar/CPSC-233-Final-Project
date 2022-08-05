package application;


/**
 * BMI Class
 * Instance Variables: BmiValue
 * Overall Description of the class: In this class there are calculations on how to find the bmi
 * and estabishes the users obesityLevels. 
 */
public class Bmi {
	//Tracks down the bmi value
	private double bmiValue;
	
	/*
	*Method Name: Bmi
	*Inputs: height and weight of the user
	*Functionality: calculates the BMI from the users height and weight we had to use a fraction calculator 
	*in order to get a decimal number outputed.
	*Outputs/Sets: the calculated BMI Value
	*/
	public Bmi(int height, int weight) {
		double denom =  ((height+0.0) * (height+0.0)) / 10000.0;
		double numer = weight + 0.0;
		setBmiValue(numer / denom);
	}

	/**
	 * getter and setter
	 * gets the BMI value
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
	/*Method Name: obesityLabelText
	*Inputs: bmival 
	*Functionality: gets the bmi value from above and calculates if the user obesity level  
	*Outputs/Sets: the obesity level they are in
	*/
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
