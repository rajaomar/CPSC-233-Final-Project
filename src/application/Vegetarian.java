package application;

public class Vegetarian extends Food{
    /**
     * extends Food class and stores the data of Vegetarian foods from food data
     */
    Vegetarian(){
        this.Food_Nutrients = FoodData.Vegetarian;
    }
    @Override
    int[] calculateCalories(Breakfast breakfast, Lunch lunch,Dinner dinner) {
        Nutrients breakfastNutrient = this.Food_Nutrients.get(breakfast.mealName);
        Nutrients lunchNutrient = this.Food_Nutrients.get(lunch.mealName);
        Nutrients dinnerNutrient = this.Food_Nutrients.get(dinner.mealName);
        int totalCalories = breakfastNutrient.totalCalories+
                lunchNutrient.totalCalories+dinnerNutrient.totalCalories;
        int totalProteins = breakfastNutrient.proteins+
                lunchNutrient.proteins+dinnerNutrient.proteins;
        int totalCarbs = breakfastNutrient.carbohydrates+
                lunchNutrient.carbohydrates+dinnerNutrient.carbohydrates;
        int totalFats = breakfastNutrient.fats+
                lunchNutrient.fats+dinnerNutrient.fats;
        return new int[]{totalCalories,totalProteins,totalCarbs,totalFats};
    }
}
