package Praktyka;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/*
 *
 * @author makma
 */

public class Recipe implements Comparable<Recipe> ,Serializable{
    
    /**
     *
     */
    transient public static final double ZERO = 0.0;
    transient public static final int ZERO_INT = 0;
    transient public static final int HUNDRED_PERCENT = 100;
    
    private String Name;
    private String Type;
    
    private List<Ingredient> IngredientList;
    transient public IngredientsModelList IngredientListModel;
    
    public Recipe(String NameOfRecipe,String TypeOfDish){
        this.Name = NameOfRecipe;
        this.Type = TypeOfDish;
        IngredientList = new ArrayList<>();
        IngredientListModel = new IngredientsModelList(IngredientList);
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public void setType(String Type) {
        this.Type = Type;
    }

    
    public String getName() {
        return Name;
    }   
    public String getType() {
        return Type;
    }  
    
    public List<Ingredient> getIngredientList() {
        return IngredientList;
    }
    
    public void RefreshListModel(){
        this.IngredientListModel = new IngredientsModelList(IngredientList);
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
        IngredientListModel.RefreshIngredientModel();
    }
    
    public void SetIngredientsOutputType(int OutputType){
        for(Ingredient ingredient:IngredientList){
            ingredient.setOutputStringType(OutputType);            
        }
        IngredientListModel.RefreshIngredientModel();
    }
    public void CalculateRealWaight(double multipier){
        for(Ingredient ing : IngredientList){
            ing.setRealWeight(ing.getTemplateWeight()*multipier);
        }
        RefreshListModel();
    }
    
    @Override
    public String toString(){
        return String.format("%50.40s %50.40s",Name,Type);
    }
    
    @Override
    public int compareTo(Recipe recipe) {
        return Name.compareToIgnoreCase(recipe.getName());
    }
}
