package Praktyka;

import com.sun.glass.events.KeyEvent;
/**
 *
 * @author makma
 */
public class RecipeViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form RecipeViewPanel
     */
    public Recipe recipe; 
    public RecipeViewPanel() {
        initComponents();
        initList();
    }
    public RecipeViewPanel(Recipe recipe) {
        initComponents();
        this.recipe = recipe;        
        recipe.CalculateIngredientsPercentageParticipation();
        initList();
    }
    private void initList(){        
        jList1.setModel(recipe.IngredientListModel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        EstimateButton = new javax.swing.JButton();

        jScrollPane1.setViewportView(jList1);

        jLabel1.setText("Select an ingredient, Enter a value, confirm with Estimate");

        jTextField1.setText("0");
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jLabel2.setText("g");

        EstimateButton.setText("Estimate");
        EstimateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstimateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EstimateButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(EstimateButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EstimateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstimateButtonActionPerformed
        Ingredient ingredient = jList1.getSelectedValue();
        ingredient.setRealWeight(Double.valueOf(jTextField1.getText()));
        Double multiplier = ingredient.getRealWeight()/ingredient.getTemplateWeight();
        recipe.CalculateRealWaight(multiplier);
        recipe.SetIngredientsOutputType(Ingredient.NAME_AND_REAL_WEIGHT);
    }//GEN-LAST:event_EstimateButtonActionPerformed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if(!((c>='0') && (c<='9')
            || (c == KeyEvent.VK_BACKSPACE)
            || (c == KeyEvent.VK_DELETE)
            || (c == KeyEvent.VK_ENTER)
        )) {
            getToolkit().beep();
            evt.consume();
        }else if((c>='0') && (c<='9')){
            if(!jTextField1.getText().isEmpty()){
                double liczba = Double.parseDouble(jTextField1.getText() + c);
                if(liczba>999999){
                    getToolkit().beep();
                    evt.consume();
                }
            }
        }        
    }//GEN-LAST:event_jTextField1KeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EstimateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<Ingredient> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
