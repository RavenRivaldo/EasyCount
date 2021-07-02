/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input_Menu;

import DAO.Menu_Dao;
import Koneksi_database.Koneksi;
import MODEL.Menu_Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author User
 */
public class Menu_Controller {
    Form_Inputmenu view;
    Menu_Model model;
    Menu_Dao dao;
    Connection con;
    Koneksi k;
    
    public Menu_Controller(Form_Inputmenu view){
        this.view = view;
        dao = new Menu_Dao();
        k = new Koneksi();
        try{
            con = k.getConnection();
        } catch (Exception ex){
            JOptionPane.showMessageDialog(view, ex.getMessage());
        }
    }
    
    public void input_menu(){
        model = new Menu_Model();
        model.setKode_menu(view.getTxt_kode().getText());
        model.setNama_menu(view.getTxt_nama().getText());
        model.setHarga_menu(view.getTxt_harga().getText());
        if (view.getCbxmakanan().isSelected())
        { model.setJenis_menu(view.getCbxmakanan().getText());
        
        }
        else if (view.getCbxminuman().isSelected())
        { model.setJenis_menu(view.getCbxminuman().getText());
        
        }
       
        try{
            dao.create(model);
            javax.swing.JOptionPane.showMessageDialog(null, "Menu Berhasil Ditambahkan");
        }catch(Exception ex){
            javax.swing.JOptionPane.showMessageDialog(null, "Error"+ex.getMessage());
        }
        
    }
    
    public void clear(){
    view.getTxt_kode().setText("");
    view.getTxt_nama().setText("");
    view.getTxt_harga().setText("");
}
    public void previewTransaksi() {
        HashMap parameter = new HashMap();
        JasperPrint jasperPrint = null;
        try {
            jasperPrint = JasperFillManager.fillReport("report/transaksi.jasper", parameter, con);
            JasperViewer.viewReport(jasperPrint, false);
        } catch (Exception ex) {
            System.out.print(ex.toString());
            //Logger.getLogger(formlaporan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
     public void AutoIsiKodeMenu(Form_Inputmenu view) throws SQLException{
        try{
            String sql = "select max(kode_menu) from menu";
            PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while (rs.next()){
                 int a = rs.getInt(1);
                 view.getTxt_kode().setText(""+Integer.toString(a+1));
                 
             } 
         } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "error" +ex.getMessage());
        }
    }
      public void isiTabelDaftarMenu(){
        try{
            DefaultTableModel model = (DefaultTableModel) view.getTbl_menu().getModel();
            model.setRowCount(0);
            ResultSet rs = k.getQuery(con,"SELECT * From menu");
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
            java.util.logging.Logger.getLogger(Menu_Controller.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}