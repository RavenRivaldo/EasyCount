/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputstock;

import DAO.Bahan_DAO;
import static Databahan.Databahan_View.lbl_item;
import static Databahan.Databahan_View.lbl_low;
import static Databahan.Databahan_View.lbl_out;
import Koneksi_database.Koneksi;
import MODEL.Bahan_MODEL;
import static inputstock.Stock2_View.lbl_itemstok;
import static inputstock.Stock2_View.lbl_lowstok;
import static inputstock.Stock2_View.lbl_outstok;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Raven
 */
public class Stock_Controller {
    Stock2_View view;
    Bahan_MODEL model;
    Bahan_DAO dao;
    Connection con;
    Koneksi k;
    
    public Stock_Controller(Stock2_View view){
        this.view = view;
        dao = new Bahan_DAO();
        k = new Koneksi();
        try{
            con = k.getConnection();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
        public void Item() {
        try {
            String jumlah = dao.bahanAll();
         lbl_itemstok.setText(jumlah);
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
    
    public void ItemLow() {
        try {
            String jumlah = dao.bahanLow();
         lbl_lowstok.setText(jumlah);
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
    public void ItemOut() {
        try {
            String jumlah = dao.bahanOut();
         lbl_outstok.setText(jumlah);
        } catch (SQLException e) {
            e.printStackTrace();
        }
     }
    
    public void save(){
        model = new Bahan_MODEL();
        model.setId_bahan(view.getTxt_id().getText());
        model.setNama_bahan(view.getTxt_nama().getText());
        model.setJumlah_bahan(view.getTxt_jumlah().getText());
        model.setSatuan_bahan(view.getTxt_satuan().getText());
        model.setHarga_bahan(view.getTxt_harga().getText());
        model.setTanggal_masuk(view.getTxt_tgl().getText());
        
        try{
            dao.insert(con, model);
            javax.swing.JOptionPane.showMessageDialog(null, "Data Disimpan");
        }catch(SQLException | HeadlessException ex){
            javax.swing.JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
    }
}
