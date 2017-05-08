/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ncsu.monopoly.gui;

import edu.ncsu.monopoly.PlayerRecord;
import edu.ncsu.monopoly.User;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;

/**
 *
 * @author Juan
 */
public class NewPlayer extends javax.swing.JFrame {

    PlayerRecord records;
    Color pickedColor = Color.WHITE;
    String rutaImagen = "";

    /**
     * Creates new form NewPlayer
     */
    public NewPlayer(PlayerRecord p) {
        initComponents();
        records = p;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton4 = new javax.swing.JButton();
        fileChooser = new javax.swing.JFileChooser();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnPhoto = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        yellowColor = new javax.swing.JButton();
        redColor = new javax.swing.JButton();
        greenColor = new javax.swing.JButton();
        pinkColor = new javax.swing.JButton();
        blueColor = new javax.swing.JButton();
        cyanColor = new javax.swing.JButton();
        orangeColor = new javax.swing.JButton();
        greyColor = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jButton4.setText("jButton4");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(583, 374));
        setMinimumSize(new java.awt.Dimension(583, 374));
        setPreferredSize(new java.awt.Dimension(583, 374));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(240, 270, 120, 40);

        jButton2.setText("Save");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 270, 120, 40);

        jLabel1.setText("Name:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 100, 31, 14);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(150, 100, 156, 20);

        jLabel2.setText("Color:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 130, 36, 31);

        jLabel3.setText("Photo:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(90, 230, 32, 14);

        btnPhoto.setText("Upload");
        btnPhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoActionPerformed(evt);
            }
        });
        getContentPane().add(btnPhoto);
        btnPhoto.setBounds(150, 220, 150, 23);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/newPlayer.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 10, 550, 70);

        yellowColor.setBackground(new java.awt.Color(255, 255, 0));
        yellowColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowColorActionPerformed(evt);
            }
        });
        getContentPane().add(yellowColor);
        yellowColor.setBounds(150, 130, 33, 31);

        redColor.setBackground(new java.awt.Color(255, 51, 51));
        redColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redColorActionPerformed(evt);
            }
        });
        getContentPane().add(redColor);
        redColor.setBounds(190, 130, 33, 31);

        greenColor.setBackground(java.awt.Color.green);
        greenColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenColorActionPerformed(evt);
            }
        });
        getContentPane().add(greenColor);
        greenColor.setBounds(230, 130, 33, 31);

        pinkColor.setBackground(java.awt.Color.magenta);
        pinkColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pinkColorActionPerformed(evt);
            }
        });
        getContentPane().add(pinkColor);
        pinkColor.setBounds(280, 130, 33, 31);

        blueColor.setBackground(java.awt.Color.blue);
        blueColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueColorActionPerformed(evt);
            }
        });
        getContentPane().add(blueColor);
        blueColor.setBounds(150, 170, 33, 31);

        cyanColor.setBackground(java.awt.Color.cyan);
        cyanColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cyanColorActionPerformed(evt);
            }
        });
        getContentPane().add(cyanColor);
        cyanColor.setBounds(190, 170, 33, 31);

        orangeColor.setBackground(java.awt.Color.orange);
        orangeColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orangeColorActionPerformed(evt);
            }
        });
        getContentPane().add(orangeColor);
        orangeColor.setBounds(230, 170, 33, 31);

        greyColor.setBackground(java.awt.Color.darkGray);
        greyColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greyColorActionPerformed(evt);
            }
        });
        getContentPane().add(greyColor);
        greyColor.setBounds(280, 170, 33, 31);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 5, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(350, 100, 148, 160);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtName.getText().length() > 0) {
            User player = new User(txtName.getText(), pickedColor, rutaImagen);
            records.addPlayer(player);
            UserUI userGui = new UserUI(records);
            userGui.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a name for the new player", "Empty name field", ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void yellowColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowColorActionPerformed
        pickedColor = Color.YELLOW;
    }//GEN-LAST:event_yellowColorActionPerformed

    private void redColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redColorActionPerformed
        pickedColor = Color.RED;
    }//GEN-LAST:event_redColorActionPerformed

    private void greenColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenColorActionPerformed
        pickedColor = Color.GREEN;
    }//GEN-LAST:event_greenColorActionPerformed

    private void pinkColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pinkColorActionPerformed
        pickedColor = Color.PINK;
    }//GEN-LAST:event_pinkColorActionPerformed

    private void blueColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueColorActionPerformed
        pickedColor = Color.BLUE;
    }//GEN-LAST:event_blueColorActionPerformed

    private void cyanColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cyanColorActionPerformed
        pickedColor = Color.CYAN;
    }//GEN-LAST:event_cyanColorActionPerformed

    private void orangeColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orangeColorActionPerformed
        pickedColor = Color.ORANGE;
    }//GEN-LAST:event_orangeColorActionPerformed

    private void greyColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greyColorActionPerformed
        pickedColor = Color.GRAY;
    }//GEN-LAST:event_greyColorActionPerformed

    private void btnPhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        Image myImage;
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String ruta = fileChooser.getSelectedFile().getPath();
            rutaImagen = ruta;
            ImageIcon myImageIcon = null;
            boolean isCorrect = false;

            try {
                myImage = ImageIO.read(new File(ruta));
                myImage = myImage.getScaledInstance(90, 90, java.awt.Image.SCALE_SMOOTH);
                myImageIcon = new ImageIcon(myImage);
                isCorrect = true;

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Format not allowed", "Wrong format", ERROR_MESSAGE);
            }
            if (isCorrect) {
                jLabel5.setIcon(myImageIcon);
                jPanel1.revalidate();
                jPanel1.repaint();
            }

        } else {
            System.out.println("El usuario no cargo imagen");
        }
    }//GEN-LAST:event_btnPhotoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blueColor;
    private javax.swing.JButton btnPhoto;
    private javax.swing.JButton cyanColor;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JButton greenColor;
    private javax.swing.JButton greyColor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton orangeColor;
    private javax.swing.JButton pinkColor;
    private javax.swing.JButton redColor;
    private javax.swing.JTextField txtName;
    private javax.swing.JButton yellowColor;
    // End of variables declaration//GEN-END:variables
}
