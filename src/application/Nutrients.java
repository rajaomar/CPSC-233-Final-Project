package application;

public class Nutrients {

	private int totalCalories = 0;
	private double proteins;
	private double carbohydrates;
	private double fats;

	public Nutrients(String breakfast, String lunch, String dinner) {
		setTotalCalories(breakfast, lunch, dinner);
	}

	public int getTotalCalories() {
		return totalCalories;
	}

	public void setTotalCalories(String breakfast, String lunch, String dinner) {
		if (breakfast == "Omelet with mac and cheese") {
			this.totalCalories += 651;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (breakfast == "One bowl of cereal with 2 large bananas") {
			this.totalCalories += 400;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (breakfast == "2 eggs 2 bacon 2 toast") {
			this.totalCalories += 740;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (breakfast == "Baked Banana-Nut Oatmeal with a cup of yogurt") {
			this.totalCalories += 365;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (breakfast == "Oatmeal, 2 boiled eggs") {
			this.totalCalories += 480;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (breakfast == "Thai Curry Pizza & smoothie") {
			this.totalCalories += 620;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (breakfast == "Grain Toast with Peanut Butter & Banana") {
			this.totalCalories += 377;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (breakfast == "Toast with avocado and a smoothie") {
			this.totalCalories += 515;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (breakfast == "3 pancakes with butter and syrup") {
			this.totalCalories += 790;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (lunch == "Beef Nachos") {
			this.totalCalories += 651;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (lunch == "Chicken Fried Rice with a side of pop") {
			this.totalCalories += 433;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (lunch == "Hamburger with fries") {
			this.totalCalories += 900;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (lunch == "Veggie Wrap") {
			this.totalCalories += 345;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (lunch == "Hummus Bowls") {
			this.totalCalories += 534;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (lunch == "2 Veggie Sandwich & salad") {
			this.totalCalories += 750;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (lunch == "Vegan Superfood Buddha Bowls") {
			this.totalCalories += 381;
			this.proteins += 0;
			this.carbohydrates += 0;
			this.fats += 0;
		}
		if (lunch == "2 Cheese Pizza & Fries & pop") {
			this.totalCalories += 804;
			this.proteins+=0;
			this.carbohydrates+=0;
			this.fats+=0;
		}
		if (lunch == "Veggie Sandwich & 2 bananas & orange") {
			this.totalCalories += 567;
			this.proteins+=0;
			this.carbohydrates+=0;
			this.fats+=0;
		}
		if (dinner == "Baked Salmon with Garlic and Dijon") {
			this.totalCalories += 314;
			this.proteins+=0;
			this.carbohydrates+=0;
			this.fats+=0;
		}
		if (dinner == "Steak and rice") {
			this.totalCalories += 493;
			this.proteins+=0;
			this.carbohydrates+=0;
			this.fats+=0;
		}
		if (dinner == "Spaghetti with tomato sauce and cooked ground beef") {
			this.totalCalories += 700;
			this.proteins+=0;
			this.carbohydrates+=0;
			this.fats+=0;
		}
		if (dinner == "2 Vegetarian Tacos & smoothie") {
			this.totalCalories += 397;
			this.proteins+=0;
			this.carbohydrates+=0;
			this.fats+=0;
		}
		if (dinner == "Curried Chickpea Stew & 2 Bread") {
			this.totalCalories += 561;
			this.proteins+=0;
			this.carbohydrates+=0;
			this.fats+=0;
		}
		if (dinner == "Tikka Masala & 2 Peanut-Butter Energy Balls") {
			this.totalCalories += 714;
			this.proteins+=0;
			this.carbohydrates+=0;
			this.fats+=0;
		}
		if (dinner == "Vegan Quinoa Salad") {
			this.totalCalories += 300;
			this.proteins+=0;
			this.carbohydrates+=0;
			this.fats+=0;
		}
		if (dinner == "Chickpea Buddha Bowl") {
			this.totalCalories += 481;
			this.proteins+=0;
			this.carbohydrates+=0;
			this.fats+=0;
		}
		if (dinner == "Vegan Coconut Chickpea Curry") {
			this.totalCalories += 733;
			this.proteins+=0;
			this.carbohydrates+=0;
			this.fats+=0;
		}
	}

	public double getProteins() {
		return proteins;
	}

	public void setProteins(int proteins) {
		this.proteins = proteins;
	}

	public double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(int carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public double getFats() {
		return fats;
	}

	public void setFats(int fats) {
		this.fats = fats;
	}

}
