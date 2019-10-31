/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB_Conexao.ConexaoMySql;
import Model.ItensReg;
import Model.ModelPerfil;
import Model.ModelTransportadora;
import Model.Model_TipoCad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author phelype
 */
public class CarregaCombox {
    
    public List<Model_TipoCad> ListarTipo(){
        Connection con = ConexaoMySql.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
       
        ArrayList<Model_TipoCad> Listar = new ArrayList<>();
        
        try {
            sql = "select * from tipoEquipamento";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                Model_TipoCad cad = new Model_TipoCad();
                cad.setCodigo_tipo(rs.getInt("codigo_tipo"));
                cad.setTipo(rs.getString("tipo"));
                Listar.add(cad);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
             ConexaoMySql.CloseConection(con, pst, rs);
        }
        return Listar;
    }
    
   
    public List<ModelTransportadora> ListarTransportadora(){
        Connection con = ConexaoMySql.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
       
        ArrayList<ModelTransportadora> Model = new ArrayList<>();
        
        try {
            sql = "select * from Transportadora ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                ModelTransportadora model = new ModelTransportadora();
                model.setId_transp(rs.getInt("id_transp"));
                model.setTransportadora(rs.getString("transportadora"));
                model.setAtiva(rs.getBoolean("ativa"));
                model.setData_cadastro(rs.getString("data_cadastro"));
                Model.add(model);
            }
        } catch (Exception e) {
             ConexaoMySql.CloseConection(con, pst, rs);
        }
        return Model;
    }
    public List<ItensReg> ListarItens(){
        Connection con = ConexaoMySql.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
       
        ArrayList<ItensReg> Model = new ArrayList<>();
        
        try {
            sql = "select * from Itens_Reg ";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                ItensReg model = new ItensReg();
                model.setId_itens(rs.getInt("id_itens"));
                model.setItem(rs.getString("item"));
                model.setData_cadastro(rs.getString("data_cadastro"));
                Model.add(model);
            }
        } catch (Exception e) {
             ConexaoMySql.CloseConection(con, pst, rs);
        }
        return Model;
    }
    public List<ModelPerfil> ListarPerfil(){
        Connection con = DB_Conexao.DB_ControleUsuario.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
       
        ArrayList<ModelPerfil> Model = new ArrayList<>();
        
        try {
            sql = "select * from Perfil";
            pst = con.prepareStatement(sql);
            rs = pst.executeQuery();
            
            while(rs.next()){
                ModelPerfil model = new ModelPerfil();
                model.setIdPerfil(rs.getInt("idPerfil"));
                model.setPerfil(rs.getString("Perfil"));
                model.setDataCadastro(rs.getDate("DataCadastro"));
                Model.add(model);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
             ConexaoMySql.CloseConection(con, pst, rs);
        }
        return Model;
    }
}