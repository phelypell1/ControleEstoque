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
public class HtsEstoque {
    private int id_hts;
    private Model_Estoque idEstoque;
    private String item_retirado;
    private String data_alteracao;
    private String editado;
    private int quant_retirado;
    private String obs;

    /**
     * @return the id_hts
     */
    public int getId_hts() {
        return id_hts;
    }

    /**
     * @param id_hts the id_hts to set
     */
    public void setId_hts(int id_hts) {
        this.id_hts = id_hts;
    }

    /**
     * @return the idEstoque
     */
    public Model_Estoque getIdEstoque() {
        return idEstoque;
    }

    /**
     * @param idEstoque the idEstoque to set
     */
    public void setIdEstoque(Model_Estoque idEstoque) {
        this.idEstoque = idEstoque;
    }

    /**
     * @return the data_alteracao
     */
    public String getData_alteracao() {
        return data_alteracao;
    }

    /**
     * @param data_alteracao the data_alteracao to set
     */
    public void setData_alteracao(String data_alteracao) {
        this.data_alteracao = data_alteracao;
    }

    /**
     * @return the editado
     */
    public String getEditado() {
        return editado;
    }

    /**
     * @param editado the editado to set
     */
    public void setEditado(String editado) {
        this.editado = editado;
    }

    /**
     * @return the quant_retirado
     */
    public int getQuant_retirado() {
        return quant_retirado;
    }

    /**
     * @param quant_retirado the quant_retirado to set
     */
    public void setQuant_retirado(int quant_retirado) {
        this.quant_retirado = quant_retirado;
    }

    /**
     * @return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    /**
     * @return the item_retirado
     */
    public String getItem_retirado() {
        return item_retirado;
    }

    /**
     * @param item_retirado the item_retirado to set
     */
    public void setItem_retirado(String item_retirado) {
        this.item_retirado = item_retirado;
    }
}
