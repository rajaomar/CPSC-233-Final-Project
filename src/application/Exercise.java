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

		if (typeOfExercise == "Running") {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (11.5) * (weightOfUser) / 200);
		}
		if (typeOfExercise == "Boxing") {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (9.5) * (weightOfUser) / 200);
		}
		if (typeOfExercise == "Leisure bicycling") {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (3.5) * (weightOfUser) / 200);
		}
		if (typeOfExercise == "Swimming") {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (6) * (weightOfUser) / 200);
		}
		if (typeOfExercise == "Vigorous weight lifting") {
			this.caloriesBurnt = (int) (timeSpent * (3.5) * (6.5) * (weightOfUser) / 200);
		}

	}

	int getCaloriesBurnt() {
		return this.caloriesBurnt;
	}

}
