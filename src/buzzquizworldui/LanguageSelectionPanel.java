/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzzquizworldui;

import buzzquizworld.object.model.Game;
import buzzquizworld.object.model.enums.SupportedLanguage;
import buzzquizworld.object.model.ui.GameFactory;
import buzzquizworld.object.model.ui.UiRightAnswerGame;
import buzzquizworld.object.model.ui.UiRightAnswerGameWithBid;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Jackie
 */
public class LanguageSelectionPanel extends javax.swing.JPanel {
    private MainFrame frame;
    
    /**
     * Creates new form LanguageSelectionPanel
     */
    public LanguageSelectionPanel(MainFrame frame) {
        initComponents();
        this.frame = frame;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LanguageButtonGroup = new javax.swing.ButtonGroup();
        WelcomeLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        EnglishRadioButton = new javax.swing.JRadioButton();
        GreekRadioButton = new javax.swing.JRadioButton();
        nextButton = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(421, 300));
        setMinimumSize(new java.awt.Dimension(421, 300));
        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(421, 300));

        WelcomeLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        WelcomeLabel.setText("Welcome to buzz quiz wolrd");

        LanguageButtonGroup.add(EnglishRadioButton);
        EnglishRadioButton.setText("English");
        EnglishRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnglishRadioButtonActionPerformed(evt);
            }
        });

        LanguageButtonGroup.add(GreekRadioButton);
        GreekRadioButton.setText("Ελληνικά");
        GreekRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GreekRadioButtonActionPerformed(evt);
            }
        });

        nextButton.setText("Next");
        nextButton.setEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(GreekRadioButton)
                    .addComponent(EnglishRadioButton)
                    .addComponent(WelcomeLabel)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addGap(29, 29, 29))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(WelcomeLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(EnglishRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(GreekRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void EnglishRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnglishRadioButtonActionPerformed
        nextButton.setEnabled(true);
    }//GEN-LAST:event_EnglishRadioButtonActionPerformed

    private void GreekRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GreekRadioButtonActionPerformed
        nextButton.setEnabled(true);
    }//GEN-LAST:event_GreekRadioButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        try {
            this.frame.setLanguage(this.EnglishRadioButton.isSelected()?SupportedLanguage.ENGLISH:SupportedLanguage.GREEK);
            this.frame.OpenNewGamePanel();
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(LanguageSelectionPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(LanguageSelectionPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nextButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton EnglishRadioButton;
    private javax.swing.JRadioButton GreekRadioButton;
    private javax.swing.ButtonGroup LanguageButtonGroup;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton nextButton;
    // End of variables declaration//GEN-END:variables
}
