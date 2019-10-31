/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;

/**
 *
 * @author phelype
 */
public class Controle_Login {
    
    private int idLogin;
    private String Login;
    private String senha;
    private Date DataCadastro;
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
     * @return the Login
     */
    public String getLogin() {
        return Login;
    }

    /**
     * @param Login the Login to set
     */
    public void setLogin(String Login) {
        this.Login = Login;
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
     * @return the DataCadastro
     */
    public Date getDataCadastro() {
        return DataCadastro;
    }

    /**
     * @param DataCadastro the DataCadastro to set
     */
    public void setDataCadastro(Date DataCadastro) {
        this.DataCadastro = DataCadastro;
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
