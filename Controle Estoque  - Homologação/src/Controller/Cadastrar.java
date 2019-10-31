package Controller;

import DB_Conexao.ConexaoMySql;
import Model.Model_Estoque;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class Cadastrar {
  
   public void CadastrarN(Model_Estoque cad){
       Connection conn = ConexaoMySql.getConnection();
       PreparedStatement pst = null;
       String sql;
       try {
           sql = "insert into Estoque(descricao, quant, data_cadastro, user_cad, status) "
                   + "values"
                   + "(?,?,?,?,?)";
           pst = conn.prepareStatement(sql);
           
           pst.setString(1, cad.getDescricao());
           pst.setInt(2, cad.getQuant());
           pst.setString(3, cad.getData_cadastro());
           pst.setString(4, cad.getUser_cad());
           pst.setString(5, cad.getStatus());
           pst.execute();
           JOptionPane.showMessageDialog(null, "Cadastrado com sucesso !");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "ERROR \n" +e.getMessage());
           ConexaoMySql.CloseConection(conn, pst);
       }
   }
   public void UpdateDB(Model_Estoque cad){
       Connection conn = ConexaoMySql.getConnection();
       PreparedStatement pst = null;
       String sql;
       try {
           sql = "update Estoque set descricao = ?, quant = ?, data_cadastro = ? ,user_cad = ? where id_estoque = ?";
           pst = conn.prepareCall(sql);
           pst.setString(1, cad.getDescricao());
           pst.setInt(2, cad.getQuant());
           pst.setString(3, cad.getData_cadastro());
           pst.setString(4, cad.getUser_cad());
           pst.setInt(5, cad.getId_estoque());
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Atenção ! Os dados foram atualizados !");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, "ERROR \n" +e.getMessage());
           ConexaoMySql.CloseConection(conn, pst);
       }
   }
}
