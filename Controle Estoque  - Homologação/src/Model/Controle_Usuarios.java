/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Image;
import java.sql.Date;

/**
 *
 * @author phelype
 */
public class Controle_Usuarios {
    ////dbo.Usuario variáveis/////
    private int idUsuario;
    private ModelLogin idLogin;
    private ModelPerfil idPerfil;
    private String nome;
    private boolean ehativo;
    private Date DataCadastro;
    private String data;
    private String Email;
    private String Cargo;
    private String regiao;
    private Image imagem;

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the idLogin
     */
    public ModelLogin getIdLogin() {
        return idLogin;
    }

    /**
     * @param idLogin the idLogin to set
     */
    public void setIdLogin(ModelLogin idLogin) {
        this.idLogin = idLogin;
    }

    /**
     * @return the idPerfil
     */
    public ModelPerfil getIdPerfil() {
        return idPerfil;
    }

    /**
     * @param idPerfil the idPerfil to set
     */
    public void setIdPerfil(ModelPerfil idPerfil) {
        this.idPerfil = idPerfil;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the ehativo
     */
    public boolean isEhativo() {
        return ehativo;
    }

    /**
     * @param ehativo the ehativo to set
     */
    public void setEhativo(boolean ehativo) {
        this.ehativo = ehativo;
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
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Cargo
     */
    public String getCargo() {
        return Cargo;
    }

    /**
     * @param Cargo the Cargo to set
     */
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    /**
     * @return the regiao
     */
    public String getRegiao() {
        return regiao;
    }

    /**
     * @param regiao the regiao to set
     */
    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    /**
     * @return the imagem
     */
    public Image getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(Image imagem) {
        this.imagem = imagem;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }
     
    
    
}
