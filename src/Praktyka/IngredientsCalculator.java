/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktyka;

import javax.swing.JOptionPane;
/**
 *
 * @author makma
 */
public class IngredientsCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        List<Recipe> ListaPrzepisow = new ArrayList<>();
        List<Ingredient> ListaSkladnikow = new ArrayList<>();
        Recipe Przepis;
        Ingredient Skladnik;
        
        String RecipeName,RecipeType,IngredientName;
        Double TempWeight;
        Scanner Skaner = new Scanner(System.in);
        
        for(int i=0;i<1;i++){
            System.out.println("Podaj Nazwe Przepisu :");
            RecipeName = Skaner.nextLine();
            System.out.println("Podaj Typ Przepisu :");
            RecipeType = Skaner.nextLine();            
            ListaPrzepisow.add(new Recipe(RecipeName,RecipeType));
            for(int j = 0;j<3;j++){
                System.out.println("Podaj Nazwe Skladnika :");
                IngredientName = Skaner.nextLine();
                System.out.println("Podaj Wage Skladnika :");
                TempWeight = Skaner.nextDouble();
                Skaner.nextLine();
                ListaPrzepisow.get(i).IngredientListModel.AddIngredient(new Ingredient(IngredientName,TempWeight)); 
                ListaPrzepisow.get(i).IngredientListModel.getElementAt(j).setOutputStringType(j);
            }
        }
        ListaPrzepisow.get(0).CalculateIngredientsPercentageParticipation();
        System.out.println(ListaPrzepisow);
        for(int i = 0 ;i<ListaPrzepisow.get(0).IngredientListModel.getSize();i++){
            System.out.println(ListaPrzepisow.get(0).IngredientListModel.getElementAt(i));            
        }
*/
        MainWindowIngredientsCalculator window = new MainWindowIngredientsCalculator();
        window.setTitle("Recipe Base");
        window.setVisible(true);
//        Ingredient ingredient;
//        Recipe recipe = new Recipe("Chleb","Ciasto");
//        ingredient = new Ingredient("maka",500.0);
//        recipe.getIngredientList().add(ingredient);
//        ingredient = new Ingredient("woda",300.0);
//        recipe.getIngredientList().add(ingredient);
//        ingredient = new Ingredient("sol",20.0);
//        recipe.getIngredientList().add(ingredient);
//        ingredient = new Ingredient("drozdze",7.0);
//        recipe.getIngredientList().add(ingredient);
//        
//        RecipePanel recipePanel = new RecipePanel(recipe);        
//        int ret = JOptionPane.showConfirmDialog(null, recipePanel,"Recipe",JOptionPane.OK_CANCEL_OPTION);        
//        if(ret == JOptionPane.OK_OPTION){
//            recipePanel.getRecipe();
//            
//        }
    }
    
}
