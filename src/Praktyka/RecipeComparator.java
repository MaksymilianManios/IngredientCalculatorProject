
package Praktyka;

import java.util.Comparator;

/**
 *
 * @author makma
 */
public class RecipeComparator implements Comparator<Recipe> {

    @Override
    public int compare(Recipe recipeOne, Recipe recipeTwo) {
        return recipeOne.getName().compareToIgnoreCase(recipeTwo.getName());
    }
    
}
