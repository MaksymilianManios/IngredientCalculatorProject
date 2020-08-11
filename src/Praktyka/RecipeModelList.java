
package Praktyka;

import java.util.Collections;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author makma
 */
public class RecipeModelList extends AbstractListModel<Recipe>{
   
    List<Recipe> RecipeList;
    RecipeComparator recipeComparator = new RecipeComparator();

    public RecipeModelList(List<Recipe> RecipeList) {
        this.RecipeList = RecipeList;
        Collections.sort(RecipeList,recipeComparator);
    }
    
    public void setRecipeList(List<Recipe> RecipeList) {
        this.RecipeList = RecipeList;
        Collections.sort(RecipeList, recipeComparator);
        RefreshRecipeModel();
    }

    @Override
    public int getSize() {
        return RecipeList.size();
    }

    @Override
    public Recipe getElementAt(int RecipePosition) {
        try {
            return RecipeList.get(RecipePosition);
        }
        catch(IndexOutOfBoundsException outOfListException){
            return null;
        } 
    }
    
    public void RefreshRecipeModel(){
        fireContentsChanged(this, 0, RecipeList.size()-1);
    }
    
    public void AddRecipe(Recipe NewRecipe){
        RecipeList.add(NewRecipe);
        Collections.sort(RecipeList, recipeComparator);
        RefreshRecipeModel();
    }
    
    public void RemoveRecipe(Recipe RecipeToDelete){
        RecipeList.remove(RecipeToDelete);
        RefreshRecipeModel();
    }  
}
