package application;

public class FoodOptions {

	private String breakfast1;
	private String breakfast2;
	private String breakfast3;
	private int breakfastCalories;

	private String lunch1;
	private String lunch2;
	private String lunch3;
	private int lunchCalories;

	private String dinner1;
	private String dinner2;
	private String dinner3;
	private int dinnerCalories;

	public FoodOptions(String typeOfFood) {
		String regularFood = "Regular";
		String vegetarian = "Vegetarian";
		String vegan = "Vegan";

		if (typeOfFood.equals(regularFood)) {
			this.setBreakfast1("Omelet with mac and cheese");
			this.setBreakfast2("One bowl of cereal with 2 large bananas");
			this.breakfast3 = "2 eggs 2 bacon 2 toast";
			this.lunch1 = "Beef Nachos";
			this.lunch2 = "Chicken Fried Rice with a side of pop";
			this.lunch3 = "Hamburger with fries";
			this.dinner1 = "Baked Salmon with Garlic and Dijon";
			this.dinner2 = "Steak and rice";
			this.dinner3 = "Spaghetti with tomato sauce and cooked ground beef";
		}
		if (typeOfFood.equals(vegetarian)) {
			this.setBreakfast1("Baked Banana-Nut Oatmeal with a cup of yogurt");
			this.setBreakfast2("Oatmeal, 2 boiled eggs");
			this.breakfast3 = "Thai Curry Pizza & smoothie";
			this.lunch1 = "Veggie Wrap";
			this.lunch2 = "Hummus Bowls";
			this.lunch3 = "2 Veggie Sandwich & salad";
			this.dinner1 = "2 Vegetarian Tacos & smoothie";
			this.dinner2 = "Curried Chickpea Stew & 2 Bread";
			this.dinner3 = "Tikka Masala & 2 Peanut-Butter Energy Balls";
		}
		if (typeOfFood.equals(vegan)) {
			this.setBreakfast1("Grain Toast with Peanut Butter & Banana");
			this.setBreakfast2("Toast with avocado and a smoothie");
			this.breakfast3 = "3 pancakes with butter and syrup";
			this.lunch1 = "Vegan Superfood Buddha Bowls";
			this.lunch2 = "2 Cheese Pizza & Fries & pop";
			this.lunch3 = "Veggie Sandwich & 2 bananas & orange";
			this.dinner1 = "Vegan Quinoa Salad";
			this.dinner2 = "Chickpea Buddha Bowl";
			this.dinner3 = "Vegan Coconut Chickpea Curry";
		}
	}

	public String getBreakfast3() {
		return breakfast3;
	}

	public void setBreakfast3(String breakfast3) {
		this.breakfast3 = breakfast3;
	}

	public String getLunch1() {
		return lunch1;
	}

	public void setLunch1(String lunch1) {
		this.lunch1 = lunch1;
	}

	public String getLunch2() {
		return lunch2;
	}

	public void setLunch2(String lunch2) {
		this.lunch2 = lunch2;
	}

	public String getLunch3() {
		return lunch3;
	}

	public void setLunch3(String lunch3) {
		this.lunch3 = lunch3;
	}

	public String getDinner1() {
		return dinner1;
	}

	public void setDinner1(String dinner1) {
		this.dinner1 = dinner1;
	}

	public String getDinner2() {
		return dinner2;
	}

	public void setDinner2(String dinner2) {
		this.dinner2 = dinner2;
	}

	public String getDinner3() {
		return dinner3;
	}

	public void setDinner3(String dinner3) {
		this.dinner3 = dinner3;
	}

	public String getBreakfast1() {
		return breakfast1;
	}

	public void setBreakfast1(String breakfast1) {
		this.breakfast1 = breakfast1;
	}

	public String getBreakfast2() {
		return breakfast2;
	}

	public void setBreakfast2(String breakfast2) {
		this.breakfast2 = breakfast2;
	}

	// public int getBreakfastCalories() {
//		return breakfastCalories;
//	}

	public int getBreakfastCalories(String breakfastOption) {
		int breakfastCalories = 0;
		if (breakfastOption == "Omelet with mac and cheese") {
			breakfastCalories = 651;
		}
		if (breakfastOption == "One bowl of cereal with 2 large bananas") {
			breakfastCalories = 400;
		}
		if (breakfastOption == "2 eggs 2 bacon 2 toast") {
			breakfastCalories = 740;
		}
		if (breakfastOption == "Baked Banana-Nut Oatmeal with a cup of yogurt") {
			breakfastCalories = 365;
		}
		if (breakfastOption == "Oatmeal, 2 boiled eggs") {
			breakfastCalories = 480;
		}
		if (breakfastOption == "Thai Curry Pizza & smoothie") {
			breakfastCalories = 620;
		}
		if (breakfastOption == "Grain Toast with Peanut Butter & Banana") {
			breakfastCalories = 377;
		}
		if (breakfastOption == "Toast with avocado and a smoothie") {
			breakfastCalories = 515;
		}
		if (breakfastOption == "3 pancakes with butter and syrup") {
			breakfastCalories = 790;
		}
		return breakfastCalories;
	}

	public int getLunchCalories() {
		return lunchCalories;
	}

	public int getLunchCalories(String lunchOption) {
		int lunchCalories = 0;
		if (lunchOption == "Beef Nachos") {
			lunchCalories = 651;
		}
		if (lunchOption == "Chicken Fried Rice with a side of pop") {
			lunchCalories = 433;
		}
		if (lunchOption == "Hamburger with fries") {
			lunchCalories = 900;
		}
		if (lunchOption == "Veggie Wrap") {
			lunchCalories = 345;
		}
		if (lunchOption == "Hummus Bowls") {
			lunchCalories = 534;
		}
		if (lunchOption == "2 Veggie Sandwich & salad") {
			lunchCalories = 750;
		}
		if (lunchOption == "Vegan Superfood Buddha Bowls") {
			lunchCalories = 381;
		}
		if (lunchOption == "2 Cheese Pizza & Fries & pop") {
			lunchCalories = 804;
		}
		if (lunchOption == "Veggie Sandwich & 2 bananas & orange") {
			lunchCalories = 567;
		}
		return lunchCalories;
	}

	public int getDinnerCalories() {
		return dinnerCalories;
	}

	public void setDinnerCalories(String dinnerOption) {
		if (dinnerOption == "Baked Salmon with Garlic and Dijon") {
			this.dinnerCalories = 314;
		}
		if (dinnerOption == "Steak and rice") {
			this.dinnerCalories = 493;
		}
		if (dinnerOption == "Spaghetti with tomato sauce and cooked ground beef") {
			this.dinnerCalories = 700;
		}
		if (dinnerOption == "2 Vegetarian Tacos & smoothie") {
			this.dinnerCalories = 397;
		}
		if (dinnerOption == "Curried Chickpea Stew & 2 Bread") {
			this.dinnerCalories = 561;
		}
		if (dinnerOption == "Tikka Masala & 2 Peanut-Butter Energy Balls") {
			this.dinnerCalories = 714;
		}
		if (dinnerOption == "Vegan Quinoa Salad") {
			this.dinnerCalories = 300;
		}
		if (dinnerOption == "Chickpea Buddha Bowl") {
			this.dinnerCalories = 481;
		}
		if (dinnerOption == "Vegan Coconut Chickpea Curry") {
			this.dinnerCalories = 733;
		}
	}
}
