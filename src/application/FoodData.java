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
                new Nutrient(651,12,1,15));
        FoodData.Regular.put("One bowl of cereal with 2 large bananas",
                new Nutrient(400,8,83,6));
        FoodData.Regular.put("2 eggs 2 bacon 2 toast",
                new Nutrient(740,27,85,31));
        FoodData.Regular.put("Beef Nachos",
                new Nutrient(651,21,20,25));
        FoodData.Regular.put("Chicken Fried Rice with a side of pop",
                new Nutrient(433,12,34,11));
        FoodData.Regular.put("Hamburger with fries",
                new Nutrient(900,8,69,19));
        FoodData.Regular.put("Baked Salmon with Garlic and Dijon",
                new Nutrient(314,24,3,15));
        FoodData.Regular.put("Steak and rice",
                new Nutrient(493,71,94,18));
        FoodData.Regular.put("Spaghetti with tomato sauce and cooked ground beef",
                new Nutrient(700,20,33,13));
        FoodData.Vegetarian.put("Baked Banana-Nut Oatmeal with a cup of yogurt",
                new Nutrient(365,22,55,11));
        FoodData.Vegetarian.put("Oatmeal, 2 boiled eggs",
                new Nutrient(480,11,27,8));
        FoodData.Vegetarian.put("Thai Curry Pizza & smoothie",
                new Nutrient(620,12,21,9));
        FoodData.Vegetarian.put("Veggie Wrap",
                new Nutrient(345,0,9,1));
        FoodData.Vegetarian.put("Hummus Bowls",
                new Nutrient(534,12,6,5));
        FoodData.Vegetarian.put("2 Veggie Sandwich & salad",
                new Nutrient(750,41,0,36));
        FoodData.Vegetarian.put("2 Vegetarian Tacos & smoothie",
                new Nutrient(397,11,66,16));
        FoodData.Vegetarian.put("Curried Chickpea Stew & 2 Bread",
                new Nutrient(561,30,70,10));
        FoodData.Vegetarian.put("Tikka Masala & 2 Peanut-Butter Energy Balls",
                new Nutrient(714,2,10,10));
        FoodData.Vegan.put("Grain Toast with Peanut Butter & Banana",
                new Nutrient(377,5,46,5));
        FoodData.Vegan.put("Toast with avocado & Two Boiled Eggs",
                new Nutrient(515,20,38,21));
        FoodData.Vegan.put("3 pancakes with butter and syrup",
                new Nutrient(790,9,93,12));
        FoodData.Vegan.put("Vegan Superfood Buddha Bowls",
                new Nutrient(381,13,81,18));
        FoodData.Vegan.put("Lentil Bean Salad & bag of chickpeas",
                new Nutrient(804,7,15,10));
        FoodData.Vegan.put("Veggie Sandwich & 2 bananas & orange",
                new Nutrient(567,20,138,20));
        FoodData.Vegan.put("Vegan Quinoa Salad",
                new Nutrient(300,12,45,7));
        FoodData.Vegan.put("Chickpea Buddha Bowl",
                new Nutrient(481,20,67,25));
        FoodData.Vegan.put("Vegan Coconut Chickpea Curry",
                new Nutrient(733,20,57,6));
    }
}

