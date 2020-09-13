package Praktyka;

import java.io.Serializable;

/**
 *
 * @author makma
 */

public class Ingredient implements Comparable<Ingredient>, Serializable{
    transient public static final double ZERO = 0.0;
    transient public static final int NAME_AND_TEMPLATE_WEIGHT = 0;
    transient public static final int NAME_AND_PERCENTAGE_PARTICIPATION = 1;
    transient public static final int NAME_AND_REAL_WEIGHT = 2;
    
    private String Name;
    private Double TemplateWeight;
    private Double PercentageParticipation;
    private Double RealWeight;
    private Integer OutputStringType;
    
    public Ingredient(String NameOfIngredient,Double TemplateWeightInGrams){        
        this.Name = NameOfIngredient;
        this.TemplateWeight = TemplateWeightInGrams;
        this.PercentageParticipation = ZERO;
        this.RealWeight = TemplateWeightInGrams;
        this.OutputStringType = NAME_AND_TEMPLATE_WEIGHT;
    }
    
    public Ingredient(){
        this.Name = "Ingredient Name";
        this.TemplateWeight = ZERO;
        this.PercentageParticipation = ZERO;
        this.RealWeight = ZERO;
        this.OutputStringType = NAME_AND_TEMPLATE_WEIGHT;
    }

    public String getName() {
        return Name;
    }
    public void setName(String Name) {
        this.Name = Name;
    }

    public Double getTemplateWeight() {
        return TemplateWeight;
    }
    public void setTemplateWeight(Double TemplateWeight) {
        this.TemplateWeight = TemplateWeight;
    } 
    
    public Double getPercentageParticipation() {
        return PercentageParticipation;
    }
    public void setPercentageParticipation(Double PercentageParticipation) {
        this.PercentageParticipation = PercentageParticipation;
    }    
    
    public Double getRealWeight() {
        return RealWeight;
    }
    public void setRealWeight(Double RealWeight) {
        this.RealWeight = RealWeight;
    }

    public void setOutputStringType(Integer OutputStringType) {
        this.OutputStringType = OutputStringType;
    }    
   
    @Override
    public String toString(){
        switch(OutputStringType){
            case NAME_AND_TEMPLATE_WEIGHT:
                return String.format("%-20s %-5.2f g",Name,TemplateWeight);
            case NAME_AND_PERCENTAGE_PARTICIPATION:
                return String.format("%-20s %-3.1f Percent",Name,PercentageParticipation);
            case NAME_AND_REAL_WEIGHT:
                return String.format("%-20s %-5.2f g",Name,RealWeight);
            default:
                return String.format("%-20s %-5.2f g",Name,TemplateWeight);
        }        
    }

    @Override
    public int compareTo(Ingredient ingredient) {
        return TemplateWeight.compareTo(ingredient.getTemplateWeight());
    }
}
