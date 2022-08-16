package application;

import java.util.HashMap;

public class FoodData {
    /**
     * The data for the food and their nutrients are stored in this class.
     */
    public static HashMap<String,Nutrient> Regular;
    public static HashMap<String,Nutrient> Vegan;
    public static HashMap<String,Nutrient> Vegetarian;

    public static void init(){
        FoodData.Regular = new HashMap<>();
        FoodData.Vegan = new HashMap<>();
        FoodData.Vegetarian = new HashMap<>();
        FoodData.Regular.put("Omelet with mac and cheese",
                new Nutrient(651,0,0,0));
        FoodData.Regular.put("One bowl of cereal with 2 large bananas",
                new Nutrient(400,0,0,0));
        FoodData.Regular.put("2 eggs 2 bacon 2 toast",
                new Nutrient(740,0,0,0));
        FoodData.Regular.put("Beef Nachos",
                new Nutrient(651,0,0,0));
        FoodData.Regular.put("Chicken Fried Rice with a side of pop",
                new Nutrient(433,0,0,0));
        FoodData.Regular.put("Hamburger with fries",
                new Nutrient(900,0,0,0));
        FoodData.Regular.put("Baked Salmon with Garlic and Dijon",
                new Nutrient(314,0,0,0));
        FoodData.Regular.put("Steak and rice",
                new Nutrient(493,0,0,0));
        FoodData.Regular.put("Spaghetti with tomato sauce and cooked ground beef",
                new Nutrient(700,0,0,0));
        FoodData.Vegetarian.put("Baked Banana-Nut Oatmeal with a cup of yogurt",
                new Nutrient(365,0,0,0));
        FoodData.Vegetarian.put("Oatmeal, 2 boiled eggs",
                new Nutrient(480,0,0,0));
        FoodData.Vegetarian.put("Thai Curry Pizza & smoothie",
                new Nutrient(620,0,0,0));
        FoodData.Vegetarian.put("Veggie Wrap",
                new Nutrient(345,0,0,0));
        FoodData.Vegetarian.put("Hummus Bowls",
                new Nutrient(534,0,0,0));
        FoodData.Vegetarian.put("2 Veggie Sandwich & salad",
                new Nutrient(750,0,0,0));
        FoodData.Vegetarian.put("2 Vegetarian Tacos & smoothie",
                new Nutrient(397,0,0,0));
        FoodData.Vegetarian.put("Curried Chickpea Stew & 2 Bread",
                new Nutrient(561,0,0,0));
        FoodData.Vegetarian.put("Tikka Masala & 2 Peanut-Butter Energy Balls",
                new Nutrient(714,0,0,0));
        FoodData.Vegan.put("Grain Toast with Peanut Butter & Banana",
                new Nutrient(377,0,0,0));
        FoodData.Vegan.put("Toast with avocado & Two Boiled Eggs",
                new Nutrient(515,0,0,0));
        FoodData.Vegan.put("3 pancakes with butter and syrup",
                new Nutrient(790,0,0,0));
        FoodData.Vegan.put("Vegan Superfood Buddha Bowls",
                new Nutrient(381,0,0,0));
        FoodData.Vegan.put("Lentil Bean Salad & bag of chickpeas",
                new Nutrient(804,0,0,0));
        FoodData.Vegan.put("Veggie Sandwich & 2 bananas & orange",
                new Nutrient(567,0,0,0));
        FoodData.Vegan.put("Vegan Quinoa Salad",
                new Nutrient(300,0,0,0));
        FoodData.Vegan.put("Chickpea Buddha Bowl",
                new Nutrient(481,0,0,0));
        FoodData.Vegan.put("Vegan Coconut Chickpea Curry",
                new Nutrient(733,0,0,0));
    }
}
