/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Praktyka;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 *
 * @author makma
 */

public class Recipe implements Comparable<Recipe> ,Serializable{
    
    public static final double ZERO = 0.0;
    public static final int ZERO_INT = 0;
    public static final int HUNDRED_PERCENT = 100;
    
    private final String Name;
    private final String Type;
    
    private List<Ingredient> IngredientList;
    public IngredientsModelList IngredientListModel;
    
    public Recipe(String NameOfRecipe,String TypeOfDish){
        this.Name = NameOfRecipe;
        this.Type = TypeOfDish;
        IngredientList = new ArrayList<>();
        IngredientListModel = new IngredientsModelList(IngredientList);
    }

    public String getName() {
        return Name;
    }    
    
    public List<Ingredient> getIngredientList() {
        return IngredientList;
    }
    
    public void setIngredientList(List<Ingredient> IngredientList) {
        this.IngredientList = IngredientList;
        IngredientListModel = new IngredientsModelList(this.IngredientList);        
    }
    
    public void CalculateIngredientsPercentageParticipation(){
        Double TotalWeight = ZERO,GramsToPercent = 0.01;
        for(int IngredientIndex = ZERO_INT ; IngredientIndex<IngredientListModel.getSize();IngredientIndex++){
            TotalWeight += IngredientListModel.getElementAt(IngredientIndex).getTemplateWeight();
        } 
        if(TotalWeight!=ZERO){
            GramsToPercent = HUNDRED_PERCENT/TotalWeight;
        }
        for(int IngredientIndex = ZERO_INT ; IngredientIndex<IngredientListModel.getSize();IngredientIndex++){
            IngredientListModel.getElementAt(IngredientIndex).setPercentageParticipation(IngredientListModel.getElementAt(IngredientIndex).getTemplateWeight()*GramsToPercent);
        }
    }
    
    public void SetIngredientsOutputType(int OutputType){
        for(Ingredient ingredient:IngredientList){
            ingredient.setOutputStringType(OutputType);            
        }
        IngredientListModel.RefreshIngredientModel();
    }
    
    @Override
    public String toString(){
        return String.format("|%-20s|%-20s|",Name,Type);
    }
    
    @Override
    public int compareTo(Recipe recipe) {
        return Name.compareToIgnoreCase(recipe.getName());
    }
}
