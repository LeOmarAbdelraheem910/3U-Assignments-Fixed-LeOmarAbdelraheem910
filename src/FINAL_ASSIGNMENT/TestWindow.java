/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package FINAL_ASSIGNMENT;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.Icon;

/**
 *
 * @author abdeo8431
 */
public class TestWindow extends javax.swing.JFrame {

    /**
     * Creates new form TestWindow
     */
    public TestWindow() {
        initComponents();
    }
    public void setIcon(String name){
       elementImage.setIcon(new javax.swing.ImageIcon(name));
    }   
    public void setAtomicNumber(String name){
        atomicNumber.setText(name);
    }
    public void setAverageAtomicMass(String name){
        atomicMass.setText(name);
    }
    public void setElementName(String name){
        elementName.setText(name);
    }
    public void setSeries(String name){
        series.setText(name);
    }
    public void setState(String name){
        state.setText(name);
    }
    public void setMeltingPoint(String name){
        meltingPoint.setText(name);
    }
    public void setBoilingPoint(String name){
        boilingPoint.setText(name);
    }
    public void setElectronegativity(String name){
        electronegativity.setText(name);
    }
    public void setElectronAffinity(String name){
        electronAffinity.setText(name);
    }
    public void setValenceElectrons(String name){
        valenceElectrons.setText(name);
    }
    public void setIonization(String name){
        ionization.setText(name);
    }
    public void setRadius(String name){
        radius.setText(name);
    }
    public void setHardness(String name){
        hardness.setText(name);
    }
    public void setModulus(String name){
        modulus.setText(name);
    }
    public void setDensity(String name){
        density.setText(name);
    }
    public void setConductivity(String name){
        conductivity.setText(name);
    }
    public void setHeat(String name){
        heat.setText(name);
    }
    public void setAbundance(String name){
        abundance.setText(name);
    }
    public void setDiscovered(String name){
       discovered.setText(name);
    }
    public void setElectronArrangement(String name){
        electronArrangement.setText(name);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elementName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        series = new javax.swing.JLabel();
        state = new javax.swing.JLabel();
        meltingPoint = new javax.swing.JLabel();
        boilingPoint = new javax.swing.JLabel();
        electronegativity = new javax.swing.JLabel();
        electronAffinity = new javax.swing.JLabel();
        valenceElectrons = new javax.swing.JLabel();
        ionization = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        radius = new javax.swing.JLabel();
        hardness = new javax.swing.JLabel();
        modulus = new javax.swing.JLabel();
        density = new javax.swing.JLabel();
        conductivity = new javax.swing.JLabel();
        heat = new javax.swing.JLabel();
        abundance = new javax.swing.JLabel();
        discovered = new javax.swing.JLabel();
        electronArrangement = new javax.swing.JLabel();
        elementImage = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        atomicNumber = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        atomicMass = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        elementName.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        elementName.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Series:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("State at 273K:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Melting Point:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Boiling Point:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Electronegativity:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Electron Affinity:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Valence Electrons:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Ionization:");

        series.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        series.setText("yep this is a textbox");

        state.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        state.setText("yep this is a textbox");

        meltingPoint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        meltingPoint.setText("yep this is a textbox");

        boilingPoint.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        boilingPoint.setText("yep this is a textbox");

        electronegativity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        electronegativity.setText("yep this is a textbox");

        electronAffinity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        electronAffinity.setText("yep this is a textbox");

        valenceElectrons.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        valenceElectrons.setText("yep this is a textbox");

        ionization.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ionization.setText("yep this is a textbox");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Radius:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Hardness:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Modulus:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Density:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Conductivity:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Heat:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Abundance:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Discovered:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Electron Arrangement:");

        radius.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        radius.setText("yep this is a textbox");

        hardness.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hardness.setText("yep this is a textbox");

        modulus.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        modulus.setText("yep this is a textbox");

        density.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        density.setText("yep this is a textbox");

        conductivity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        conductivity.setText("yep this is a textbox");

        heat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        heat.setText("yep this is a textbox");

        abundance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        abundance.setText("yep this is a textbox");

        discovered.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        discovered.setText("yep this is a textbox");

        electronArrangement.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        electronArrangement.setText("yep this is a textbox");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Atomic Number:");

        atomicNumber.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        atomicNumber.setText("yep this is a textbox");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Average Atomic Mass:");

        atomicMass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        atomicMass.setText("yep this is a textbox");

        jLabel20.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel20.setText("Properties:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(elementImage, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(elementName)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(6, 6, 6)
                                .addComponent(series))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(6, 6, 6)
                                .addComponent(state))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(6, 6, 6)
                                .addComponent(meltingPoint))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(6, 6, 6)
                                .addComponent(boilingPoint))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(6, 6, 6)
                                .addComponent(electronegativity))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(6, 6, 6)
                                .addComponent(electronAffinity))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(6, 6, 6)
                                .addComponent(valenceElectrons))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(6, 6, 6)
                                .addComponent(ionization))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atomicNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(atomicMass)))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(electronArrangement))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(radius))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6)
                                .addComponent(hardness))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(10, 10, 10)
                                .addComponent(modulus))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(10, 10, 10)
                                .addComponent(density))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(conductivity))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(10, 10, 10)
                                .addComponent(heat))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(10, 10, 10)
                                .addComponent(abundance))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(10, 10, 10)
                                .addComponent(discovered))))
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(elementName)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(elementImage, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(radius))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(hardness))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(modulus))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(density))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(conductivity))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(heat))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(abundance))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(discovered))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(electronArrangement)
                            .addComponent(jLabel17))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(atomicNumber))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(atomicMass))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(series))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(state))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(meltingPoint))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(boilingPoint))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(electronegativity))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(electronAffinity))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(valenceElectrons))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(ionization))
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel abundance;
    private javax.swing.JLabel atomicMass;
    private javax.swing.JLabel atomicNumber;
    private javax.swing.JLabel boilingPoint;
    private javax.swing.JLabel conductivity;
    private javax.swing.JLabel density;
    private javax.swing.JLabel discovered;
    private javax.swing.JLabel electronAffinity;
    private javax.swing.JLabel electronArrangement;
    private javax.swing.JLabel electronegativity;
    private javax.swing.JLabel elementImage;
    private javax.swing.JLabel elementName;
    private javax.swing.JLabel hardness;
    private javax.swing.JLabel heat;
    private javax.swing.JLabel ionization;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel meltingPoint;
    private javax.swing.JLabel modulus;
    private javax.swing.JLabel radius;
    private javax.swing.JLabel series;
    private javax.swing.JLabel state;
    private javax.swing.JLabel valenceElectrons;
    // End of variables declaration//GEN-END:variables

    }

