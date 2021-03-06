package GUIView;

import java.util.ArrayList;
import java.util.List;
import model.DicePoker;
import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Main controller/view class responsible for controlling data flow between
 * model and display
 * @author Jakub Zaremba
 * @version 3.0
 * @since 2020-12-06
 */
public class dicePokerGUI extends javax.swing.JFrame {

    DicePoker dicePoker = new DicePoker();

    /**
     * Array that contain arguments passed by user;
     */
    String[] mainArgs;
    /**
     * List with validated data - dice polls - provided by user
     */
    List<Integer> userParameters = new ArrayList<>();
    /**
     * Table row current cursor position
     */
    int nextRow = 0;

    /**
     * Function that get arguments passed by user to Main function 
     * @param args parameters from main function, that should defined as
     * dice polls
     */
    private void takeUserArgs(String args[]) {
        mainArgs = args;
    }

     /**
     * Function that validates user passed arguments 
     */
    private void validateUserArgs() {
        if (mainArgs.length == 5) {
            try {
                for (int i = 0; i < 5; i++) {
                    userParameters.add(Integer.valueOf(mainArgs[i]));
                }
                showMessageDialog(null, "Pobranie listy argumentow podanych przez użytkownika: "
                        + userParameters.get(0) + ", " + userParameters.get(1) + ", "
                        + userParameters.get(2) + ", " + userParameters.get(3) + ", " + userParameters.get(4));
            } catch (NumberFormatException ex) {
                showMessageDialog(null, "Podane argumenty sa złe");
                userParameters.clear();
                for (int i = 0; i < 5; i++) {
                    userParameters.add(1);
                }
            }
        } else {
            for (int i = 0; i < 5; i++) {
                userParameters.add(1);
            }
        }
    }

    /**
     * Creates new form dicePokerGUI
     * @param args arguments from main function
     */
    public dicePokerGUI(String args[]) {
        initComponents();
        takeUserArgs(args);
        validateUserArgs();
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
        jTable1 = new javax.swing.JTable();
        diceBox1 = new javax.swing.JComboBox<>();
        diceBox2 = new javax.swing.JComboBox<>();
        diceBox3 = new javax.swing.JComboBox<>();
        diceBox4 = new javax.swing.JComboBox<>();
        diceBox5 = new javax.swing.JComboBox<>();
        showFigure = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaWynikow = new javax.swing.JTable();
        clearTable = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        diceBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));

        diceBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        diceBox2.setSelectedIndex(1);

        diceBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        diceBox3.setSelectedIndex(2);

        diceBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        diceBox4.setSelectedIndex(3);

        diceBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        diceBox5.setSelectedIndex(4);

        showFigure.setText("Show Figure");
        showFigure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showFigureActionPerformed(evt);
            }
        });

        tabelaWynikow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kosc nr 1", "Kosc nr 2", "Kosc nr 3", "Kosc nr 4", "Kosc nr 5", "Figura"
            }
        ));
        tabelaWynikow.setGridColor(new java.awt.Color(0, 0, 0));
        tabelaWynikow.setShowGrid(true);
        jScrollPane2.setViewportView(tabelaWynikow);

        clearTable.setText("Clear table");
        clearTable.setToolTipText("");
        clearTable.setActionCommand("Clear Table");
        clearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diceBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diceBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(diceBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(diceBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(diceBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showFigure, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearTable, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(diceBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diceBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diceBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diceBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(diceBox5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showFigure, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearTable, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    /**
     * Function that write data to table when user press button
     * @param evt Event that waits for user to press button
     */
    private void showFigureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showFigureActionPerformed
        List<Integer> diceSelectedPolls = new ArrayList();
        diceSelectedPolls.add(Integer.parseInt(diceBox1.getSelectedItem().toString()));
        diceSelectedPolls.add(Integer.parseInt(diceBox2.getSelectedItem().toString()));
        diceSelectedPolls.add(Integer.parseInt(diceBox3.getSelectedItem().toString()));
        diceSelectedPolls.add(Integer.parseInt(diceBox4.getSelectedItem().toString()));
        diceSelectedPolls.add(Integer.parseInt(diceBox5.getSelectedItem().toString()));
        String PokerFigure = dicePoker.checkFigure(diceSelectedPolls);
        try {
            tabelaWynikow.setValueAt(diceBox1.getSelectedItem().toString(), nextRow, 0);
            tabelaWynikow.setValueAt(diceBox2.getSelectedItem().toString(), nextRow, 1);
            tabelaWynikow.setValueAt(diceBox3.getSelectedItem().toString(), nextRow, 2);
            tabelaWynikow.setValueAt(diceBox4.getSelectedItem().toString(), nextRow, 3);
            tabelaWynikow.setValueAt(diceBox5.getSelectedItem().toString(), nextRow, 4);
            tabelaWynikow.setValueAt(PokerFigure, nextRow, 5);
            showMessageDialog(null, "Twoj układ to " + PokerFigure);
            nextRow++;
        } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
            showMessageDialog(null, "Za dużo elementow w tablicy, wyczyść ją");
        }
    }//GEN-LAST:event_showFigureActionPerformed
    /**
     * Function that clear table out of data
     * @param evt Event that waits for user to press button
     */
    private void clearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearTableActionPerformed
        for (int i = 0; i < nextRow; i++) {
            tabelaWynikow.setValueAt(null, i, 0);
            tabelaWynikow.setValueAt(null, i, 1);
            tabelaWynikow.setValueAt(null, i, 2);
            tabelaWynikow.setValueAt(null, i, 3);
            tabelaWynikow.setValueAt(null, i, 4);
            tabelaWynikow.setValueAt(null, i, 5);
        }
        if (nextRow != 0) {
            showMessageDialog(null, "Tablica wyczyszczona");
        }
        nextRow = 0;
    }//GEN-LAST:event_clearTableActionPerformed

    
     /**
     * Function initialize poll values in dice ComboBox
     * @param evt Event that waits for window to load up
     */
    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        diceBox1.setSelectedIndex(userParameters.get(0) - 1);
        diceBox2.setSelectedIndex(userParameters.get(1) - 1);
        diceBox3.setSelectedIndex(userParameters.get(2) - 1);
        diceBox4.setSelectedIndex(userParameters.get(3) - 1);
        diceBox5.setSelectedIndex(userParameters.get(4) - 1);
    }//GEN-LAST:event_formComponentShown

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearTable;
    private javax.swing.JComboBox<String> diceBox1;
    private javax.swing.JComboBox<String> diceBox2;
    private javax.swing.JComboBox<String> diceBox3;
    private javax.swing.JComboBox<String> diceBox4;
    private javax.swing.JComboBox<String> diceBox5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton showFigure;
    private javax.swing.JTable tabelaWynikow;
    // End of variables declaration//GEN-END:variables
}
