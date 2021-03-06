/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.GameBoard;
import edu.ncsu.monopoly.GameMaster;
import edu.ncsu.monopoly.PlayerRecord;
import edu.ncsu.monopoly.User;
import edu.ncsu.monopoly.test.boardScenarios.GameBoardFull;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Juan
 */
public class PreGameUI extends javax.swing.JFrame {
    
    PlayerRecord save;
    ArrayList<User> activePlayers;

    /**
     * Creates new form PreGameUI
     *
     * @param users
     */
    public PreGameUI(PlayerRecord users) {
        initComponents();
        save = users;
        activePlayers = new ArrayList<>();
        cargarListaJugadores();
        cargarListaJugadoresActivos();
        btnPlay.setEnabled(false);
        if (save.getListPlayers().isEmpty()) {
            btnAdd.setEnabled(false);
            btnRemove.setEnabled(false);
            
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
        tablePlayerList = new javax.swing.JTable();
        spinnerNumber = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableActivePlayers = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnPlay = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablePlayerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "List of players"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePlayerList);
        if (tablePlayerList.getColumnModel().getColumnCount() > 0) {
            tablePlayerList.getColumnModel().getColumn(0).setResizable(false);
        }

        spinnerNumber.setModel(new javax.swing.SpinnerNumberModel(2, 2, 6, 1));

        tableActivePlayers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Match players"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tableActivePlayers);
        if (tableActivePlayers.getColumnModel().getColumnCount() > 0) {
            tableActivePlayers.getColumnModel().getColumn(0).setResizable(false);
        }

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel1.setText("Number of players:");

        btnPlay.setText("Play!");
        btnPlay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlayActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/config.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinnerNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnPlay, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAdd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPlay, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (tablePlayerList.getSelectedRow() >= 0 && !activePlayers.contains(save.getListPlayers().get(tablePlayerList.getSelectedRow())) && save.getListPlayers().size() > 0 && activePlayers.size() + 1 <= (Integer) spinnerNumber.getValue()) {
            activePlayers.add(save.getListPlayers().get(tablePlayerList.getSelectedRow()));
            cargarListaJugadoresActivos();
    }//GEN-LAST:event_btnAddActionPerformed
       else if (activePlayers.contains(save.getListPlayers().get(tablePlayerList.getSelectedRow()))) {
            
            JOptionPane.showMessageDialog(this, "Please select a different User", "Duplicated user", JOptionPane.INFORMATION_MESSAGE);
        } else if (save.getListPlayers().size() == 0) {
            
            JOptionPane.showMessageDialog(this, "No enough users to start, please add more and start again", "Not enough users", JOptionPane.INFORMATION_MESSAGE);
        } else if (activePlayers.size() + 1 > (Integer) spinnerNumber.getValue()) {
            JOptionPane.showMessageDialog(this, "No more players allowed, please change the number of players", "Max players reached", JOptionPane.INFORMATION_MESSAGE);
            
        }
        
        if (activePlayers.size() == (Integer) spinnerNumber.getValue()) {
            btnPlay.setEnabled(true);
            
        }
        
    }
    private void btnPlayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlayActionPerformed
        if ((Integer) spinnerNumber.getValue() == activePlayers.size()) {
            
		GameMaster master = GameMaster.instance();
		MainWindow window = new MainWindow();
		GameBoard gameBoard = new GameBoardFull();
		

		master.setGameBoard(gameBoard);
                GameMaster.instance().setNumberOfPlayers(activePlayers.size());
		for(int i = 0; i < activePlayers.size(); i++) {
				
			GameMaster.instance().getPlayer(i).setName(activePlayers.get(i).getName());
                        GameMaster.instance().getPlayer(i).setFichaColor(activePlayers.get(i).getChipColor());
                        activePlayers.get(i).setGamesPlayed(activePlayers.get(i).getGamesPlayed()+1);
		}
		window.setupGameBoard(gameBoard);
		window.show();
		master.setGUI(window);
		master.startGame();
	} 
    }//GEN-LAST:event_btnPlayActionPerformed

    

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (tableActivePlayers.getSelectedRow() >= 0) {
            activePlayers.remove(activePlayers.get(tableActivePlayers.getSelectedRow()));
            cargarListaJugadoresActivos();
        }
        btnPlay.setEnabled(false);
    }//GEN-LAST:event_btnRemoveActionPerformed
    
    public void cargarListaJugadores() {
        borrarCacheTabla(tablePlayerList);
        DefaultTableModel modelo = (DefaultTableModel) tablePlayerList.getModel();
        ArrayList<User> jugadoresLista = save.getListPlayers();
        for (int i = 0; i < jugadoresLista.size(); i++) {
            User jug = jugadoresLista.get(i);
            modelo.addRow(new Object[][]{{null, null, null, null, null, null}});
            tablePlayerList.setValueAt(jug.getName(), i, 0);
            
        }
    }
    
    public void cargarListaJugadoresActivos() {
        borrarCacheTabla(tableActivePlayers);
        DefaultTableModel modelo = (DefaultTableModel) tableActivePlayers.getModel();
        for (int i = 0; i < activePlayers.size(); i++) {
            User jug = activePlayers.get(i);
            modelo.addRow(new Object[][]{{null, null, null, null, null, null}});
            tableActivePlayers.setValueAt(jug.getName(), i, 0);
            
        }
    }
    
    private void borrarCacheTabla(JTable j) {
        DefaultTableModel modelo = (DefaultTableModel) j.getModel();
        int filas = j.getRowCount();
        for (int i = 0; i < filas; i++) {
            modelo.removeRow(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnPlay;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinnerNumber;
    private javax.swing.JTable tableActivePlayers;
    private javax.swing.JTable tablePlayerList;
    // End of variables declaration//GEN-END:variables
}
