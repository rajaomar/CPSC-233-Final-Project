package application;

import java.util.Date;

public class Person {
	private String gender;
	private int age;
	private int height;
	private int weight;
	private double weeklyWeightChange;
	private String gainOrLoss;
	private int amountOfWeightToChange;
	private String personsActivityLevel;
	private int caloriesBurntEveryday;
	private int dailyIntake;
	private int bmr;
	private int daysNeeded;
	private double bmi;

	public Person(String gender, int age, int height, int weight, double weeklyWeightChange, String gainOrLoss,
			int amountOfWeightToChange, String personsActivityLevel) {
		this.setGender(gender);
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		this.setWeeklyWeightChange(weeklyWeightChange);
		this.setGainOrLoss(gainOrLoss);
		this.setAmountOfWeightToChange(amountOfWeightToChange);
		this.setPersonsActivityLevel(personsActivityLevel);

		if (this.getGender() == "male"
				&& this.personsActivityLevel == "Sedentary (little to no exercise + work a desk job)") {
			this.setBmr((int) ((int) (1.2)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == "male"
				&& this.personsActivityLevel == "Lightly Active (light exercise 1-3 days / week)") {
			this.setBmr((int) ((int) (1.375)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == "male"
				&& this.personsActivityLevel == "Moderately Active (moderate exercise 3-5 days / week)") {
			this.setBmr((int) ((int) (1.55)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == "male" && this.personsActivityLevel == "Very Active (heavy exercise 6-7 days / week)") {
			this.setBmr((int) ((int) (1.725)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == "male"
				&& this.personsActivityLevel == "Extremely Active (strenuous training 2x / day)") {
			this.setBmr((int) ((int) (1.9)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}

		if (this.getGender() == "female"
				&& this.personsActivityLevel == "Sedentary (little to no exercise + work a desk job)") {
			this.setBmr((int) ((int) (1.2)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == "female"
				&& this.personsActivityLevel == "Lightly Active (light exercise 1-3 days / week)") {
			this.setBmr((int) ((int) (1.375)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == "female"
				&& this.personsActivityLevel == "Moderately Active (moderate exercise 3-5 days / week)") {
			this.setBmr((int) ((int) (1.55)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == "female"
				&& this.personsActivityLevel == "Very Active (heavy exercise 6-7 days / week)") {
			this.setBmr((int) ((int) (1.725)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == "female"
				&& this.personsActivityLevel == "Extremely Active (strenuous training 2x / day)") {
			this.setBmr((int) ((int) (1.9)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}

		if (weeklyWeightChange == 0.25 && gainOrLoss == "loss")
			this.dailyIntake = setBmr(getBmr() - 250);
		if (weeklyWeightChange == 0.5 && gainOrLoss == "loss")
			this.dailyIntake = setBmr(getBmr() - 500);
		if (weeklyWeightChange == 0.25 && gainOrLoss == "loss")
			this.dailyIntake = setBmr(getBmr() - 1000);

		if (weeklyWeightChange == 0.25 && gainOrLoss == "gain")
			this.dailyIntake = setBmr(getBmr() + 250);
		if (weeklyWeightChange == 0.5 && gainOrLoss == "gain")
			this.dailyIntake = setBmr(getBmr() + 500);
		if (weeklyWeightChange == 0.25 && gainOrLoss == "gain")
			this.dailyIntake = setBmr(getBmr() + 1000);

		if (weeklyWeightChange == 0.25 && gainOrLoss == "loss")
			this.caloriesBurntEveryday = 250;
		if (weeklyWeightChange == 0.5 && gainOrLoss == "loss")
			this.caloriesBurntEveryday = 500;
		if (weeklyWeightChange == 0.25 && gainOrLoss == "loss")
			this.caloriesBurntEveryday = 1000;

		this.daysNeeded = (int) (this.amountOfWeightToChange / this.weeklyWeightChange);

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getWeeklyWeightChange() {
		return weeklyWeightChange;
	}

	public void setWeeklyWeightChange(double weeklyWeightChange) {
		this.weeklyWeightChange = weeklyWeightChange;
	}

	public String getGainOrLoss() {
		return gainOrLoss;
	}

	public void setGainOrLoss(String gainOrLoss) {
		this.gainOrLoss = gainOrLoss;
	}

	public int getAmountOfWeightToChange() {
		return amountOfWeightToChange;
	}

	public void setAmountOfWeightToChange(int amountOfWeightToChange) {
		this.amountOfWeightToChange = amountOfWeightToChange;
	}

	public String getPersonsActivityLevel() {
		return personsActivityLevel;
	}

	public void setPersonsActivityLevel(String personsActivityLevel) {
		this.personsActivityLevel = personsActivityLevel;
	}

	public int getCaloriesBurntEveryday() {
		return caloriesBurntEveryday;
	}

	public void setCaloriesBurntEveryday(int caloriesBurntEveryday) {
		this.caloriesBurntEveryday = caloriesBurntEveryday;
	}

	public int getDailyIntake() {
		return dailyIntake;
	}

	public void setDailyIntake(int dailyIntake) {
		this.dailyIntake = dailyIntake;
	}

	public int getDaysNeeded() {
		return daysNeeded;
	}

	public void setDaysNeeded(int daysNeeded) {
		this.daysNeeded = daysNeeded;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}

	/**
	 * @return the bmr
	 */
	public int getBmr() {
		return bmr;
	}

	/**
	 * @param bmr the bmr to set
	 */
	public int setBmr(int bmr) {
		this.bmr = bmr;
		return bmr;
	}

}