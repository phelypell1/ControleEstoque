package Controller;

import DB_Conexao.ConexaoMySql;
import Model.RegEnvios;
import Model.RegItens;
import Views.EnviosEquipamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Controller_RegEnvios {

    public static int id;

    public void CadRegEnvios(RegEnvios regenv) {
        Connection conn = ConexaoMySql.getConnection();
        PreparedStatement pst;
        String sql;
        try {
            sql = "insert into RegEnvios (cidade, transp, data_envio, enviadoPor, destinatario, devolvido)"
                    + "values"
                    + "(?,?,?,?,?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, regenv.getCidade());
            pst.setInt(2, regenv.getTransp().getId_transp());
            pst.setString(3, regenv.getData_envio());
            pst.setString(4, regenv.getEnviadopor());
            pst.setString(5, regenv.getDestinatario());
            pst.setBoolean(6, regenv.isDevolvido());
            pst.execute();

            while (id == 0) {
                ResultSet rs = pst.executeQuery("select max(id_envio) from RegEnvios");
                if (rs.next()) {
                    EnviosEquipamento h = new EnviosEquipamento();
                    id = rs.getInt(1);
                    h.pegaId(id);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            ConexaoMySql.CloseConection(conn);
        }
    }

    public void CadRegItens(RegItens itens) {
        Connection conn = ConexaoMySql.getConnection();
        PreparedStatement pst = null;
        String sql;
        try {
            sql = "insert into RegItens(envio_id, descricao_item, tipo_item)"
                    + "values"
                    + "('"+id+"',?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1, itens.getDescricao());
            pst.setInt(2, itens.getItem().getId_itens());
            pst.execute();

            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso !");

        } catch (Exception e) {
            ConexaoMySql.CloseConection(conn,pst);
        }
    }
}
