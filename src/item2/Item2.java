package item2;

/**
 * User: mpetzsch
 * Builders
 */
public class Item2 {
    public static void main(String[] args) {
        NutritionFacts nf = new NutritionFacts.Builder(1, 2).calories(100).fat(1000).carbohydrate(123).build();
        System.out.println("NutritionFacts: " + nf);
    }
}
