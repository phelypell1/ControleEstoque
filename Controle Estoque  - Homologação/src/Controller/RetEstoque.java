/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DB_Conexao.ConexaoMySql;
import Model.RetEstoqueM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author phelype
 */
public class RetEstoque {
    
    public void retEstoque(RetEstoqueM ret){
        Connection con = ConexaoMySql.getConnection();
        PreparedStatement pst = null;
        String sql;
        
        try {
            sql = "insert into HtsEstoque(estoque_id, data_alteracao, editado, quant_retirada) "
                    + "values(?,?,?,?)";
            pst =  con.prepareStatement(sql);
            pst.setInt(1, ret.getEstoque_id().getId_estoque());
            pst.setDate(1, ret.getData_alteracao());
            pst.setString(2, ret.getEditado());
            pst.setInt(4, ret.getQuant_retirado());
            
            pst.execute();
            JOptionPane.showMessageDialog(null, "OK !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "OK !" +e.getMessage());
            ConexaoMySql.CloseConection(con, pst);
        }
    }
}
