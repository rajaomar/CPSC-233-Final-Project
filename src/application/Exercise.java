package application;

public class Exercise {
	private String typeOfExercise;
	private int caloriesBurnt = 0;

	public Exercise(String exerciseType, int timeSpent, int weight) {
		typeOfExercise = exerciseType;
		setCaloriesBurnt(exerciseType, timeSpent, weight);
	}

	void setCaloriesBurnt(String typeOfExericse, int timeSpent, int weightOfUser) {
		// (3.5 times the metabolic equivalent or MET multiplied by your body weight in
		// kilograms)/200.
		
		String option1="Running";
		String option2="Boxing";
		String option3="Leisure bicycling";
		String option4="Swimming";
		String option5="Vigorous weight lifting";
		//
		if (typeOfExercise.equals(option1)) {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (11.5) * (weightOfUser) / 200);
		}
		if (typeOfExercise.equals(option2)) {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (9.5) * (weightOfUser) / 200);
		}
		if (typeOfExercise.equals(option3)) {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (3.5) * (weightOfUser) / 200);
		}
		if (typeOfExercise.equals(option4)) {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (6) * (weightOfUser) / 200);
		}
		if (typeOfExercise.equals(option5)) {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (6.5) * (weightOfUser) / 200);
		}

	}

	int getCaloriesBurnt() {
		return this.caloriesBurnt;
	}

}
