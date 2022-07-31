package application;

import java.util.Date;

public class Person {
	private int age;
	private int height;
	private int weight;
	private double weeklyWeightChange;
	private String gainOrLoss;
	private int amountOfWeightToChange;
	private String personsActivityLevel;

	public Person() {
	}

	public Person(int age, int height, int weight, double weeklyWeightChange, String gainOrLoss,
			int amountOfWeightToChange, String personsActivityLevel) {
		super();

		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		this.setWeeklyWeightChange(weeklyWeightChange);
		this.setGainOrLoss(gainOrLoss);
		this.setAmountOfWeightToChange(amountOfWeightToChange);
		this.setPersonsActivityLevel(personsActivityLevel);

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
}
