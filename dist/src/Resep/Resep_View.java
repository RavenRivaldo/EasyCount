/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resep;

import DataBarangAdmin.DatabahanAdmin_View;
import HitungBelanja.Hitungbelanja_View;
import Input_Menu.Form_Inputmenu;
import MenuUtama1.FromUtama;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Raven
 */
public class Resep_View extends javax.swing.JFrame {

    /**
     * Creates new form Resep_View
     */
    Resep_Controller controller;
    public Resep_View() throws SQLException {
        initComponents();
        dispose();
        controller = new Resep_Controller(this);
        controller.isiTabelbahan();
        controller.isiTabelresep();
        controller.AutoIsiKodeTransaksi(this);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public JSpinner getSpn_jumlah() {
        return spn_jumlah;
    }

    public JTable getTbl_bahan() {
        return tbl_bahan;
    }

    public JTable getTbl_resep() {
        return tbl_resep;
    }

    public JTextField getTxt_idbahan() {
        return txt_idbahan;
    }

    public JTextField getTxt_kodemenu() {
        return txt_kodemenu;
    }

    public JTextField getTxt_namabahan() {
        return txt_namabahan;
    }

    public JTextField getTxt_idpakai() {
        return txt_idpakai;
    }

    public javax.swing.JTextField getTxtsatuan() {
        return txtsatuan;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_resep = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt_kodemenu = new javax.swing.JTextField();
        txt_namabahan = new javax.swing.JTextField();
        txt_idbahan = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_bahan = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        spn_jumlah = new javax.swing.JSpinner();
        btn_update = new javax.swing.JButton();
        btn_insert1 = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txt_idpakai = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtsatuan = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_tambahresep = new javax.swing.JButton();
        btn_databahan = new javax.swing.JButton();
        btn_Laporan = new javax.swing.JButton();
        btn_Keluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_tambahmenu1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 153, 255));

        tbl_resep.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode Menu", "Id Bahan", "Nama", "Jumlah", "Satuan"
            }
        ));
        tbl_resep.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_resepMouseClicked(evt);
            }
        });
        tbl_resep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tbl_resepKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_resep);

        jLabel9.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 24)); // NOI18N
        jLabel9.setText("Kode Menu");

        jLabel10.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 24)); // NOI18N
        jLabel10.setText("Id Bahan");

        jLabel11.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 24)); // NOI18N
        jLabel11.setText("Nama Bahan");

        jLabel12.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 24)); // NOI18N
        jLabel12.setText("Satuan");

        txt_kodemenu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_kodemenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kodemenuActionPerformed(evt);
            }
        });

        txt_namabahan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        txt_idbahan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_idbahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idbahanActionPerformed(evt);
            }
        });
        txt_idbahan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_idbahanKeyPressed(evt);
            }
        });

        tbl_bahan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id Bahan", "Nama"
            }
        ));
        jScrollPane2.setViewportView(tbl_bahan);

        jLabel13.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 24)); // NOI18N
        jLabel13.setText("Data Bahan");

        spn_jumlah.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        btn_update.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 18)); // NOI18N
        btn_update.setText("Edit");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        btn_insert1.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 18)); // NOI18N
        btn_insert1.setText("Tambahkan");
        btn_insert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_insert1ActionPerformed(evt);
            }
        });

        btn_delete.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 18)); // NOI18N
        btn_delete.setText("Hapus");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 24)); // NOI18N
        jLabel14.setText("Id Pakai");

        txt_idpakai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txt_idpakai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idpakaiActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 24)); // NOI18N
        jLabel15.setText("Jumlah");

        txtsatuan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtsatuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsatuanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel13)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_insert1)
                            .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_idpakai, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(txt_kodemenu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_idbahan, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel10)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(txt_namabahan, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel11)))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(spn_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(txtsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(41, 41, 41)
                                .addComponent(jLabel12)))))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel13)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_kodemenu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_idpakai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_idbahan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_namabahan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(spn_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtsatuan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(1, 1, 1)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(btn_insert1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_update, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(159, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        btn_tambahresep.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 24)); // NOI18N
        btn_tambahresep.setText("Tambah Resep");
        btn_tambahresep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahresepActionPerformed(evt);
            }
        });

        btn_databahan.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 24)); // NOI18N
        btn_databahan.setText("Data Bahan");
        btn_databahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_databahanActionPerformed(evt);
            }
        });

        btn_Laporan.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 24)); // NOI18N
        btn_Laporan.setText("Cetak Laporan");
        btn_Laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LaporanActionPerformed(evt);
            }
        });

        btn_Keluar.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 24)); // NOI18N
        btn_Keluar.setText("Keluar");
        btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_KeluarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/1623918370332.png"))); // NOI18N

        btn_tambahmenu1.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 24)); // NOI18N
        btn_tambahmenu1.setText("Tambah Menu");
        btn_tambahmenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahmenu1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 32, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_Laporan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_databahan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_tambahresep, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_tambahmenu1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btn_Keluar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(btn_tambahmenu1)
                .addGap(37, 37, 37)
                .addComponent(btn_tambahresep)
                .addGap(35, 35, 35)
                .addComponent(btn_databahan)
                .addGap(37, 37, 37)
                .addComponent(btn_Laporan)
                .addGap(34, 34, 34)
                .addComponent(btn_Keluar)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Coolvetica Condensed Rg", 1, 36)); // NOI18N
        jLabel1.setText("RESEP MENU");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(585, 585, 585)
                        .addComponent(jLabel1)))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(763, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:
        controller.delete();
       
        controller.isiTabelresep();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_idbahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idbahanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idbahanActionPerformed

    private void txt_idbahanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_idbahanKeyPressed
        // TODO add your handling code here:
           if(evt.getKeyCode()== KeyEvent.VK_ENTER){
            controller.getIdbahan();
        }
    }//GEN-LAST:event_txt_idbahanKeyPressed

    private void btn_insert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_insert1ActionPerformed
        // TODO add your handling code here:
        controller.input_resep();
        controller.isiTabelresep();
        controller.clearForm();
        try {
            controller.AutoIsiKodeTransaksi(this);
        } catch (SQLException ex) {
            Logger.getLogger(Resep_View.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btn_insert1ActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        controller.update();
        controller.isiTabelresep();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tbl_resepMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_resepMouseClicked
        // TODO add your handling code here:
         controller.onMouseClickTabelresep();
    }//GEN-LAST:event_tbl_resepMouseClicked

    private void txt_idpakaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idpakaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idpakaiActionPerformed

    private void txtsatuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsatuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsatuanActionPerformed

    private void tbl_resepKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_resepKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_resepKeyPressed

    private void txt_kodemenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kodemenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kodemenuActionPerformed

    private void btn_tambahmenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahmenu1ActionPerformed
        // TODO add your handling code here:
        Form_Inputmenu f = null;
        try {
            f = new Form_Inputmenu();
        } catch (SQLException ex) {
            Logger.getLogger(Resep_View.class.getName()).log(Level.SEVERE, null, ex);
        }
        f.setVisible(true);
        f.toFront();
        dispose();
        
    }//GEN-LAST:event_btn_tambahmenu1ActionPerformed

    private void btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_KeluarActionPerformed
        // TODO add your handling code here:
        FromUtama f = new FromUtama();
        f.setVisible(true);
        f.toFront();
        dispose();
    }//GEN-LAST:event_btn_KeluarActionPerformed

    private void btn_LaporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LaporanActionPerformed
        // TODO add your handling code here:
        controller.previewTransaksi();

    }//GEN-LAST:event_btn_LaporanActionPerformed

    private void btn_databahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_databahanActionPerformed
        // TODO add your handling code here:
        DatabahanAdmin_View f = null;
        try {
            f = new DatabahanAdmin_View();
        } catch (SQLException ex) {
            Logger.getLogger(Resep_View.class.getName()).log(Level.SEVERE, null, ex);
        }
        f.setVisible(true);
        f.toFront();
        dispose();
    }//GEN-LAST:event_btn_databahanActionPerformed

    private void btn_tambahresepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahresepActionPerformed
        // TODO add your handling code here:
        Resep_View f = null;
        try {
            f = new Resep_View();
        } catch (SQLException ex) {
            Logger.getLogger(Resep_View.class.getName()).log(Level.SEVERE, null, ex);
        }
        f.setVisible(true);
        f.toFront();
        dispose();
    }//GEN-LAST:event_btn_tambahresepActionPerformed

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
            java.util.logging.Logger.getLogger(Resep_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resep_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resep_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resep_View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Resep_View().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Resep_View.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Keluar;
    private javax.swing.JButton btn_Laporan;
    private javax.swing.JButton btn_databahan;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_insert1;
    private javax.swing.JButton btn_tambahmenu1;
    private javax.swing.JButton btn_tambahresep;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spn_jumlah;
    private javax.swing.JTable tbl_bahan;
    private javax.swing.JTable tbl_resep;
    private javax.swing.JTextField txt_idbahan;
    private javax.swing.JTextField txt_idpakai;
    private javax.swing.JTextField txt_kodemenu;
    private javax.swing.JTextField txt_namabahan;
    private javax.swing.JTextField txtsatuan;
    // End of variables declaration//GEN-END:variables
}
