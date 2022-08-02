package application;

import javafx.scene.Scene;

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

	// Statistics and formulas for calculating the outputs were derived from the
	// following website.
	// Date Accessed: July 25th, 2022
	// https://www.nasm.org/resources/calorie-calculator#calculate-calories

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

	public String errorMessage(String string1, String string2, String string3, String string4, String string5,
			String string6, String string7, String string8) {
		String errorText = "";
		if (string1 != null) {
			// The following code to check if String is numeric was derived from the given
			// citation.
			// Date Accessed July 29th, 2022
			// https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java?noredirect=1&lq=1
			if (string2 != "" && (string2.chars().allMatch(Character::isDigit))) {
				int userAge = Integer.parseInt(string2);
				if (userAge > 9) {
					if (userAge < 80) {
						if (string3 != "" && string3.chars().allMatch(Character::isDigit)) {
							int userHeight = Integer.parseInt(string3);
							if (userHeight > 55 && userHeight < 270) {
								if (string4 != "" && (string4.chars().allMatch(Character::isDigit))) {
									int userWeight = Integer.parseInt(string4);
									if (userWeight > 25 && userWeight < 450) {
										if (string5 != "" && (string5.chars().allMatch(Character::isDigit))) {
											int loseWeight = Integer.parseInt(string5);
											if (loseWeight < 0.5 * userWeight) {
												if (string6 != null) {
													if (string7 != null) {
														if (string8 != null) {
															return errorText;

														} else {
															errorText = ("Please pick the correct weight change option (loss/gain)");
														}
													} else {
														errorText = "Please pick one of the weekly weight loss/gain options.";
													}
												} else {
													errorText = ("Please pick your daily activity level");
												}
											} else {
												errorText = ("You're attempting to lose a lot of bodyweight,"
														+ " please rethink your target weight");
											}
										} else {
											errorText = "Please enter the amount of weight you'd like to gain/lose.";
										}
									} else {
										errorText = ("Please enter a valid weight.");
									}
								} else {
									errorText = ("Please enter a valid weight.");
								}
							} else {
								errorText = ("Please enter a valid height.");
							}
						} else {
							errorText = ("Please enter a valid height.");
						}
					} else {
						errorText = ("You're too old to go for weight gain/loss");
					}
				} else {
					errorText = ("You're too young to go for weight gain/loss.");
				}
			} else {
				errorText = ("Please enter your age.");
			}
		} else {
			errorText = ("Please pick your gender.");
		}

		return errorText;

	}

}