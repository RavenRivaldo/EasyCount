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
import static HitungBelanja.Hitungbelanja_View.lbl_tot;
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
import javax.swing.table.TableModel;

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
            trdao = new Transaksi_DAO();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    

    public void inputTransaksi(){
        trmodel = new Transaksi_Model();
        pemmodel = new Pemesanan_Model();
        trmodel.setId_pemesanan(view.gettxtId_pemesanan().getText());
        trmodel.setUangbayar(view.getTxt_bayar().getText());
        trmodel.setUangkembali(view.getTxt_kembali().getText());
        double total =(pemmodel.getJumlah_pesan() * pemmodel.getHarga_menu());
        trmodel.setTotalbelanja((int) total);
        try{
            trdao.create(trmodel);
            javax.swing.JOptionPane.showMessageDialog(null, "Transaksi succses");
        } catch(Exception ex){
            javax.swing.JOptionPane.showMessageDialog(null, "error" + ex.getMessage());
        }
    }  
      
    public void inputPesanan() throws SQLException{
        pemmodel = new Pemesanan_Model();
        pemmodel.setId_pemesanan(view.gettxtId_pemesanan().getText());
        pemmodel.setTanggal_pesan(view.gettxtTgl().getText());
        pemmodel.setKode_transaksi(Integer.parseInt(view.getTxt_kodetransaksi().getText()));
        pemmodel.setKode_menu(view.gettxtKodemenu().getText());
        pemmodel.setNama_menu(view.gettxtNamamenu().getText());
        pemmodel.setHarga_menu(Integer.parseInt(view.getTxt_harga().getText()));
        pemmodel.setJumlah_pesan(Integer.parseInt(view.getSpn_jum().getValue().toString()));
        pemmodel.setTotal(view.getTxt_total().getText());
        try{
            pemdao.create(pemmodel);
            javax.swing.JOptionPane.showMessageDialog(null, "Pesanan OK");
        }catch(Exception ex){
            javax.swing.JOptionPane.showMessageDialog(null, "Error" + ex.getMessage());
            ex.printStackTrace();
        } finally{
            Total(view);
        }
    }  
      
  /*    private void sum(){
        DefaultTableModel dataModel = (DefaultTableModel) view.getTbl_pesan().getModel();
        int jumlah = dataModel.getRowCount();
        double total =0;
        
        for (int i = 0; i < jumlah; i++) {
            double jumlah = Double.valueOf(dataModel.getValueAt(i, 1).toString());
            double harga = Double.valueOf(dataModel.getValueAt(i, 2).toString());
            sumBerat += dataBerat;
            sumTinggi += dataTinggi;
        }
        jumlah_data.setText(Integer.toString(jumlah));
        sum_berat.setText(Double.toString(sumBerat));
        sum_tinggi.setText(Double.toString(sumTinggi));    
    }
    */
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
    
    public void Tanggal(Hitungbelanja_View view){
        java.util.Date now = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("yyyy-MM-dd");
        view.gettxtTgl().setText(kal.format(now));
    }
    
     public void Total(Hitungbelanja_View hit) throws SQLException {
        int JumlahBaris = hit.getTbl_pesan().getRowCount();
        int Total = 0;
        int Harga_Barang;
        int jumlah;
        TableModel tableModel;
        tableModel = hit.getTbl_pesan().getModel();
        for (int i = 0; i < JumlahBaris; i++) {
            Harga_Barang = Integer.parseInt(tableModel.getValueAt(i, 2).toString());
            jumlah = Integer.parseInt(tableModel.getValueAt(i, 3).toString());
            Total = (Total + (Harga_Barang * jumlah));
            hit.getTxt_total().setText(String.valueOf(Total));
        }
    }
    public void getTotalbelanja(){
        String id = (view.gettxtId_pemesanan().getText());
        try{
            pemmodel = pemdao.getTotal(id);
            if(pemmodel != null){
                view.gettxtId_pemesanan().setText(pemmodel.getId_pemesanan());
                view.getTxt_total().setText(pemmodel.getTotal());
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
            pemmodel = new Pemesanan_Model();
            ResultSet rs = k.getQuery(con,"SELECT kode_menu, nama_menu, harga_menu,jumlah_pesan From pemesanan where kode_transaksi = "
            + view.getTxt_kodetransaksi().getText());
            view.getTxt_kodetransaksi().setText(pemmodel.getKode_transaksi()+ "");
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
