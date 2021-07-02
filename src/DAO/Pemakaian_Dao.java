/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Koneksi_database.Koneksi;
import MODEL.Menu_Model;
import MODEL.Pemakaian_Model;
import MODEL.Pemesanan_Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Raven
 */
public class Pemakaian_Dao {
        Connection con;
    
    public Pemakaian_Dao(){
        Koneksi k = new Koneksi();
        con = k.getConnection();
    }
    
     public void create (Pemakaian_Model model) throws SQLException
    {
       String sql = "insert into Pemakaian values(?,?,?,?,?,?)";
       PreparedStatement ps = con.prepareStatement(sql);
       ps.setString(1, model.getId_pakai());
       ps.setString(2, model.getKode_menu());
       ps.setString(3, model.getId_bahan());
       ps.setString(4, model.getNama_bahan());
       ps.setString(5, model.getJumlah_pakai());
       ps.setString(6, model.getSatuan());
       ps.executeUpdate();
    }
    
    public void update(Pemakaian_Model model) throws SQLException{
       String sql = "update pemakaian set kode_menu=?, id_bahan=?, nama_bahan=?, jumlah_pakai=? , satuan=?" + "where id_pakai=?";
       PreparedStatement ps = con.prepareStatement(sql);
       ps.setString(6, model.getId_pakai());
       ps.setString(1, model.getKode_menu());
       ps.setString(2, model.getId_bahan());
       ps.setString(3, model.getNama_bahan());
       ps.setString(4, model.getJumlah_pakai());
       ps.setString(5, model.getSatuan());
       ps.executeUpdate(); 
       
    }
    
     public void delete(Connection con, Pemakaian_Model model) throws SQLException{
        String sql = "delete from pemakaian where id_pakai=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, model.getId_pakai());
        ps.executeUpdate();
    }
    
    public Pemakaian_Model getpakai(String kode) throws SQLException{
        String sql = "select * from pemakaian where id_pakai=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, kode);
        Pemakaian_Model model = null;
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            model = new Pemakaian_Model();
            model.setId_pakai(rs.getString(1));
            model.setKode_menu(rs.getString(2));
            model.setId_bahan(rs.getString(3));
            model.setNama_bahan(rs.getString(4));
            model.setJumlah_pakai(rs.getString(5));
            model.setSatuan(rs.getString(6));
        }
        return model;
    }
    
    
}
