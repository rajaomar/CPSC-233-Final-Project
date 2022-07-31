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

	public Person() {
	}

	public Person(String gender, int age, int height, int weight, double weeklyWeightChange, String gainOrLoss,
			int amountOfWeightToChange, String personsActivityLevel) {
		super();

		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		this.setWeeklyWeightChange(weeklyWeightChange);
		this.setGainOrLoss(gainOrLoss);
		this.setAmountOfWeightToChange(amountOfWeightToChange);
		this.setPersonsActivityLevel(personsActivityLevel);
		
		if (this.gender == "Male") {
			this.bmr = (int) (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight())
					- (6.755 * this.getAge()));
			if (this.personsActivityLevel == "Sedentary (little to no exercise + work a desk job)") {
				this.bmr = (int) ((int) this.bmr * 1.2);
			}
			if (this.personsActivityLevel == "Lightly Active (light exercise 1-3 days / week)") {
				this.bmr = (int) ((int) this.bmr * 1.375);
			}
			if (this.personsActivityLevel == "Moderately Active (moderate exercise 3-5 days / week)") {
				this.bmr = (int) ((int) this.bmr * 1.55);
			}
			if (this.personsActivityLevel == "Very Active (heavy exercise 6-7 days / week)") {
				this.bmr = (int) ((int) this.bmr * 1.725);
			}
			if (this.personsActivityLevel == "Extremely Active (strenuous training 2x / day)") {
				this.bmr = (int) ((int) this.bmr * 1.9);
			}
		} else if (this.gender == "Female") {
			this.bmr = (int) (655.1 + (9.563 * this.weight) + (1.850 * this.height) - (4.676 * this.age));
			if (this.personsActivityLevel == "Sedentary (little to no exercise + work a desk job)") {
				this.bmr = (int) ((int) this.bmr * 1.2);
			}
			if (this.personsActivityLevel == "Lightly Active (light exercise 1-3 days / week)") {
				this.bmr = (int) ((int) this.bmr * 1.375);
			}
			if (this.personsActivityLevel == "Moderately Active (moderate exercise 3-5 days / week)") {
				this.bmr = (int) ((int) this.bmr * 1.55);
			}
			if (this.personsActivityLevel == "Very Active (heavy exercise 6-7 days / week)") {
				this.bmr = (int) ((int) this.bmr * 1.725);
			}
			if (this.personsActivityLevel == "Extremely Active (strenuous training 2x / day)") {
				this.bmr = (int) ((int) this.bmr * 1.9);
			}
		}

		if (weeklyWeightChange == 0.25 && gainOrLoss == "loss")
			this.dailyIntake = bmr -= 250;
		if (weeklyWeightChange == 0.5 && gainOrLoss == "loss")
			this.dailyIntake = bmr -= 500;
		if (weeklyWeightChange == 0.25 && gainOrLoss == "loss")
			this.dailyIntake = bmr -= 1000;

		if (weeklyWeightChange == 0.25 && gainOrLoss == "gain")
			this.dailyIntake = bmr += 250;
		if (weeklyWeightChange == 0.5 && gainOrLoss == "gain")
			this.dailyIntake = bmr += 500;
		if (weeklyWeightChange == 0.25 && gainOrLoss == "gain")
			this.dailyIntake = bmr += 1000;

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

}