package Controller;

import DB_Conexao.ConexaoMySql;
import Model.RegEnvios;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class DevolucaoClass {
    boolean resultado;
    public boolean BucasRelatorio(RegEnvios reg){
        Connection conn = ConexaoMySql.getConnection();
        PreparedStatement pst;
        String sql;
        try {
            /*sql = "select "*/
        } catch (Exception e) {
        }
        
        
        
        return resultado;
    }
}
