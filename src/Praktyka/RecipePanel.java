package Praktyka;
/**
 *
 * @author makma
 */
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RecipePanel extends javax.swing.JPanel {

    public Recipe recipe;    
    ImageIcon icon = new ImageIcon("C:/Users/makma/OneDrive/Pulpit/plikitext/Icon.jpg");
    public RecipePanel() {
        initComponents();
        this.recipe = new Recipe("New","Recipe");
        initText();
        initList();
    }
    public RecipePanel(Recipe recipe) {   
        initComponents();
        this.recipe = recipe;   
        initText();
        initList();
    }
    
    
    private void initText(){
        jTextField1.setText(recipe.getName());
        jTextField2.setText(recipe.getType());
        GramButton.setEnabled(false);
    }
    
    private void initList(){        
        jList1.setModel(recipe.IngredientListModel);
    }
    
    public Recipe getRecipe(){
        recipe.setName(jTextField1.getText());
        recipe.setType(jTextField2.getText());        
        return recipe;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        EditButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        GramButton = new javax.swing.JButton();
        PercentButton = new javax.swing.JButton();

        AddButton.setText("Add");
        AddButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButtonActionPerformed(evt);
            }
        });

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        EditButton.setText("Edit");
        EditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Name :");

        jLabel2.setText("Type :");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        GramButton.setText("g");
        GramButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GramButtonActionPerformed(evt);
            }
        });

        PercentButton.setText("%");
        PercentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PercentButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AddButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(DeleteButton)
                        .addGap(27, 27, 27)
                        .addComponent(EditButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GramButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PercentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GramButton)
                    .addComponent(PercentButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddButton)
                    .addComponent(DeleteButton)
                    .addComponent(EditButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AddButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButtonActionPerformed
        IngredientPanel ingredientPanel = new IngredientPanel(new Ingredient("New Ingredient",0.0));
        int ret = JOptionPane.showConfirmDialog(this,ingredientPanel,"New Ingredient",JOptionPane.OK_OPTION,JOptionPane.PLAIN_MESSAGE,icon);
        if(ret == JOptionPane.OK_OPTION){
            recipe.IngredientListModel.AddIngredient(ingredientPanel.getIngredient());
        }
    }//GEN-LAST:event_AddButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        List<Ingredient> selList = jList1.getSelectedValuesList();
        for(Ingredient ingredient:selList){
            recipe.IngredientListModel.RemoveIngredient(ingredient);
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void EditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditButtonActionPerformed
        Ingredient ingredient = jList1.getSelectedValue();
        IngredientPanel ingredientPanel = new IngredientPanel(ingredient);
        int ret = JOptionPane.showConfirmDialog(this, ingredientPanel,"Edit Ingredient",JOptionPane.OK_OPTION,JOptionPane.PLAIN_MESSAGE,icon);
        if(ret == JOptionPane.OK_OPTION){
            ingredientPanel.getIngredient();
            recipe.IngredientListModel.RefreshIngredientModel();
        }
    }//GEN-LAST:event_EditButtonActionPerformed

    private void PercentButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PercentButtonActionPerformed
        GramButton.setEnabled(true);
        PercentButton.setEnabled(false);
        recipe.CalculateIngredientsPercentageParticipation();
        recipe.SetIngredientsOutputType(Ingredient.NAME_AND_PERCENTAGE_PARTICIPATION);
        recipe.IngredientListModel.RefreshIngredientModel();
    }//GEN-LAST:event_PercentButtonActionPerformed

    private void GramButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GramButtonActionPerformed
        GramButton.setEnabled(false);
        PercentButton.setEnabled(true);        
        recipe.SetIngredientsOutputType(Ingredient.NAME_AND_TEMPLATE_WEIGHT);
        recipe.IngredientListModel.RefreshIngredientModel();
    }//GEN-LAST:event_GramButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddButton;
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton EditButton;
    private javax.swing.JButton GramButton;
    private javax.swing.JButton PercentButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<Ingredient> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
