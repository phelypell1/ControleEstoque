/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB_Conexao.ConexaoMySql;
import Model.CadastroLogins;
import Model.Controle_Usuarios;
import Views.CadFuncionarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastroLogin {
    public static int id;
    public void cadastroLogin(CadastroLogins log ){
        Connection con = DB_Conexao.DB_ControleUsuario.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        
        try {
            sql = "insert into Login(Login, senha, dataCadastro, DataUIalteracao)"
                    + "values(?,?,?,default);";
            pst = con.prepareStatement(sql);
            pst.setString(1, log.getLogin());
            pst.setString(2, log.getSenha());
            pst.setDate(3, log.getDataCadastro());
            pst.execute();
            
            if (id == 0) {
                rs = pst.executeQuery("select max(idLogin) from Login");
                if (rs.next()) {
                    CadFuncionarios func = new CadFuncionarios();
                    id = rs.getInt(1);
                    func.pegaId(id);
                }
            }
            
            JOptionPane.showMessageDialog(null, "Acesso cadastrado com sucesso !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            ConexaoMySql.CloseConection(con, pst, rs);
        }
    }
    
    public void CadFuncionario(Controle_Usuarios user){
        Connection conn = DB_Conexao.DB_ControleUsuario.getConnection();
        PreparedStatement pst = null;
        String sql;
        
        try{
            sql = "insert into Usuario(IdLogin, IdPerfil, Nome, EhAtivo, dataCadastro, Email, Cargo, Regiao, Imagem)"
                    + "values(?,?,?,?,?,?,?,?,DEFAULT)";
            pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setInt(2, user.getIdPerfil().getIdPerfil());
            pst.setString(3, user.getNome());
            pst.setBoolean(4, user.isEhativo());
            pst.setDate(5, user.getDataCadastro());
            pst.setString(6, user.getEmail());
            pst.setString(7, user.getCargo());
            pst.setString(8, user.getRegiao());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "Dados cadastrado com sucesso !");
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR: "+ex.getMessage());
             ConexaoMySql.CloseConection(conn, pst );
        }
    }
}