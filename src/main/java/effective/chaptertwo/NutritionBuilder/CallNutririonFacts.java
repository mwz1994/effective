package effective.chaptertwo.NutritionBuilder;

public class CallNutririonFacts {

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(240,8).calories(100).sodium(35).carbohydrate(27).build();

        System.out.println(nutritionFacts.getCalories());
        System.out.println(nutritionFacts.getCarbohydrate());
        System.out.println(nutritionFacts.getFat());
        System.out.println(nutritionFacts.getServings());
        System.out.println(nutritionFacts.getServingSize());
        System.out.println(nutritionFacts.getSodium());
        System.out.println(nutritionFacts);
    }
}
