/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB_Conexao.ConexaoMySql;
import DB_Conexao.DB_ControleUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author phelype
 */
public class AutenticaLogin {
    public static String nome, perfil, versoes;
    public boolean validado;
   
    public boolean Validar(String login, String senha){
        Connection conn = DB_ControleUsuario.getConnection();
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sql;
        try {
            sql = "SELECT L.IdLogin, L.Login, L.Senha, U.IdUsuario, U.Nome, U.Email, U.Cargo, U.Imagem, P.Perfil FROM Login AS L INNER JOIN "+
           " Usuario AS U ON U.IdLogin = L.IdLogin INNER JOIN Perfil AS P ON P.IdPerfil = U.IdPerfil WHERE L.Login = ? AND "
           +" L.Senha = ? AND U.EhAtivo = true";
            pst = conn.prepareStatement(sql);
            pst.setString(1, login);
            pst.setString(2, senha);
            
            rs = pst.executeQuery();
            if(rs.next()){
                String user = rs.getString("login");
                String pass = rs.getString("senha");
                nome = rs.getString("Nome");
                perfil = rs.getString("Perfil");
                validado = true;
            }
        } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "Erro ao tentar conexão com o Banco de Dados");
         ConexaoMySql.CloseConection(conn,pst);
        }
        return validado;
    }
}
