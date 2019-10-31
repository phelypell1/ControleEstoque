package Model;

import java.sql.Date;

public class ModelLogin {
     private int idLogin;
     private String login;
     private String senha;
     private Date dataCadastro;
     private Date DataUIAlteracao;

    /**
     * @return the idLogin
     */
    public int getIdLogin() {
        return idLogin;
    }

    /**
     * @param idLogin the idLogin to set
     */
    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the dataCadastro
     */
    public Date getDataCadastro() {
        return dataCadastro;
    }

    /**
     * @param dataCadastro the dataCadastro to set
     */
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    /**
     * @return the DataUIAlteracao
     */
    public Date getDataUIAlteracao() {
        return DataUIAlteracao;
    }

    /**
     * @param DataUIAlteracao the DataUIAlteracao to set
     */
    public void setDataUIAlteracao(Date DataUIAlteracao) {
        this.DataUIAlteracao = DataUIAlteracao;
    }
     
     
     
    
    
    
    
}
