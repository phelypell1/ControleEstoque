/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB_Conexao.ConexaoMySql;
import Model.Model_Cadastro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author phelype
 */
public class Controller_AutenticaLogin {
    public boolean ativo;
    private boolean validado;
    public String user_cad, mat, pass;
    
    public boolean ValidarLogin(int idLogin, String Login, String senha){
        Connection conn = DB_Conexao.DB_ControleUsuario.getConnection();
        PreparedStatement pst = null;
        ResultSet rs;
        String sql;
        
        try {
            sql = "SELECT L.IdLogin, L.Login, L.Senha, U.IdUsuario, U.Nome, U.Email, U.Cargo, U.Imagem, P.Perfil FROM Login AS L INNER JOIN" +
           "Usuario AS U ON U.IdLogin = L.IdLogin INNER JOIN Perfil AS P ON P.IdPerfil = U.IdPerfil WHERE L.Login = ? AND"
           +" L.Senha = ? AND U.EhAtivo = true";
        } catch (Exception e) {
            ConexaoMySql.CloseConection(conn, pst);
        }
        return false;
    }
   

    /*public boolean Autentica(String usuario, String senha){
        Connection conn = ConexaoMySql.getConnection();
        String sql = "select usuario, senha, ativo from login where usuario=? and senha=?";
        PreparedStatement pst;
        try {
            pst = conn.prepareStatement(sql);
            pst.setString(1, usuario);
            pst.setString(2, senha);
            ResultSet rs;
            rs = pst.executeQuery();
            if(rs.next()){
                mat = rs.getString("usuario");
                pass = rs.getString("senha");
                ativo = rs.getBoolean("ativo");
                validado = true;
            }else if(validado == false){
                  JOptionPane.showMessageDialog(null, "Atencão ! \n"
                          + "Usuário: "+mat+" não está ativo para login !");
            }else{
                
                pst.close();
                return validado;
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel conectar, entre em contato com o suporte !" +ex.getMessage());
        }
        return validado;
    }
    */

    public Iterable<Model_Cadastro> ValidarLogin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
