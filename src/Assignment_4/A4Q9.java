/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment_4;

/**
 *
 * @author Omar
 */
public class A4Q9 extends javax.swing.JFrame {

    /**
     * Creates new form A4Q9
     */
    public A4Q9() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstNumberTextField = new javax.swing.JTextField();
        secondNumberTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        resultTextField = new javax.swing.JTextField();
        additionButton = new javax.swing.JButton();
        subtractionButton = new javax.swing.JButton();
        multiplicationButton = new javax.swing.JButton();
        divisionButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        secondNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                secondNumberTextFieldActionPerformed(evt);
            }
        });

        jLabel1.setText("First Number:");

        jLabel2.setText("Second Number:");

        jLabel3.setText("Result:");

        resultTextField.setEditable(false);
        resultTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultTextFieldActionPerformed(evt);
            }
        });

        additionButton.setText("Add");
        additionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additionButtonActionPerformed(evt);
            }
        });

        subtractionButton.setText("Sub");
        subtractionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractionButtonActionPerformed(evt);
            }
        });

        multiplicationButton.setText("Multi");
        multiplicationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicationButtonActionPerformed(evt);
            }
        });

        divisionButton.setText("Div");
        divisionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisionButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Welcome to this special calculator app where you only do simple math because you're simple!");

        jLabel5.setText("Please enter two numbers and choose your operation:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel1))
                                        .addGap(32, 32, 32))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(firstNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(secondNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(additionButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(subtractionButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multiplicationButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divisionButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(firstNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(secondNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(additionButton)
                    .addComponent(subtractionButton)
                    .addComponent(multiplicationButton)
                    .addComponent(divisionButton))
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subtractionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractionButtonActionPerformed
        //Convert the two numbers entered in the two text fields in doubles (number form)
        String firstNumberString = firstNumberTextField.getText();

        double firstNumber = Double.parseDouble(firstNumberString);

        String secondNumberString = secondNumberTextField.getText();

        double secondNumber = Double.parseDouble(secondNumberString);

        //perform the operation between the first and second number (indicated by the button --> substraction)
        double result = firstNumber - secondNumber;

        //display the result in the results section
        String resultText = Double.toString(result);

        resultTextField.setText(resultText);
    }//GEN-LAST:event_subtractionButtonActionPerformed

    private void resultTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resultTextFieldActionPerformed

    private void additionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additionButtonActionPerformed

        String firstNumberString = firstNumberTextField.getText();

        double firstNumber = Double.parseDouble(firstNumberString);

        String secondNumberString = secondNumberTextField.getText();

        double secondNumber = Double.parseDouble(secondNumberString);

        //perform the operation between the first and second number (indicated by the button --> addition)
        double result = firstNumber + secondNumber;

        String resultText = Double.toString(result);

        resultTextField.setText(resultText);
    }//GEN-LAST:event_additionButtonActionPerformed

    private void multiplicationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicationButtonActionPerformed

        String firstNumberString = firstNumberTextField.getText();

        double firstNumber = Double.parseDouble(firstNumberString);

        String secondNumberString = secondNumberTextField.getText();

        double secondNumber = Double.parseDouble(secondNumberString);

        //perform the operation between the first and second number (indicated by the button --> multiplication)
        double result = firstNumber * secondNumber;

        String resultText = Double.toString(result);

        resultTextField.setText(resultText);
    }//GEN-LAST:event_multiplicationButtonActionPerformed

    private void divisionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisionButtonActionPerformed

        String firstNumberString = firstNumberTextField.getText();

        double firstNumber = Double.parseDouble(firstNumberString);

        String secondNumberString = secondNumberTextField.getText();

        double secondNumber = Double.parseDouble(secondNumberString);

        //perform the operation between the first and second number (indicated by the button --> division)
        double result = firstNumber / secondNumber;

        String resultText = Double.toString(result);

        resultTextField.setText(resultText);
    }//GEN-LAST:event_divisionButtonActionPerformed

    private void secondNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_secondNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_secondNumberTextFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(A4Q9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(A4Q9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(A4Q9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(A4Q9.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new A4Q9().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton additionButton;
    private javax.swing.JButton divisionButton;
    private javax.swing.JTextField firstNumberTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton multiplicationButton;
    private javax.swing.JTextField resultTextField;
    private javax.swing.JTextField secondNumberTextField;
    private javax.swing.JButton subtractionButton;
    // End of variables declaration//GEN-END:variables
}
