package Praktyka;

import java.util.Comparator;

/**
 *
 * @author makma
 */
public class IngredientComparator implements Comparator<Ingredient> {
        
    public static final int NAME_SORT = 0;
    public static final int TEMPLATE_WEIGHT_SORT = 1;
    public static final int PERCENTAGE_PARTICIPATION_SORT = 2;
    public static final int REAL_WEIGHT_SORT = 3;

    public IngredientComparator() {
        sortBy = NAME_SORT;
    }
    
    private int sortBy;

    public int getSortBy() {
        return sortBy;
    }

    public void setSortBy(int sortBy) {
        this.sortBy = sortBy;
    } 
    
    @Override
    public int compare(Ingredient ingredientOne, Ingredient ingredientTwo) {
        switch (sortBy){
            case TEMPLATE_WEIGHT_SORT:
                return Double.compare(ingredientOne.getTemplateWeight(),ingredientTwo.getTemplateWeight());
            case PERCENTAGE_PARTICIPATION_SORT:
                return Double.compare(ingredientOne.getPercentageParticipation(),ingredientTwo.getPercentageParticipation());
            case REAL_WEIGHT_SORT:
                return Double.compare(ingredientOne.getRealWeight(),ingredientTwo.getRealWeight());
            default:
                return ingredientOne.getName().compareToIgnoreCase(ingredientTwo.getName());                    
        }       
    }    
}
