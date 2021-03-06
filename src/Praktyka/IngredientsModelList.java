package Praktyka;

import java.util.Collections;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 *
 * @author makma
 */
public class IngredientsModelList extends AbstractListModel<Ingredient>{
    
    List<Ingredient> IngredientList;    
    IngredientComparator ingredientComparator = new IngredientComparator();
    
    public IngredientsModelList(List<Ingredient> IngredientList) {
        this.IngredientList = IngredientList;
    } 
    
    public void setIngredientList(List<Ingredient> IngredientList) {
        this.IngredientList = IngredientList;
    }
    
    @Override
    public int getSize() {
        return IngredientList.size();
    }
    
    @Override
    public Ingredient getElementAt(int IngredientPosition) {
        try {
            return IngredientList.get(IngredientPosition);
        }
        catch(IndexOutOfBoundsException outOfListException){
            return null;
        } 
    }
    
    public void RefreshIngredientModel(){
        fireContentsChanged(this, 0, IngredientList.size()-1);
    }
    
    public void AddIngredient(Ingredient NewIngredient){
        IngredientList.add(NewIngredient);
        RefreshIngredientModel();
    }
    
    public void RemoveIngredient(Ingredient IngredientToDelete){
        IngredientList.remove(IngredientToDelete);
        RefreshIngredientModel();
    } 
    
    public void SortIngredientList(Integer SORT_STYLE){
        ingredientComparator.setSortBy(SORT_STYLE);
        Collections.sort(IngredientList,ingredientComparator);
        RefreshIngredientModel();
    }
}
