package application;

public class Food {
	private String breakfast1;
	private int breakfast1calories;
	private String breakfast2;
	private int breakfast2calories;
	private String breakfast3;
	private int breakfast3calories;
	private String lunch1;
	private int lunch1calories;
	private String lunch2;
	private int lunch2calories;
	private String lunch3;
	private int lunch3calories;
	private String dinner1;
	private int dinner1calories;
	private String dinner2;
	private int dinner2calories;
	private String dinner3;
	private int dinner3calories;
	private int calories = 0;

	public Food(String typeOfFood) {
		String regularFood = "Regular";
		String vegetarian = "Vegetarian";
		String vegan = "Vegan";

		if (typeOfFood.equals(regularFood)) {
			this.breakfast1 = "Pancakes, Butter, And Syrup";
			this.breakfast2 = "One bowl of cereal with 2 large bananas";
			this.breakfast3 = "2 eggs 2 bacon 2 toast";
			this.lunch1 = "Taco Hard Shell  with beef and cheese and lettuce";
			this.lunch2 = "Chicken Fried Rice with a side of pop";
			this.lunch3 = "Hamburger with fries";
			this.dinner1 = "Baked Salmon with Garlic and Dijon";
			this.dinner2 = "Steak and rice";
			this.dinner3 = "Spaghetti with tomato sauce and cooked ground beef";
		}
		if (typeOfFood.equals(vegetarian)) {
			this.breakfast1 = "Baked Banana-Nut Oatmeal, an Apple";
			this.breakfast2 = "One bowl of cereal with 2 large bananas";
			this.breakfast3 = "2 eggs 2 bacon 2 toast";
			this.lunch1 = "Taco Hard Shell  with beef and cheese and lettuce";
			this.lunch2 = "Chicken Fried Rice with a side of pop";
			this.lunch3 = "Hamburger with fries";
			this.dinner1 = "Baked Salmon with Garlic and Dijon";
			this.dinner2 = "Steak and rice";
			this.dinner3 = "Spaghetti with tomato sauce and cooked ground beef";
		}
		if (typeOfFood.equals(vegan)) {
			this.breakfast1 = "Pancakes, Butter, And Syrup";
			this.breakfast2 = "One bowl of cereal with 2 large bananas";
			this.breakfast3 = "2 eggs 2 bacon 2 toast";
			this.lunch1 = "Taco Hard Shell  with beef and cheese and lettuce";
			this.lunch2 = "Chicken Fried Rice with a side of pop";
			this.lunch3 = "Hamburger with fries";
			this.dinner1 = "Baked Salmon with Garlic and Dijon";
			this.dinner2 = "Steak and rice";
			this.dinner3 = "Spaghetti with tomato sauce and cooked ground beef";
		}
	}

	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * @param calories the calories to set
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

}
