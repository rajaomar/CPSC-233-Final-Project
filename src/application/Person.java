package application;

import java.util.Date;

public class Person {
	private int gender;
	private int age;
	private int height;
	private int weight;
	private double weeklyWeightChange;
	private int gainOrLoss;
	private int amountOfWeightToChange;
	private int personsActivityLevel;
	private int caloriesBurntEveryday;
	private int dailyIntake;
	private int bmr;
	private int daysNeeded;
	private double bmi;

	public Person(int gender, int age, int height, int weight, double weeklyWeightChange, int gainOrLoss,
			int amountOfWeightToChange, int personsActivityLevel) {
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		this.setWeeklyWeightChange(weeklyWeightChange);
		this.setGainOrLoss(gainOrLoss);
		this.setAmountOfWeightToChange(amountOfWeightToChange);
		this.setPersonsActivityLevel(personsActivityLevel);

		if (this.getGender() == 1
				&& this.personsActivityLevel == 1) {
			double y = (10 * this.getWeight()) + (6.25 * this.getHeight()) - (5 * this.getAge() + 5);
			this.bmr = (int) y;
		}
		if (this.getGender() == 1
				&& this.personsActivityLevel == 2) {
			this.setBmr((int) ((int) (1.375)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == 1
				&& this.personsActivityLevel == 3) {
			this.setBmr((int) ((int) (1.55)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == 1 && this.personsActivityLevel == 4) {
			this.setBmr((int) ((int) (1.725)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == 1
				&& this.personsActivityLevel == 5) {
			this.setBmr((int) ((int) (1.9)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}

		if (this.getGender() == 2
				&& this.personsActivityLevel == 1) {
			this.setBmr((int) ((int) (1.2)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == 2
				&& this.personsActivityLevel == 2) {
			this.setBmr((int) ((int) (1.375)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == 2
				&& this.personsActivityLevel == 3) {
			this.setBmr((int) ((int) (1.55)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == 2
				&& this.personsActivityLevel == 4) {
			this.setBmr((int) ((int) (1.725)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}
		if (this.getGender() == 2
				&& this.personsActivityLevel == 5) {
			this.setBmr((int) ((int) (1.9)
					* (66.47 + (13.75 * this.getWeight()) + (5.003 * this.getHeight()) - (6.755 * this.getAge()))));
		}

		if (weeklyWeightChange == 0.25 && gainOrLoss == 2)
			this.dailyIntake = setBmr(getBmr() - 250);
		if (weeklyWeightChange == 0.5 && gainOrLoss == 2)
			this.dailyIntake = setBmr(getBmr() - 500);
		if (weeklyWeightChange == 0.25 && gainOrLoss == 2)
			this.dailyIntake = setBmr(getBmr() - 1000);

		if (weeklyWeightChange == 0.25 && gainOrLoss == 1)
			this.dailyIntake = setBmr(getBmr() + 250);
		if (weeklyWeightChange == 0.5 && gainOrLoss == 1)
			this.dailyIntake = setBmr(getBmr() + 500);
		if (weeklyWeightChange == 0.25 && gainOrLoss == 1)
			this.dailyIntake = setBmr(getBmr() + 1000);

		if (weeklyWeightChange == 0.25 && gainOrLoss == 2)
			this.caloriesBurntEveryday = 250;
		if (weeklyWeightChange == 0.5 && gainOrLoss == 2)
			this.caloriesBurntEveryday = 500;
		if (weeklyWeightChange == 0.25 && gainOrLoss == 2)
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

	public int getGainOrLoss() {
		return gainOrLoss;
	}

	public void setGainOrLoss(int gainOrLoss2) {
		this.gainOrLoss = gainOrLoss2;
	}

	public int getAmountOfWeightToChange() {
		return amountOfWeightToChange;
	}

	public void setAmountOfWeightToChange(int amountOfWeightToChange) {
		this.amountOfWeightToChange = amountOfWeightToChange;
	}

	public int getPersonsActivityLevel() {
		return personsActivityLevel;
	}

	public void setPersonsActivityLevel(int personsActivityLevel) {
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

	
	public int getGender() {
		return gender;
	}

	
	public int setGender(int gender) {
		return this.gender = gender;
	}

	
	public int getBmr() {
		return bmr;
	}


	public int setBmr(int bmr) {
		this.bmr = bmr;
		return bmr;
	}

	public String toString() {
		return (this.gender +" "+ this.age +" "+ this.height +" "+ this.weight
				+" "+ this.weeklyWeightChange +" "+ this.gainOrLoss
				+" "+ this.amountOfWeightToChange
				+" "+ this.personsActivityLevel+" "+this.getBmr());

	}

}