/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzzquizworldui;

import buzzquizworldui.history.BattleSerializable;
import buzzquizworldui.history.SinglePlayerSerializable;
import buzzquizworldui.utilities.GameLogger;
import java.awt.event.WindowEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import javax.swing.JFrame;

/**
 *
 * @author Jackie
 */
public class HistoryPanel extends javax.swing.JPanel {

    /**
     * Creates new form HistoryPanel
     */
    public HistoryPanel() throws IOException, FileNotFoundException, ClassNotFoundException {
        initComponents();
        showResults();
    }

    public void showResults() throws IOException, FileNotFoundException, ClassNotFoundException{
        List<SinglePlayerSerializable> resultsSinglePlayer = GameLogger.readSinglePlayerLogs();
        for(SinglePlayerSerializable data : resultsSinglePlayer){
            singlePlayerHistory.setText(singlePlayerHistory.getText()+data.toString()+"\n");
        }
        
        List<BattleSerializable> resultsBattle = GameLogger.readBattleLogs();
        for(BattleSerializable data : resultsBattle){
            multiPlayerHistory.setText(multiPlayerHistory.getText()+data.toString()+"\n");
        }
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        singlePlayerHistory = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        multiPlayerHistory = new javax.swing.JTextArea();
        multiPlayerLabel = new javax.swing.JLabel();
        singlePlayerLabel = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        singlePlayerHistory.setEditable(false);
        singlePlayerHistory.setColumns(20);
        singlePlayerHistory.setRows(5);
        jScrollPane1.setViewportView(singlePlayerHistory);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 240, 244));

        multiPlayerHistory.setEditable(false);
        multiPlayerHistory.setColumns(20);
        multiPlayerHistory.setRows(5);
        jScrollPane2.setViewportView(multiPlayerHistory);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 39, 230, 245));

        multiPlayerLabel.setText("Multi player:");
        add(multiPlayerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, -1, -1));

        singlePlayerLabel.setText("Single Player:");
        add(singlePlayerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea multiPlayerHistory;
    private javax.swing.JLabel multiPlayerLabel;
    private javax.swing.JTextArea singlePlayerHistory;
    private javax.swing.JLabel singlePlayerLabel;
    // End of variables declaration//GEN-END:variables
}
