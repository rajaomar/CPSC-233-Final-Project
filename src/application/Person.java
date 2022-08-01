package application;

public class Person {
	private String gender;
	private int age;
	private int height;
	private int weight;
	private double weeklyWeightChange;
	private String gainOrLoss;
	private int amountOfWeightToChange;
	private String personsActivityLevel;
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
		String option1 = "Sedentary (little to no exercise + work a desk job)";
		String option2 = "Lightly Active (light exercise 1-3 days / week)";
		String option3 = "Moderately Active (moderate exercise 3-5 days / week)";
		String option4 = "Very Active (heavy exercise 6-7 days / week)";
		String option5 = "Extremely Active (strenuous training 2x / day)";
		String male_selected = "male";
		String female_selected = "female";

		if (this.getGender().equals(male_selected) && this.personsActivityLevel.equals(option1)) {
			this.setBmr((int) ((int) (1.2)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender().equals(male_selected) && this.personsActivityLevel.equals(option2)) {
			this.setBmr((int) ((int) (1.375)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender().equals(male_selected) && this.personsActivityLevel.equals(option3)) {
			this.setBmr((int) ((int) (1.55)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender().equals(male_selected) && this.personsActivityLevel.equals(option4)) {
			this.setBmr((int) ((int) (1.725)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender().equals(male_selected) && this.personsActivityLevel.equals(option5)) {
			this.setBmr((int) ((int) (1.9)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}

		if (this.getGender().equals(female_selected) && this.personsActivityLevel.equals(option1)) {
			this.setBmr((int) ((int) (1.2)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender().equals(female_selected) && this.personsActivityLevel.equals(option2)) {
			this.setBmr((int) ((int) (1.375)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender().equals(female_selected) && this.personsActivityLevel.equals(option3)) {
			this.setBmr((int) ((int) (1.55)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender().equals(female_selected) && this.personsActivityLevel.equals(option4)) {
			this.setBmr((int) ((int) (1.725)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender().equals(female_selected) && this.personsActivityLevel.equals(option5)) {
			this.setBmr((int) ((int) (1.9)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}

		this.daysNeeded = (int) (amountOfWeightToChange / weeklyWeightChange);

		String weightLoss = "lose";
		String weightGain = "gain";

		if (this.weeklyWeightChange == 0.25 && this.gainOrLoss.equals(weightLoss))
			this.dailyIntake = this.bmr - 250;
		if (this.weeklyWeightChange == 0.5 && this.gainOrLoss.equals(weightLoss))
			this.dailyIntake = this.bmr - 500;
		if (this.weeklyWeightChange == 1 && this.gainOrLoss.equals(weightLoss))
			this.dailyIntake = this.bmr - 1000;

		if (this.weeklyWeightChange == 0.25 && this.gainOrLoss.equals(weightGain))
			this.dailyIntake = this.bmr + 250;
		if (this.weeklyWeightChange == 0.5 && this.gainOrLoss.equals(weightGain))
			this.dailyIntake = this.bmr + 500;
		if (this.weeklyWeightChange == 1 && this.gainOrLoss.equals(weightGain))
			this.dailyIntake = this.bmr + 1000;

		this.daysNeeded = (int) (this.amountOfWeightToChange / this.weeklyWeightChange);

		double denom = (double) ((this.height) * (this.height)) / 10000.0;
		double numer = (double) this.weight + 0.0;
		this.bmi = numer / denom;

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

	/**
	 * @return the bmi
	 */
	public double getBmi() {
		return bmi;
	}

	/**
	 * @param bmi the bmi to set
	 */
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

}