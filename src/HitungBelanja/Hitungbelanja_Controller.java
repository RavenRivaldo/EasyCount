/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HitungBelanja;


import DAO.Menu_Dao;
import DAO.Pemakaian_Dao;
import DAO.Pemesanan_DAO;
import DAO.Transaksi_DAO;
import Koneksi_database.Koneksi;
import MODEL.Admin_MODEL;
import MODEL.Menu_Model;
import MODEL.Pemesanan_Model;
import MODEL.Transaksi_Model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DINI
 */
public class Hitungbelanja_Controller {
    Hitungbelanja_View view;
    Connection con;
    Koneksi k;
    Admin_MODEL admodel;
    Menu_Model menumodel;
    Menu_Dao menudao;
    Pemesanan_Model pemmodel;
    Pemesanan_DAO pemdao;
    Transaksi_Model trmodel;
    Transaksi_DAO trdao;
    
    List<Pemesanan_Model> list;
    
      public Hitungbelanja_Controller(Hitungbelanja_View view){
        this.view = view;
       
        k = new Koneksi();
        try{
            con = k.getConnection();
            menudao = new Menu_Dao();
            pemdao = new Pemesanan_DAO();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void inputTransaksi(){
        trmodel = new Transaksi_Model();;
        trmodel.setId_pemesanan(view.gettxtId_pemesanan().getText());
        trmodel.setId_transaksi(null);
    }  
      
    public void inputPesanan(){
        list = new ArrayList<Pemesanan_Model>();
        pemmodel = new Pemesanan_Model();
        pemmodel.setId_pemesanan(view.gettxtId_pemesanan().getText());
        pemmodel.setTanggal_pesan(view.gettxtTgl().getText());
        pemmodel.setKode_menu(view.gettxtKodemenu().getText());
        pemmodel.setNama_menu(view.gettxtNamamenu().getText());
        pemmodel.setHarga_menu(view.getTxt_harga().getText());
        pemmodel.setJumlah_pesan(view.getSpn_jum().getValue().toString());
        
        try{
            list.add(pemmodel);
            javax.swing.JOptionPane.showMessageDialog(null, "Pesanan OK");
        }catch(Exception ex){
            javax.swing.JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
        }
    }  
      
    public void getKodemenu(){
        String kodemenu = view.gettxtKodemenu().getText();
        try{
            menumodel = menudao.getMenu(kodemenu);
            if(menumodel != null){
                view.gettxtKodemenu().setText(menumodel.getKode_menu());
                view.gettxtNamamenu().setText(menumodel.getNama_menu());
                view.getTxt_harga().setText(menumodel.getHarga_menu());
        } else {
                JOptionPane.showMessageDialog(null, "Menu tak da");
            }
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, ex);
            ex.printStackTrace();
        }
    }  
      
    public void isiTabelpesan(){
        try{
            DefaultTableModel model = (DefaultTableModel) view.getTbl_pesan().getModel();
            model.setRowCount(0);
            ResultSet rs = k.getQuery(con,"SELECT kode_menu, nama_menu, harga_menu,jumlah_pesan From pemesanan");
            
            while(rs.next()){
                Object data[] = {
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                };
                model.addRow(data);
                }
            } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Hitungbelanja_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    public void isiTabelDaftarMenu(){
        try{
            DefaultTableModel model = (DefaultTableModel) view.gettblDaftarMenu().getModel();
            model.setRowCount(0);
            ResultSet rs = k.getQuery(con,"SELECT kode_menu, nama_menu From menu");
            while(rs.next()){
                Object data[] = {
                    rs.getString(1),
                    rs.getString(2)
                };
                model.addRow(data);
                }
            } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(Hitungbelanja_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    }
