public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();

        System.out.println("Veg Meal");

        vegMeal.showItems();

        System.out.println("Total Cost: " + vegMeal.getCost());
        MealBuilder mealBuilder1 = new MealBuilder();
        Meal NonVegMeal=mealBuilder1.prepareNonVegMeal();

        System.out.println("Non Veg Meal");

        NonVegMeal.showItems();
        System.out.println("Total Cost: "+ NonVegMeal.getCost());




    }
}
