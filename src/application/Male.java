package application;

public class Male extends Person {
	private int caloriesBurntEveryday;
	private int dailyIntake;
	private int bmr;
	private int daysNeeded;

	public Male() {
		super();
	}

	public int getBmr() {
		return bmr;
	}

	public void setBmr(int weight, int height, int age) {
		this.bmr = (int) (66.47 + (13.75 * weight) + (5.003 * height) - (6.755 * age));
	}

	public int getDailyIntake() {
		return dailyIntake;
	}

	public void setDailyIntake(int bmr, int tdeeMultiplier, int weightToLoseWeekly) {
		int newBmr = bmr * tdeeMultiplier;
		if (weightToLoseWeekly == 0.25)
			newBmr -= 250;
		if (weightToLoseWeekly == 0.5)
			newBmr -= 500;
		if (weightToLoseWeekly == 0.25)
			newBmr -= 1000;
		this.dailyIntake = newBmr;
	}

	public int getDaysNeeded() {
		return daysNeeded;
	}

	public void setDaysNeeded(int weightToLose, int weightToLoseWeekly) {
		this.daysNeeded = (weightToLose / weightToLoseWeekly);

	}

	public int getCaloriesBurnt() {
		return caloriesBurntEveryday;
	}

	public void setCaloriesBurnt(int caloriesBurnt,int tdeeMultiplier) {
		this.caloriesBurntEveryday = (this.dailyIntake-(this.bmr*tdeeMultiplier));
	}
}
